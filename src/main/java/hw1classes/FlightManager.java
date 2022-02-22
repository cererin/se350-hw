package hw1classes;

import exception.BadParameterException;
import exception.NullParameterException;

import java.util.*;

public final class FlightManager {
    private static FlightManager fmInstance;
    List<Flight> flights = new ArrayList<Flight>();

    public static FlightManager getInstance() throws Exception {
        if (fmInstance == null) fmInstance = new FlightManager();
        return fmInstance;
    }

    private FlightManager() {}

    public Flight createFlight(String type, Airline airline, Airport origin, Airport destination) throws NullParameterException, BadParameterException {
        Flight newFlight = FlightFactory.createFlight(type, airline, origin, destination);
        flights.add(newFlight);
        return newFlight;
    }

    public Flight getFlightByNumber(UUID flightNum) throws Exception {
        for (Flight flight : flights){
            if ((flightNum.toString()).equals(flight.getFlightNumber())) {
                return flight;
            }
        }

        throw new Exception("Flight Number" + flightNum + " not found.");
    }
}
