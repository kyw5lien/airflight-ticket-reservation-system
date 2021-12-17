package models;

/*
  Class design for Users.
  Contains a list of airplanes and methods to add and retrieve airplanes from an air fleet.
  @author Dário Neves https://github.com/kyw5lien
 * @version 0.1.0
 */

import java.util.HashSet;
import java.util.Set;

public class AirFleet {
    // Fields.
    private Set<Airplane> airFleet;

    // Constructors.
    public AirFleet(){
        airFleet = new HashSet<Airplane>();
    }
    public AirFleet(Set<Airplane> airFleet) {
        this.airFleet = airFleet;
    }

    // Methods.
    public void addAirplane(Airplane airplane) {
        airFleet.add(airplane);

    }

    public Airplane findAirplaneByCode(long code) {
        for(Airplane airplane : airFleet){
            if(airplane.getCode() == code){
                return airplane;
            }
        }
        return null;
    }

    public Airplane findAirplaneByModel(String model){
            for (Airplane airplane : airFleet) {
                if (airplane.getModel().equals(model)) {
                    return airplane;
                }
            }
        return null;
    }

    public boolean listAirFleet(){
        if(!airFleet.isEmpty()){
            for(Airplane airplane : airFleet){
                System.out.println(airplane);
                System.out.println("----------------------");
            }
            return true;
        } else{
            return false;
        }
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
        return "Users{" +
                "airFleet=" + airFleet +
                '}';
    }
}