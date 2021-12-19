package models;

import java.util.Date;
import java.util.List;

public class ReservationList {
    // Fields.
    private List<Reservation> reservationList;

    // Constructors.
    public ReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    // Methods.
    public void addReservation(Reservation reversation) {
        reservationList.add(reversation);
    }

    public Reservation searchByReservationCode(String reservationCode) {
        // TODO code here ...

        return null;
    }

    public Reservation searchReservationByFlight(long flightID){
        // TODO code here ...

        return null;
    }

    public List<Reservation> searchReservationsByPeriod(Date initialDate, Date endDate) {
        // TODO code here ...

        return null;
    }

    // Setters and Getters.
    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    // toString method.
    @Override
    public String toString() {
        return "ReservationList{" +
                "reservationList=" + reservationList +
                '}';
    }
}