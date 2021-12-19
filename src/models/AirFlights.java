package models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class AirFlights {
    // Fields.
    private Set<Flight> airFlights;

    // Constructors.
    public AirFlights(){
        // Empty constructor.
    }
    public AirFlights(Set<Flight> airFlights) {
        this.airFlights = airFlights;
    }

    // Methods.
    public void addAirFlight(Flight flight) {
        airFlights.add(flight);

    }

    public Flight searchAirFlightByID(long flightID) {
        for(Flight flight : airFlights){
            if(flight.getFlightID() == flightID){
                return flight;
            }
        }
        return null;
    }

    public Flight searchFlightByDateOfFlight(Date dateOfFlight){
        for (Flight flight : airFlights) {
            if (flight.getDateOfFlight() == dateOfFlight) {
                return flight;
            }
        }
        return null;
    }

    // Implement this method ...
    public Set<Flight> searchAirFlightsByPeriod(Date initialDate, Date endDate){
        // TODO code here ...

        return null;
    }

    // Getters and Setters.
    public Set<Flight> getAirFlights() {
        return airFlights;
    }

    public void setAirFlights(Set<Flight> airFlights) {
        this.airFlights = airFlights;
    }

    // toString Method.
    @Override
    public String toString() {
        return "AirFlights{" +
                "airFlights=" + airFlights +
                '}';
    }
}