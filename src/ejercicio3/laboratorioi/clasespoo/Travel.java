
package ejercicio3.laboratorioi.clasespoo;

import java.util.Date;


public class Travel {
    
    private Date start= new Date();
    private int duracion;
    private BookedFlight Outbound;
    private BookedFlight Return;
    private Hotel hotel;

    public Travel(Date start, int duracion) {
        this.start = start;
        this.duracion = duracion;
     }
    
    
    @Override
    public String toString (){
        String datosViaje="";
        if(Outbound !=null && Return!=null ){
       datosViaje= "Datos reserva de vuelo de salida:\n ";
        datosViaje+="   " +Outbound.toString()+"\n";
        
        datosViaje="Datos reserva de vuelo de retorno: \n";
        datosViaje+="   "+Return.toString()+"\n";
    }
    
    return datosViaje;
    }    
    
    
    
    
    
    
    
    
    
    
    

    public Date getStart() {
        return start;
    }

    public int getDuracion() {
        return duracion;
    }

    public BookedFlight getOutbound() {
        return Outbound;
    }

    public BookedFlight getReturn() {
        return Return;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setOutbound(BookedFlight Outbound) {
        this.Outbound = Outbound;
    }

    public void setReturn(BookedFlight Return) {
        this.Return = Return;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
    
    
    
}
