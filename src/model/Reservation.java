package model;

public class Reservation {
    // Fields.
    String reservationCode;
    Flight reservationFlight;
    Account account;

    // Constructors.
    public Reservation(){
        // Empty Constructor.
    }

    public Reservation(String reservationCode, Flight reservationFlight, Account account) {
        this.reservationCode = reservationCode;
        this.reservationFlight = reservationFlight;
        this.account = account;
    }

    // Getters and Setters.
    public String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }

    public Flight getReservationFlight() {
        return reservationFlight;
    }

    public void setReservationFlight(Flight reservationFlight) {
        this.reservationFlight = reservationFlight;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    // toString method.
    @Override
    public String toString() {
        return "Reservation:" + "\n" +
                "Reservation Code: " + reservationCode + "\n" +
                "Flight: " + "\n" +
                reservationFlight + "\n" +
                "Account: " + "\n" +
                account;
    }
}
