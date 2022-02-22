package hw1classes;

import exception.NullParameterException;

import java.util.Date;
import java.util.UUID;

public class Flight {
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private UUID flightNumber;
    private Date departureTime;

    public Flight() {}

    private void setFlightNumber() {}

    private void setDepartureTime() {}

    private void setDestination() {}

    private void setOrigin() {}

    private void setAirline() {}

    public String getAirline() {
        return airline.toString();
    }

    public String getOrigin() {
        return origin.toString();
    }

    public String getDestination() {
        return destination.toString();
    }

    public String getFlightNumber() {
        return flightNumber.toString();
    }

    public String getDepartureTime() {
        return departureTime.toString();
    }
}
