package ru.maltseva.stateapp.model.services;

import ru.maltseva.stateapp.model.City;
import ru.maltseva.stateapp.model.Region;

import java.util.ArrayList;

public class UserServices {
    public static String getRegionsCapital(ArrayList<Region> regions){
        StringBuilder result = new StringBuilder();
        for (Region element:regions) {
            result.append("Регион: ").append(element.getName()).append(" = ").append("Областной центр: ").append(element.getRegionCapital().getName()).append('\n');
        }
        return result.toString();
    }
}