package ru.maltseva.stateapp.model.services;

import ru.maltseva.stateapp.model.City;
import ru.maltseva.stateapp.model.Region;
import ru.maltseva.stateapp.model.State;
import ru.maltseva.stateapp.model.storage.CitizenStorage;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class UserServices {
    public static String getRegionsCapital(ArrayList<Region> regions){
        StringBuilder result = new StringBuilder();
        for (Region element:regions) {
            result.append("Регион: ").append(element.getName()).append(" = ").append("Областной центр: ").append(element.getRegionCapital().getName()).append('\n');
        }
        return result.toString();
    }

    public static String getCitizenAverageAge (CitizenStorage citizenStorage){
        int agesSum;
        Optional<Integer> agesSumOptional = citizenStorage.getCitizenMap().values().stream()
                .map(element1 -> element1.getAge())
                .reduce ((e1, e2) -> e1 + e2);
       if (agesSumOptional.isPresent()){
           agesSum = agesSumOptional.get();
       } else {
           return "null";
       }
       int quantity;
       quantity = citizenStorage.getCitizenMap().size();
       int average = agesSum / quantity;
       return Integer.toString(average);
    }
}