package tester_classes.business_tester;

import model.airfleet_model.Airplane;
import model.business_model.Reservation;
import model.business_model.ReservationList;
import model.flight_model.Flight;
import model.user_model.Account;

import java.util.Date;

public class ReservationListTester {
    public static void main(String[] args) {
        ReservationList reservationList = new ReservationList();

        Account account = new Account("kevin", " kevin", "kevin", "k@kevin.com", "password");
        Airplane airplane = new Airplane(1, "Boeing", "707", 189);
        Flight flight = new Flight(1,new Date(), "DFW", "HOU", new Date(), new Date(), airplane);
        Reservation reservation = new Reservation("AAAA", flight, account);

        reservationList.addReservation(reservation);
        System.out.println(reservationList.toString());
    }
}
