package models;

public abstract class Person implements Comparable<Person> {
    // Fields.
    private String firstName;
    private String lastName;

    // Constructors.
    public Person() {
        // Empty constructor.
    }

    public Person(String name, String lastName) {
        this.firstName = name;
        this.lastName = lastName;
    }

    // Methods.
    @Override
    // Re-implement this method.
    public int compareTo(Person person) {
        return (firstName.compareTo(person.firstName));
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
        return "Person{" +
                "name='" + firstName + '\'' +
                ", email='" + lastName + '\'' +
                '}';
    }
}