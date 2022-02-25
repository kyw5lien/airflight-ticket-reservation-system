package tester_classes.airfleet_tester;

import model.flights_model.Airplane;

public class AirplaneTester {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(1, "Boeing", "707", 189);
        System.out.println(airplane);
    }
}
