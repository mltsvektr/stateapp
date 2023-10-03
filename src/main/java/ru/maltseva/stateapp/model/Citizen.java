package ru.maltseva.stateapp.model;

public class Citizen {
    private final int id;
    private String firstName;
    private String lastName;
    private int age;
    private State state;
    private static int counter = 1;

    public Citizen() {
        this.id = generateId();
    }

    private static int generateId() {
        return counter++;
    }

    public int getId() {
        return id;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
