package cli;

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
                            System.out.println("---- Listing All Domestic FLights ... ----");
                            MainCLI.listAllDomesticFlightsCLInterface();
                            break;
                        case 2:
                            System.out.println("---- Book Domestic Flight ----");
                            MainCLI.bookDomesticFlightCLInterface();
                            break;
                        case 0:
                            System.out.println("Exiting now ...");
                            keepRunning = false;
                            break;
                        default:
                            System.out.println("Please select an option between 1 and 2! Press 0 to Exit.");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Error - Invalid Input!");
                }
            } while (keepRunning);
        }
    }

    public static void listAllDomesticFlightsCLInterface() {
        // TODO code here ...
    }
    public static void bookDomesticFlightCLInterface() {
        // TODO code here ...
    }

    public static void main(String[] args) {
        MainCLI.displayMainCLInterface();
    }
}
