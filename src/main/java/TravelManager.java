import exception.BadParameterException;
import exception.NullParameterException;
import java.util.*;
import hw1classes.*;

public class TravelManager {
    public static void main(String[] args) throws Exception, NullParameterException {
        Airport ap1 = new Airport("OHA");
        Airport ap2 = new Airport("LSA");
        Airline ar1 = new Airline("Heike");

        FlightManager fm1 = FlightManager.getInstance();
        fm1.createFlight(ar1, ap1, ap2);

    }
}