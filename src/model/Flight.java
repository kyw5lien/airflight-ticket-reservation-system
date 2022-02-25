package model;

/**
 * Flight Class.
 * @author kyw5lien
 */

import java.util.Date;

public class Flight {
    // Fields.
    private long flightID;
    private Date dateOfFlight;
    private String origin;
    private String destination;
    private Date departureTime;
    private Date arrivalTime;

    private Airplane airplane;

    // Constructors.
    public Flight(long flightID, Date dateOfFlight, String origin, String destination, Date departureTime, Date arrivalTime, Airplane airplane) {
        this.flightID = flightID;
        this.dateOfFlight = dateOfFlight;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.airplane = airplane;
    }

    // Getters.
    public long getFlightID() {
        return flightID;
    }

    public Date getDateOfFlight() {
        return dateOfFlight;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setFlightID(long flightID) {
        this.flightID = flightID;
    }

    public void setDateOfFlight(Date dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    // toString method.
    @Override
    public String toString() {
        return "Flight Information: " + "\n" +
                "Flight ID: " + flightID + "\n" +
                "Date: " + dateOfFlight + "\n" +
                "Origin: " + origin + "\n" +
                "Destination: " + destination + "\n" +
                "Departure Time: " + departureTime + "\n" +
                "Arrival Time: " + arrivalTime + "\n" +
                "Airplane Information: " + "\n" +
                airplane;
    }
}
