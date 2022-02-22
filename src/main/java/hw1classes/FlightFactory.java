package hw1classes;

import exception.BadParameterException;
import exception.NullParameterException;

import java.util.*;

public class FlightFactory {
    private FlightFactory() {}

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination) throws NullParameterException, BadParameterException {
        if (type.equals("commercial")) return new CommercialFlight(airline, origin, destination);
        else if (type.equals("passenger")) return new PassengerFlight(airline, origin, destination, 100);
        else return null;
    }
}
