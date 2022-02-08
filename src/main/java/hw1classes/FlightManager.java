package hw1classes;

import exception.BadParameterException;
import exception.NullParameterException;

import java.util.*;

public final class FlightManager {
    private static FlightManager fmInstance;
    List<CommercialFlight> flights = new ArrayList<CommercialFlight>();

    public static FlightManager getInstance() throws Exception {
        if (fmInstance == null) fmInstance = new FlightManager();
        return fmInstance;
    }

    private FlightManager() {}

    public void createFlight(Airline airline, Airport origin, Airport destination) throws NullParameterException {
        CommercialFlight newFlight = FlightFactory.createFlight("commercial", airline, origin, destination);
        flights.add(newFlight);
    }

    public CommercialFlight getFlightByNumber(UUID flightNum) throws Exception {
        for (CommercialFlight flight : flights){
            if ((flightNum.toString()).equals(flight.getFlightNumber())) {
                return flight;
            }
        }

        throw new Exception("Flight Number" + flightNum + " not found.");
    }
}
