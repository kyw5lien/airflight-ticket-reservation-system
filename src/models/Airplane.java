package models;

/**
 * Class design for Airplane.
 * @author Dário Neves https://github.com/kyw5lien
 * @version 0.1.0
 */

public class Airplane {
    // Fields.
    private long code;
    private String type;
    private String model;
    private int capacity;

    // Constructors.
    public Airplane() {
        // Empty constructor.
    }

    public Airplane(long code, String type, String model, int capacity) {
        this.code = code;
        this.type = type;
        this.model = model;
        this.capacity = capacity;
    }

    // Getters and Setters.
    public long getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    // toString method.
    @Override
    public String toString() {
        return "Aircraft/Code: "+ code + "\n" +
                "Type: " +type + "\n" +
                "Model: " +model + "\n" +
                "Capacity: " +capacity + " seats";
    }
}
