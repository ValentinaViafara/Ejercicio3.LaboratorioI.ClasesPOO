
package ejercicio3.laboratorioi.clasespoo;


public class TravelAgency {
    private String name;
    private Airport[] airports;
    private Travel[] travels;
    private Hotel[] hotels;
    
    
    public TravelAgency(String name){
        this.name=name;
        airports= new Airport[4];
        travels= new Travel[10];
        hotels= new Hotel[5];
        
        
    }

    public boolean registerAirport(Airport airport){
        boolean proceso=false;
        
        for(int i=0; i<airports.length;i++){
             if(airports[i]==airport){
                 proceso= false;
                 break;
             }else{
                 proceso=true;
             }   
            }
        
        
        if(proceso){
            for(int j=0; j<airports.length; j++){
                if(airports[j]!=null){
                    airports[j]=airport;
                    proceso=true;
                    break;
                }else{
                    proceso=false;
                    break;
                }
            }
        }
        return proceso;
    }
    
    
    public boolean registerTravel(Travel travel){
        boolean proceso= false;
        
        for(int i=0; i<travels.length;i++){
            if(travels[i]==travel){
                proceso=false;
                break;
            }else{
                proceso=true;
            }
        }
        
        
        if(proceso){
            for(int j=0; j<travels.length;j++){
                if(travels[j]==null){
                    travels[j]=travel;
                    proceso=true;
                    break;
                }else{
                    proceso=false;
                }
            }
            
        
        
    }
        return proceso;
    }
    
    public boolean registerHotel(Hotel hotel){
        boolean proceso=false;
        
        for(int i=0; i<hotels.length;i++){
            if(hotels[i]==hotel){
               proceso=false;
               break;
            }else{
                proceso=true;
            }
            
        }
        
        if(proceso){
            for(int j=0; j<hotels.length;j++){
                if(hotels[j]==null){
                    hotels[j]=hotel;
                    proceso=true;
                }else{
                    proceso=false;
                }
                
            }
        }
    return proceso;
    }
    
    
    @Override
   public String toString(){
       String Viajes="\n";
    
           for (int i = 0; i < travels.length; i++) {
              if(travels[i]!=null){
                  
                  Viajes+=(i+1)+".VIAJE:  \n";
                  Viajes+=travels[i].toString();
                  Viajes+="\n\n\n";
                   
              }
               
           } 
       return Viajes;
   } 
    
    
    public String travelDurationShorter(){
        String viaje="\n";
        int aux=0;
        int posicion=-1;

        for(int i=0; i<travels.length;i++){
            if(travels[i]!=null){
            
            if(aux==0 ||  aux>travels[i].getDuracion()){
                aux=travels[i].getDuracion();
                posicion=i;
            }    
            }
        }

        if(posicion!=-1){
            viaje+="El viaje con menor duracion empieza= "+travels[posicion].getStart().toGMTString()+".   Y dura= "+travels[posicion].getDuracion()+".";
        }
        
        return viaje;
    }
    
    
    public String travelDurationLonger(){
        String viaje="\n";
        int aux=0;
        int posicion=-1;
        
        for(int i=0; i<travels.length;i++){
            if(travels[i]!=null){
                
              if(aux<travels[i].getDuracion()){
                  aux=travels[i].getDuracion();
                  posicion=i;
              }  
            }
        }
        
        if(posicion!=-1){
            
            viaje+="El viaje de mayor duración empieza= "+travels[posicion].getStart().toGMTString()+".   Y dura= "+travels[posicion].getDuracion();
        }
        
        return viaje;
    }
    
    
   public void adicionarHotel(Hotel hotel){
       for(int i=0;i<hotels.length;i++){
           if(hotels[i]==null){
           hotels[i]= hotel;
           break;
           }
       }
       
   }
   
   
   public void adicionarViajes(Travel travel){
       for(int i=0; i<travels.length;i++){
           if(travels[i]==null){
            travels[i]=travel;
            break;
           }
           
       }
       
   }
    
    
    
    
    
    
    
    public String getName() {
        return name;
    }

    public Airport[] getAirports() {
        return airports;
    }

    public Travel[] getTravels() {
        return travels;
    }

    public Hotel[] getHotels() {
        return hotels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAirports(Airport[] airports) {
        this.airports = airports;
    }

    public void setTravels(Travel[] travels) {
        this.travels = travels;
    }

    public void setHotels(Hotel[] hotels) {
        this.hotels = hotels;
    }
    
    
    
}
