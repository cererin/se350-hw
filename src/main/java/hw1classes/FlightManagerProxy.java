package hw1classes;

import exception.BadParameterException;
import exception.NullParameterException;

import java.util.UUID;

public class FlightManagerProxy {
    private static FlightManager fm;

    public FlightManagerProxy(FlightManagerImpl fmImpl) throws Exception {
        if (fm == null){
            fm = fmImpl.getInstance();
        }
    }

    public Flight createFlight(String type, Airline airline, Airport origin, Airport destination) throws NullParameterException, Exception {
        if (fm == null){
            fm = FlightManagerImpl.getInstance();
        }

        System.out.println("A flight is being created.");
        return fm.createFlight(type, airline, origin, destination);
    }

    public Flight getFlightByNumber(UUID flightNum) throws Exception{
        if (fm == null){
            fm = FlightManagerImpl.getInstance();
        }

        System.out.println("Flight number:" + flightNum + " is being retrieved.");
        return fm.getFlightByNumber(flightNum);
    }
}
