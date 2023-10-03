package ru.maltseva.stateapp.model;

import java.util.ArrayList;

public class State {
    private static State instance = null;
    private State() {
    }
    public static State getInstance() {
        if(instance == null) {
            instance = new State();
        }
        return instance;
    }
    private String name;
    private static ArrayList<Region> regions = new ArrayList<Region>();
    private String area;
}
