package ru.maltseva.stateapp.model;

import ru.maltseva.stateapp.model.services.CollectionGenerator;
import ru.maltseva.stateapp.model.services.NamesGenerator;

import java.util.ArrayList;

public class District {
    private ArrayList<City> cities;
    private String name;
    public District(){
        this.cities = CollectionGenerator.generateCollection(City.class, 3);
        this.name = NamesGenerator.generateNames();
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "District{" +
                "cities=" + cities +
                ", name='" + name + '\'' +
                '}';
    }
}
