package tester_classes.flight_tester;

import model.flights_model.AirFlights;
import model.flights_model.Airplane;
import model.flights_model.Flight;

import java.util.Date;

public class AirFlightsTester {
    public static void main(String[] args){
        Airplane airplane = new Airplane(1, "Boeing", "707", 189);
        Flight flight = new Flight(1, new Date(), "BER","TYO", new Date(), new Date(), airplane);
        Airplane anotherAirplane = new Airplane(2, "AirBus", "A350", 366);
        Flight anotherFlight = new Flight(2, new Date(), "BER","SEL", new Date(), new Date(), airplane);

        AirFlights airFlights = new AirFlights();
        airFlights.addAirFlight(flight);
        airFlights.addAirFlight(anotherFlight);

        System.out.println(airFlights);
    }
}
