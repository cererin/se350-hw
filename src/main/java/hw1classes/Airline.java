package hw1classes;

import exception.BadParameterException;
import exception.NullParameterException;
import java.util.Objects;

public class Airline {
    private String name;

    public Airline(String name) throws NullParameterException, BadParameterException {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String arName) throws NullParameterException, BadParameterException {
        if (arName == null){
            throw new NullParameterException("Null value passed for Airline name");
        }
        if (arName.length() > 7){
            throw new BadParameterException("Value passed for Airline name is too long: " + arName);
        }

        this.name = arName;
    }

    @Override
    public String toString() {
        return "Airline name: " + getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return getName().equals(airline.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
