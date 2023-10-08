package ru.maltseva.stateapp.model;

import ru.maltseva.stateapp.model.services.NamesGenerator;

import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<Citizen> citizens;
    public City() {
        this.name = NamesGenerator.generateNames();
    }
}
