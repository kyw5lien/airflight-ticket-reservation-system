package tester_classes.datahandler_tester;

import helperclasses.DataHandler;

public class DataHandlerTester {
    public static void main(String[] args) {
        System.out.println("Populated the Users data successfully? -> " + DataHandler.populateUsers());
        System.out.println("Populated the AirFleet data successfully? -> " + DataHandler.populateAirFleet());
        System.out.println("Populated the ReservationList data successfully? -> " +DataHandler.populateReservationList());


        System.out.println("\nGet Users Listing ... ");
        System.out.println(DataHandler.getUsers().getUsers().toString());

        System.out.println("\nGet Airplane Listing ... ");
        System.out.println(DataHandler.getAirFleet().getAirFleet().toString());

        System.out.println("\nGet Reservation List ...");
        System.out.println(DataHandler.getReservationList());

    }
}