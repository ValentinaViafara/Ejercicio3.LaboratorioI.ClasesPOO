
package ejercicio3.laboratorioi.clasespoo;

import java.util.Date;


public class BookedFlight {
   
    private int flightNumber;
    private Date departure= new Date();
    private Date arrival= new Date();
    private Airport from;
    private Airport to;

    public BookedFlight(int flightNumber, Date departure, Date arrival, Airport from, Airport to) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.from = from;
        this.to = to;
        
    }

    @Override
    public String toString(){
        String datosReserva;
        
        datosReserva="Numero de vuelo: "+flightNumber+".  Aeropuerto de salida= "+from.getDescripcion()+".  Aeropuerto de llegada= "+ to.getDescripcion();
        
        
        return datosReserva;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public int getFlightNumber() {
        return flightNumber;
    }

    public Date getDeparture() {
        return departure;
    }

    public Date getArrival() {
        return arrival;
    }

    public Airport getFrom() {
        return from;
    }

    public Airport getTo() {
        return to;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public void setFrom(Airport from) {
        this.from = from;
    }

    public void setTo(Airport to) {
        this.to = to;
    }
    
    
                                                     
}   
