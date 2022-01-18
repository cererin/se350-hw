import hw1classes.Airport;
import hw1classes.Airline;
import hw1classes.Flight;
import exception.BadParameterException;
import exception.NullParameterException;
import java.util.Date;

public class TravelManager {
    public static void main(String[] args) throws BadParameterException, NullParameterException {
        Airport ap1 = new Airport("OHA");
        Airline ar1 = new Airline("Amme");
        Flight f1 = new Flight(ar1, ap1, ap1, "1000853", new Date());

        System.out.println(f1);

    }
}