
package ejercicio3.laboratorioi.clasespoo;


import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args ){
       Scanner entrada= new Scanner(System.in);
        String control;
        
        System.out.println("BIENVENIDO ");
        System.out.println("1.Registrar Agencia de Viajes. ");
        System.out.println("r. salir");
        System.out.println("PRESIONE LA TECLA DE LA OPCION QUE DESEA    \n");
        control= entrada.next();
        System.out.println("\n\n\n");
       
        
        if("1".equals(control)){
            String nombreAgencia;
        
            System.out.println("1.REGISTRAR AGENCIA DE VIAJES");
            System.out.println("Digite nombre \n");
            nombreAgencia=entrada.next();
            System.out.println("\n\n\n");
            
            TravelAgency agencia= new TravelAgency(nombreAgencia);
            while("1".equals(control)){
             
            String control1;
                System.out.println("MENU PRINCIPAL\n\n");   
             System.out.println("1.1 Registrar hoteles.  PRESIONE 1");
             System.out.println("1.2 Registrar viajes.   PRESIONE 2");
             System.out.println("1.3 Registrar hoteles.   PRESIONE 3");
             System.out.println("1.4 Visualizar información de la agencia de viajes.    PRESIONE 4");
             System.out.println("r.Salir  \n");
             control1= entrada.next();
                System.out.println("\n\n\n");
             
             switch(control1){
                 case "1":
                 String nombre;
                 String adress;
                     System.out.println("1.1 REGISTRAR HOTELES.");
                     System.out.println("Digite nombre del hotel");
                     nombre= entrada.next();
                     System.out.println("Digite direccion del hotel");
                     adress=entrada.next();
                     Hotel hotel= new Hotel(nombre, adress);
                     System.out.println("Hotel registrado\n\n\n");
                     agencia.adicionarHotel(hotel);
                     
                     
                    break;
                 case "2":
                     int dia;
                     int mes;
                     int año;
                     int duracion;
                     
                     System.out.println("2.REGISTRAR VIAJES");
                     System.out.println("Digite la fecha: "+"\n"+ " dia= ");
                    dia= entrada.nextInt();
                     System.out.println(" mes= ");
                     mes=entrada.nextInt();
                     System.out.println(" año= ");
                     año= entrada.nextInt();
                     System.out.println("Digite duración= ");
                     duracion=entrada.nextInt();
                     Date date= new Date(año,mes,dia);
                     String opcion;
                     
                     Travel viaje= new Travel(date, duracion);
                     
                     agencia.adicionarViajes(viaje);
                     
                     System.out.println("Viaje registrado\n");
                     System.out.println("2.1 Registrar reserva de vuelo de salida Registar reserva de vuelo de retorno        PRESIONE 1");
                     System.out.println("r. Salir");
                     System.out.println("PRECIONE CUALQUIER TECLA PARA VOLVER AL MENU PRINCIPAL");
                     System.out.println("PRESIONE LA TECLA DE LA OPCION QUE QUIERE\n");
                     opcion= entrada.next();
                     System.out.println("\n\n\n");
                     
                     if("1".equals(opcion)){
                         
                         int numeroVuelo;
                         int dia1;
                         int mes1;
                         int año1;
                         int dia2;
                         int mes2;
                         int año2;
                         String descripcion;
                         String descripcion1;
                     
                         System.out.println("1.Digite reserva de vuelo de salida");
                         System.out.println("-Digite numero de vuelo= ");
                         numeroVuelo=entrada.nextInt();
                         System.out.println("-Fecha de salida: ");
                         System.out.println("dia=");
                         dia1=entrada.nextInt();
                         System.out.println("mes=");
                         mes1=entrada.nextInt();
                         System.out.println("año");
                         año1=entrada.nextInt();
                         System.out.println("-Fecha de llegada");
                         System.out.println("dia");
                         dia2=entrada.nextInt();
                         mes2=entrada.nextInt();
                         System.out.println("año=");
                         año2=entrada.nextInt();
                         System.out.println("-Aeropuerto de salida");
                         System.out.println("descripcion=");
                         descripcion=entrada.next();
                         System.out.println("-Aeropuerto de llegada");
                         System.out.println("descripcion=");
                         descripcion1=entrada.next();
                         System.out.println("Reserva de vuelo de salida registrada\n");
                         
                         BookedFlight salida= new BookedFlight(numeroVuelo, new Date(año1,mes1,dia1), new Date(año2,mes2,dia2), new Airport(descripcion), new Airport(descripcion1));
                    
                     
                         
                         int numeroVuelo1;
                         int dia3;
                         int mes3;
                         int año3;
                         int dia4;
                         int mes4;
                         int año4;
                         String descripcion2;
                         String descripcion3;
                         
                         System.out.println("2.Digite reserva de vuelo de retorno");
                         System.out.println("-Digite numero de vuelo= ");
                         numeroVuelo1=entrada.nextInt();
                         System.out.println("-Fecha de salida: ");
                         System.out.println("dia=");
                         dia3=entrada.nextInt();
                         System.out.println("mes=");
                         mes3=entrada.nextInt();
                         System.out.println("año");
                         año3=entrada.nextInt();
                         System.out.println("-Fecha de llegada");
                         System.out.println("dia=");
                         dia4=entrada.nextInt();
                         System.out.println("mes=");
                         mes4=entrada.nextInt();
                         System.out.println("año=");
                         año4=entrada.nextInt();
                         System.out.println("-Aeropuerto de salida");
                         System.out.println("descripcion=");
                         descripcion2=entrada.next();
                         System.out.println("-Aeropuerto de llegada");
                         System.out.println("descripcion=");
                         descripcion3=entrada.next();
                         System.out.println("Reserva de vuelo de retorno registrado\n");
                         System.out.println("PRESIONE CUALQUIER TECLA PARA VOLVER AL MENU PRINCIPAL");
                         
                         BookedFlight retorno= new BookedFlight(numeroVuelo1, new Date(año3,mes3,dia3), new Date(año4,mes4,dia4), new Airport(descripcion2), new Airport(descripcion3));

                         viaje.setOutbound(salida);
                         viaje.setReturn(retorno);
                         
                     }else if(opcion=="r"){
                         control="r";
                         
                     }
                     
                     
                     
                     
                     break;
                 
                 case "3":
                     
                    
                     break;
                     
                 case "4":
                     String opcion1;
                     
                     System.out.println("4.VISUALIZAR INFORMACION DE LA AGENCIA DE VIAJES");
                     System.out.println("4.1 Listar viajes de la agencia.    PRESIONE 1");
                     System.out.println("4.2 Listar viaje con menor duracion.   PRESIOE 2");
                     System.out.println("4.3 Listar viaje con mayor duracion.   PRESIONE 3");
                     System.out.println("r. Para salir");
                     System.out.println("PRESIONE CUALQUIER TECLA DIFERENTE PARA VOLVER AL MENU PRINCIPAL  \n");
                     opcion1= entrada.next();
                     System.out.println("\n\n\n");
                     
                     switch(opcion1){
                         
                         case "1":
                             System.out.println("4.1 LISTAR VIAJES DE LA AGENCIA");
                             System.out.println(agencia.toString()+"\n\n\n");
                             System.out.println(agencia.getName());
                          break;
                         
                         case "2":
                             System.out.println("4.2 LISTAR VIAJE CON MENOR DURACIÓN");
                             System.out.println(agencia.travelDurationShorter()+"\n\n\n");
                             break;
                             
                         case "3":
                             System.out.println("4.3 LISTAR VIAJE CON MAYOR DURACION");
                             System.out.println(agencia.travelDurationLonger()+"\n\n\n");
                         
                         case "r":
                             
                          control="r";
                         
                         default:
                     }
                     
                     
                     
                     
                     break;
                     
                 case "r":
                     control="r";
                    break;
                    
                 default:
                     
             }
            }
        }
      
        
    
    }

}