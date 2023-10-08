package ru.maltseva.stateapp.model;

import ru.maltseva.stateapp.model.services.CollectionGenerator;
import ru.maltseva.stateapp.model.services.NamesGenerator;

import java.util.ArrayList;

public class State {
    private final String name = "Russia";
    private ArrayList<Region> regions;
    private int area;
    private City capitalCity;
    private static State instance = null;
    private State() {
    }
    public static State getInstance() {
        if(instance == null) {
            instance = new State();
        }
        return instance;
    }
    public void fillState(){
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

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", regions=" + regions +
                ", area=" + area +
                ", capitalCity=" + capitalCity +
                '}';
    }

    public City getCapitalCity() {
        return capitalCity;
    }
}
