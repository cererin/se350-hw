package hw1classes;

import exception.BadParameterException;
import exception.NullParameterException;

import java.util.*;

public class FlightFactory {
    private FlightFactory() {}

    public static CommercialFlight createFlight(String type, Airline airline, Airport origin, Airport destination) throws NullParameterException {
        if (type.equals("commercial")) return new CommercialFlight(airline, origin, destination);
        else return null;
    }
}
