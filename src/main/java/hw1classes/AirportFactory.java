package hw1classes;

import exception.BadParameterException;
import exception.NullParameterException;
import java.util.*;

public class AirportFactory {
    private static Map<String, Airport> airportMap = new HashMap<>();

    public static Airport createAirport(String name) throws NullParameterException, BadParameterException{
        if (airportMap.containsKey(name))
            return airportMap.get(name);

        Airport airport = new Airport(name);
        airportMap.put(name, airport);
        return airport;
    }
}
