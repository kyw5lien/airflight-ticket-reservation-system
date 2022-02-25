package model;

public abstract class Person {
    // Fields.
    private String firstName;
    private String lastName;

    // Constructors.
    public Person() {
        // Empty constructor.
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and Setters.
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person" + "\n" +
                "First Name : " + firstName + "\n" +
                "Last Name : " + lastName + "\n" ;
    }
}