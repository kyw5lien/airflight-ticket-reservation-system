package cli;

import model.user_model.Account;
import model.airfleet_model.Airplane;
import helperclasses.DataHandler;

import java.util.Scanner;

public class MainCLI {
    private static boolean keepRunning = true;

    public static void displayMainCLInterface() {
        try(Scanner scanner = new Scanner(System.in)) {
            do {
                try {
                    System.out.println("---- AirFlight Ticket Reservation System ----");
                    System.out.println("Options: "
                            + "\n1. List All Domestic Flights"
                            + "\n2. Book Domestic Flight"
                            + "\n0. Exit"
                            + "\nPlease enter your selection: ");
                    int input = Integer.parseInt(scanner.nextLine());

                    switch (input) {
                        case 1:
                            System.out.println("\n---- Listing All Domestic FLights ... ----");
                            MainCLI.displayAllDomesticFlightsCLInterface();
                            break;
                        case 2:
                            System.out.println("\n---- Book Domestic Flight ----");
                            MainCLI.displayBookDomesticFlightCLInterface();
                            break;
                        case 0:
                            System.out.println("\nExiting now ...");
                            keepRunning = false;
                            break;
                        default:
                            System.out.println("\nPlease select an option between 1 and 2! Press 0 to Exit.");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Error - Invalid Input!");
                }
            } while (keepRunning);
        }
    }

    public static void displayAllDomesticFlightsCLInterface() {
        // TODO code here ...
        if (!DataHandler.getAirFleet().getAirFleet().isEmpty()) {
            for (Airplane airplane : DataHandler.getAirFleet().getAirFleet()) {
                System.out.println(airplane);
                System.out.println("----------------------");
            }
        } else {
            System.out.println("No Airplanes Found!");
        }
    }

    public static void displayBookDomesticFlightCLInterface() {
        // TODO code here ...
    }

    public static void displayAirFleet() {
        // TODO code here ...
        if (!DataHandler.getAirFleet().getAirFleet().isEmpty()) {
            for (Airplane airplane : DataHandler.getAirFleet().getAirFleet()) {
                System.out.println(airplane);
                System.out.println("----------------------");
            }
        } else {
            System.out.println("No Airplanes Found!");
        }
    }

    public static void displayUsers() {
        if (!DataHandler.getUsers().getUsers().isEmpty()) {
            for (Account account : DataHandler.getUsers().getUsers()) {
                System.out.println(account);
                System.out.println("----------------------");
            }
        } else {
            System.out.println("No Users Found!");
        }
    }

    public static void main(String[] args) {
        DataHandler.populateUsers();
        DataHandler.populateAirFleet();

        MainCLI.displayUsers();
        MainCLI.displayAirFleet();

        //MainCLI.displayMainCLInterface();
    }
}
