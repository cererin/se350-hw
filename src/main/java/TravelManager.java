import exception.NullParameterException;
import hw1classes.*;
import java.util.UUID;

public class TravelManager {
    public static void main(String[] args) throws Exception, NullParameterException {
        Airport ap1 = AirportFactory.createAirport("OHA");
        Airport ap2 = AirportFactory.createAirport("LSA");
        Airline ar1 = AirlineFactory.createAirline("Heike");
        Airline ar2 = AirlineFactory.createAirline("Ami");

        FlightManagerImpl fm1 = FlightManagerImpl.getInstance();
        FlightManagerProxy fm2 = new FlightManagerProxy(fm1);
        Flight fOne = fm2.createFlight("commercial", ar1, ap1, ap2);

        Flight fTwo = fm2.getFlightByNumber(UUID.fromString(fOne.getFlightNumber()));
        System.out.println(fTwo);
    }
}