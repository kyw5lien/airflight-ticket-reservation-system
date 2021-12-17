package models;

public class DataHandler {
    private static Account account;
    private static Users users;

    private static Airplane airplane;
    private static AirFleet airFleet;

    public DataHandler() {
        account = new Account();
        users = new Users();

        airplane = new Airplane();
        airFleet = new AirFleet();
    }

    public static Account getAccount() {
        return account;
    }

    public static void setAccount(Account account) {
        DataHandler.account = account;
    }

    public static Users getUsers() {
        return users;
    }

    public static void setUsers(Users users) {
        DataHandler.users = users;
    }

    public static Airplane getAirplane() {
        return airplane;
    }

    public static void setAirplane(Airplane airplane) {
        DataHandler.airplane = airplane;
    }

    public static AirFleet getAirFleet() {
        return airFleet;
    }

    public static void setAirFleet(AirFleet airFleet) {
        DataHandler.airFleet = airFleet;
    }

    public static void populateUsers() {
        // TODO code here ...
        Account acc1 = new Account("kevin", "mitnick", "mitnick", "k@mitnick.com", "password1");
        Account acc2 = new Account("daniela", "hantuchova", "hantuchova", "d@hantuchova.com", "password2");
        Account acc3 = new Account("anna", "kournikova", "kournikova", "a@kournikova.com", "password3");
        Account acc4 = new Account("nina", "hartley", "hartley", "nina@hartley.com", "password4");

        // Populating the Users List.
        users.addAccount(acc1);
        users.addAccount(acc2);
        users.addAccount(acc3);
        users.addAccount(acc4);
    }

    public static void populateAirFleet() {
        // TODO code here ...
        // Declaring some airplane vars for populating the Airplanes List.
        Airplane ap1 = new Airplane(1, "Boeing", "707", 189);
        Airplane ap2 = new Airplane(2, "AirBus", "A350", 366);
        Airplane ap3 = new Airplane(3, "Bombardier", "Q400", 80);
        Airplane ap4 = new Airplane(4, "Boeing", "787", 242);

        // Populating the Airplanes List.
        airFleet.addAirplane(ap1);
        airFleet.addAirplane(ap2);
        airFleet.addAirplane(ap3);
        airFleet.addAirplane(ap4);
    }
}
