package ru.maltseva.stateapp.model.entity;

import ru.maltseva.stateapp.model.services.CollectionGenerator;
import ru.maltseva.stateapp.model.services.NamesGenerator;

import java.util.ArrayList;

public class Region {
    private ArrayList<District> districts;
    private String name;
    private City regionCapital;
    public Region(){
        this.districts = CollectionGenerator.generateCollection(District.class, 3);
        this.name = NamesGenerator.generateNames();
        this.regionCapital = districts.get(0).getCities().get(0);
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public String getName() {
        return name;
    }

    public City getRegionCapital() {
        return regionCapital;
    }

    @Override
    public String toString() {
        return "Region{" +
                "districts=" + districts +
                ", name='" + name + '\'' +
                ", capitalCity=" + regionCapital +
                '}';
    }
}
