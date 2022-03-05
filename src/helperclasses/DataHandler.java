package helperclasses;

import model.airfleet_model.AirFleet;
import model.business_model.Reservation;
import model.business_model.ReservationList;
import model.flight_model.AirFlights;
import model.airfleet_model.Airplane;
import model.flight_model.Flight;
import model.user_model.Account;
import model.user_model.Users;

import java.util.Date;

public class DataHandler {
    // Fields.
    private static Users users = new Users();
    private static AirFleet airFleet = new AirFleet();
    private static AirFlights airFlights = new AirFlights();
    private static ReservationList reservationList = new ReservationList();

    // Methods.
    public static boolean populateUsers() {
        // TODO code here ...
        Account acc1 = new Account("kevin", "kevin", "kevin", "k@kevin.com", "password1");
        Account acc2 = new Account("daniela", "hantuchova", "hantuchova", "d@hantuchova.com", "password2");
        Account acc3 = new Account("anna", "kournikova", "kournikova", "a@kournikova.com", "password3");
        Account acc4 = new Account("kim", "clijsters", "clijsters", "k@clijsters.com", "password4");

        // Populating the Users List.
        users.addAccount(acc1);
        users.addAccount(acc2);
        users.addAccount(acc3);
        users.addAccount(acc4);

        return !users.getUsers().isEmpty();
    }

    public static boolean populateAirFleet() {
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

        return !airFleet.getAirFleet().isEmpty();
    }

    public boolean populateAirFlights(){
        Airplane ap1 = new Airplane(1, "Boeing", "707", 189);
        Flight f1 = new Flight(1,new Date(), "IST", "MDE", new Date(), new Date(), ap1);
        Airplane ap2 = new Airplane(2, "Boeing", "707", 189);
        Flight f2 = new Flight(2,new Date(), "NGO", "TPE", new Date(), new Date(), ap2);
        Airplane ap3 = new Airplane(3, "Boeing", "707", 189);
        Flight f3 = new Flight(3,new Date(), "FLR", "PRG", new Date(), new Date(), ap3);
        Airplane ap4 = new Airplane(4, "Boeing", "707", 189);
        Flight f4 = new Flight(4,new Date(), "BUH", "CHI", new Date(), new Date(), ap4);

        // Populating the Users List.
        airFlights.addAirFlight(f1);
        airFlights.addAirFlight(f2);
        airFlights.addAirFlight(f3);
        airFlights.addAirFlight(f4);

        return !airFlights.getAirFlights().isEmpty();
    }

    public static boolean populateReservationList(){
        Airplane ap1 = new Airplane(1, "Boeing", "707", 189);
        Flight f1 = new Flight(1,new Date(), "IST", "MDE", new Date(), new Date(), ap1);
        Airplane ap2 = new Airplane(2, "Boeing", "707", 189);
        Flight f2 = new Flight(2,new Date(), "NGO", "TPE", new Date(), new Date(), ap2);
        Airplane ap3 = new Airplane(3, "Boeing", "707", 189);
        Flight f3 = new Flight(3,new Date(), "FLR", "PRG", new Date(), new Date(), ap3);
        Airplane ap4 = new Airplane(4, "Boeing", "707", 189);
        Flight f4 = new Flight(4,new Date(), "BUH", "CHI", new Date(), new Date(), ap4);

        Reservation r1 = new Reservation("1", f1, (Account) users.getUsers().toArray()[0]);
        Reservation r2 = new Reservation("2", f2, (Account) users.getUsers().toArray()[1]);
        Reservation r3 = new Reservation("3", f3, (Account) users.getUsers().toArray()[2]);
        Reservation r4 = new Reservation("4", f4, (Account) users.getUsers().toArray()[3]);

        reservationList.addReservation(r1);
        reservationList.addReservation(r2);
        reservationList.addReservation(r3);
        reservationList.addReservation(r4);

        return !reservationList.getReservationList().isEmpty();
    }

    public static Users getUsers(){
        if(users.getUsers().isEmpty()){
            throw new NullPointerException("Users List is Empty!");
        } else {
            return users;
        }
    }

    public static AirFleet getAirFleet(){
        if(airFleet.getAirFleet().isEmpty()){
            throw new NullPointerException("AirFleet List is Empty!");
        } else {
            return airFleet;
        }
    }

    public static ReservationList getReservationList() {
        if(reservationList.getReservationList().isEmpty()){
            throw new NullPointerException("Reservation List is Empty!");
        } else {
            return reservationList;
        }
    }
}