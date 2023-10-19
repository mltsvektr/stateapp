package ru.maltseva.stateapp.model;

import ru.maltseva.stateapp.model.services.CollectionGenerator;

import java.util.ArrayList;

public class State {
    private final String name = "Russia";
    private ArrayList<Region> regions;
    private int area = 1000;
    private City capitalCity;
    private static State instance = null;

    private State() {
    }

    public static State getInstance() {
        if (instance == null) {
            instance = new State();
        }
        return instance;
    }

    public void fillState() {
        this.regions = CollectionGenerator.generateCollection(Region.class, 3);
        this.capitalCity = regions.get(0).getDistricts().get(0).getCities().get(0);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public int getArea() {
        return area;
    }

    public City getCapitalCity() {
        return capitalCity;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", regions=" + regions +
                ", area=" + area +
                ", capitalCity=" + capitalCity +
                '}';
    }
}
