package ru.maltseva.stateapp.model;

import java.util.ArrayList;

public class State {
    private String name = "Russia";
    private ArrayList<Region> regions;
    private int area = 34;
    private static State instance = null;
    private State() {
    }
    public static State getInstance() {
        if(instance == null) {
            instance = new State();
        }
        return instance;
    }


    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
