package model.flights_model;

/*
  AirFleet Class..
  Contains a list of airplanes and methods to add and retrieve airplanes from an air fleet.
  @author kyw5lien
 */

import model.flights_model.Airplane;

import java.util.HashSet;
import java.util.Set;

public class AirFleet {
    // Fields.
    private Set<Airplane> airFleet;

    // Constructors.
    public AirFleet(){
        this.airFleet = new HashSet<Airplane>();
    }
    public AirFleet(Set<Airplane> airFleet) {
        this.airFleet = airFleet;
    }

    // Methods.
    public void addAirplane(Airplane airplane) {
        airFleet.add(airplane);

    }

    public Airplane searchAirplaneByCode(long code) {
        for(Airplane airplane : airFleet){
            if(airplane.getCode() == code){
                return airplane;
            }
        }
        return null;
    }

    public Airplane searchAirplaneByModel(String model){
            for (Airplane airplane : airFleet) {
                if (airplane.getModel().equals(model)) {
                    return airplane;
                }
            }
        return null;
    }

    // Getters and Setters.
    public Set<Airplane> getAirFleet() {
        return airFleet;
    }

    public void setAirFleet(Set<Airplane> airFleet) {
        this.airFleet = airFleet;
    }

    // toString Method.
    @Override
    public String toString() {
        return "AirFleet:" + "\n" + airFleet;
    }
}