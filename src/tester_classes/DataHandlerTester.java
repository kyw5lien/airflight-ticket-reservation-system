package tester_classes;

import helperclasses.DataHandler;

public class DataHandlerTester {
    public static void main(String[] args) {
        System.out.println("Populated the Users data successfully? -> " + DataHandler.populateUsers());
        System.out.println("Populated the AirFleet data successfully? -> " + DataHandler.populateAirFleet());

        System.out.println("\nGet Users Listing ... ");
        System.out.println(DataHandler.getUsersListing().getUsers().toString());

        System.out.println("\nGet Airplane Listing ... ");
        System.out.println(DataHandler.getAirplaneListing().getAirFleet().toString());

    }
}