package hw1classes;

import exception.BadParameterException;
import exception.NullParameterException;
import java.util.*;

public class Airport {
    private String name;

    public Airport(String name) throws NullParameterException, BadParameterException {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String apName) throws NullParameterException, BadParameterException {
        if (apName == null){
            throw new NullParameterException("Null value passed for hw1classes.Airport name");
        }
        if (apName.length() != 3){
            throw new BadParameterException("Value passed for hw1classes.Airport name is too long or short: " + apName);
        }

        this.name = apName.toUpperCase();
    }

    @Override
    public String toString() {
        return "hw1classes.Airport name: " + getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return getName().equals(airport.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
