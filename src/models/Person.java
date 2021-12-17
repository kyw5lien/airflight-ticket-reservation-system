package models;

public abstract class Person implements Comparable<Person>{
    // Fields.
    private String fistName;
    private String lastName;

    // Constructors.
    public Person(String name, String lastName){
        this.fistName = name;
        this.lastName = lastName;
    }

    // Methods.
    @Override
    // Re-implement this method.
    public int compareTo(Person person){
        return (fistName.compareTo(person.fistName));
    }

    // Getters and Setters.
    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
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
                "name='" + fistName + '\'' +
                ", email='" + lastName + '\'' +
                '}';
    }
}