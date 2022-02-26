package tester_classes.flight_tester;

import model.airfleet_model.Airplane;
import model.flight_model.Flight;

import java.util.Date;

public class FlightTester {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(1, "Boeing", "707", 189);
        Flight flight = new Flight(1,new Date(), "DFW", "HOU", new Date(), new Date(), airplane);
        System.out.println(flight);
    }
}
