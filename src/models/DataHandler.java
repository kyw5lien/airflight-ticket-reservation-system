package models;

public class DataHandler {
    private static Account account;
    private static Users usersListing = new Users();

    private static Airplane airplane;
    private static AirFleet airplaneListing;

    public static boolean populateUsers() {
        // TODO code here ...
        Account acc1 = new Account("kevin", "mitnick", "mitnick", "k@mitnick.com", "password1");
        Account acc2 = new Account("daniela", "hantuchova", "hantuchova", "d@hantuchova.com", "password2");
        Account acc3 = new Account("anna", "kournikova", "kournikova", "a@kournikova.com", "password3");
        Account acc4 = new Account("nina", "hartley", "hartley", "nina@hartley.com", "password4");

        // Populating the Users List.
        usersListing.addAccount(acc1);
        usersListing.addAccount(acc2);
        usersListing.addAccount(acc3);
        usersListing.addAccount(acc4);

        if (!usersListing.getUsers().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean populateAirFleet() {
        // TODO code here ...
        airplane = new Airplane();
        airplaneListing = new AirFleet();

        // Declaring some airplane vars for populating the Airplanes List.
        Airplane ap1 = new Airplane(1, "Boeing", "707", 189);
        Airplane ap2 = new Airplane(2, "AirBus", "A350", 366);
        Airplane ap3 = new Airplane(3, "Bombardier", "Q400", 80);
        Airplane ap4 = new Airplane(4, "Boeing", "787", 242);

        // Populating the Airplanes List.
        airplaneListing.addAirplane(ap1);
        airplaneListing.addAirplane(ap2);
        airplaneListing.addAirplane(ap3);
        airplaneListing.addAirplane(ap4);

        if (!airplaneListing.getAirFleet().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // Getters and Setters.
    public static Account getAccount() {
        return account;
    }

    public static void setAccount(Account account) {
        DataHandler.account = account;
    }

    public static Users getUsersListing() {
        return usersListing;
    }

    public static void setUsersListing(Users usersListing) {
        DataHandler.usersListing = usersListing;
    }

    public static Airplane getAirplane() {
        return airplane;
    }

    public static void setAirplane(Airplane airplane) {
        DataHandler.airplane = airplane;
    }

    public static AirFleet getAirplaneListing() {
        return airplaneListing;
    }

    public static void setAirplaneListing(AirFleet airplaneListing) {
        DataHandler.airplaneListing = airplaneListing;
    }
}
