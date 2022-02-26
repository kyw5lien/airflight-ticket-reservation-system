package tester_classes.airfleet_tester;

import model.airfleet_model.AirFleet;
import model.airfleet_model.Airplane;

public class AirFleetTester {
    public static void main(String[] args) {
        // Declaring some airplane vars to populate the Airplanes List.
        Airplane ap1 = new Airplane(1, "Boeing", "707", 189);
        Airplane ap2 = new Airplane(2, "AirBus", "A350", 366);
        Airplane ap3 = new Airplane(3, "Bombardier", "Q400", 80);
        Airplane ap4 = new Airplane(4, "Boeing", "787", 242);

        // Populating the Airplanes List.
        AirFleet airFleet = new AirFleet();
        airFleet.addAirplane(ap1);
        airFleet.addAirplane(ap2);
        airFleet.addAirplane(ap3);
        airFleet.addAirplane(ap4);

        // Testing the AirFleet class ...
        // Test 1: List air fleet
        // System.out.println("---- Listing Airplanes ----");
        // airFleet.listAirFleet();

        // Test 2: Find airplane by code
        System.out.println("---- Retrieving airplane with code 4 ----");
        System.out.println(airFleet.searchAirplaneByCode(4));

        // Test 3: Find airplane by model
        String model = "A350";
        System.out.println("---- Searching airplane model " + model + " ----");
        if (airFleet.searchAirplaneByModel(model) == null) {
            System.out.println("No airplane with model " + model + " found.");
        } else{
            System.out.println(airFleet.searchAirplaneByModel(model));
        }
    }
}
