package hw1classes;

import exception.NullParameterException;

import java.util.Date;
import java.util.Objects;

public class Flight {
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private String flightNumber;
    private Date departureTime;

    public Flight(Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime)
            throws NullParameterException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber(flightNumber);
        setDepartureTime(departureTime);
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline newAl) throws NullParameterException {
        if (newAl == null){
            throw new NullParameterException("Null value passed for Airline in Flight");
        }
        this.airline = newAl;
    }

    public Airport getOrigin() {
        return origin;
    }

    public void setOrigin(Airport newOrig) throws NullParameterException {
        if (newOrig == null){
            throw new NullParameterException("Null value passed for origin Airport");
        }
        this.origin = newOrig;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport newDest) throws NullParameterException {
        if (newDest == null){
            throw new NullParameterException("Null value passed for destination Airport");
        }
        this.destination = newDest;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String newFn) throws NullParameterException {
        if (newFn == null){
            throw new NullParameterException("Null value passed for Flight Number");
        }
        this.flightNumber = newFn;
    }


    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date newDt) throws NullParameterException{
        if (newDt== null){
            throw new NullParameterException("Null value passed for Departure time");
        }
        this.departureTime = newDt;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline=" + getAirline() +
                ", origin=" + getOrigin() +
                ", destination=" + getDestination() +
                ", flightNumber='" + getFlightNumber() + '\'' +
                ", departureTime=" + getDepartureTime() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return getAirline().equals(flight.getAirline()) && getOrigin().equals(flight.getOrigin()) && getDestination().equals(flight.getDestination()) && getFlightNumber().equals(flight.getFlightNumber()) && getDepartureTime().equals(flight.getDepartureTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAirline(), getOrigin(), getDestination(), getFlightNumber(), getDepartureTime());
    }
}
