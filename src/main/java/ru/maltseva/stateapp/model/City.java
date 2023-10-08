package ru.maltseva.stateapp.model;

import ru.maltseva.stateapp.model.services.CollectionGenerator;
import ru.maltseva.stateapp.model.services.NamesGenerator;

import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<Citizen> citizens;
    public City() {
        this.name = NamesGenerator.generateNames();
        this.citizens = CollectionGenerator.generateCollection(Citizen.class, 3);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Citizen> getCitizens() {
        return citizens;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", citizens=" + citizens +
                '}';
    }
}
