package ru.maltseva.stateapp.model;

import ru.maltseva.stateapp.model.services.NamesGenerator;

public class Citizen {
    private final int ID;
    private String firstName;
    private String lastName;
    private int age;
    private State state;
    private static int counter = 1;

    public Citizen() {
        this.ID = generateId();
        this.firstName = NamesGenerator.generateNames();
        this.lastName = NamesGenerator.generateNames();
        this.age = NamesGenerator.generateRandomNumber(0, 99);
        this.state = State.getInstance();
    }

    private static int generateId() {
        return counter++;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public State getState() {
        return state;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "id=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", state=" + state.getName() +
                '}';
    }
}
