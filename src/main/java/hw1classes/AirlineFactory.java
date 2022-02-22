package hw1classes;

import exception.BadParameterException;
import exception.NullParameterException;
import java.util.*;

public class AirlineFactory {
    private static Map<String, Airline> airlineMap = new HashMap<>();

    public static Airline createAirline(String name) throws NullParameterException, BadParameterException{
        if (airlineMap.containsKey(name))
            return airlineMap.get(name);

        Airline airline = new Airline(name);
        airlineMap.put(name, airline);
        return airline;
    }
}
