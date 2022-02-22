import exception.BadParameterException;
import exception.NullParameterException;
import java.util.*;
import hw1classes.*;

public class TravelManager {
    public static void main(String[] args) throws Exception, NullParameterException {
        Airport ap1 = AirportFactory.createAirport("OHA");
        Airport ap2 = AirportFactory.createAirport("LSA");
        Airline ar1 = AirlineFactory.createAirline("Heike");
        Airline ar2 = AirlineFactory.createAirline("Ami");

        FlightManager fm1 = FlightManager.getInstance();
        Flight fOne = fm1.createFlight("commercial", ar1, ap1, ap2);
        Flight fTwo = fm1.createFlight("passenger", ar2, ap1, ap2);

        System.out.println(fOne);
        System.out.println(fTwo);
    }
}