package ru.maltseva.stateapp.model.services;

import ru.maltseva.stateapp.model.Citizen;
import ru.maltseva.stateapp.model.City;
import ru.maltseva.stateapp.model.Region;
import ru.maltseva.stateapp.model.State;
import ru.maltseva.stateapp.model.storage.CitizenStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserServices {

    public static String getCapitalCity(State state) {
        City capitalCity = state.getCapitalCity();
        return capitalCity.getName();
    }

    public static String getRegionsAmount(State state) {
        int amount = state.getRegions().size();
        return Integer.toString(amount);
    }

    public static String getStateArea(State state) {
        int area = state.getArea();
        return Integer.toString(area);
    }

    public static String getRegionsCapitals(ArrayList<Region> regions) {
        StringBuilder result = new StringBuilder();
        for (Region element : regions) {
            result.append("Регион: ").append(element.getName()).append(" = ").append("Областной центр: ").append(element.getRegionCapital().getName()).append('\n');
        }
        return result.toString();
    }

    public static String getCitizenAverageAge(CitizenStorage citizenStorage) {
        int agesSum;
        Optional<Integer> agesSumOptional = citizenStorage.getCitizenMap().values().stream()
                .map(element1 -> element1.getAge())
                .reduce((e1, e2) -> e1 + e2);
        if (agesSumOptional.isPresent()) {
            agesSum = agesSumOptional.get();
        } else {
            return "null";
        }
        int quantity;
        quantity = citizenStorage.getCitizenMap().size();
        int average = agesSum / quantity;
        return Integer.toString(average);
    }

    public static String getNamesContainingNLetters(CitizenStorage citizenStorage) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        List<String> namesLength = citizenStorage.getCitizenMap().values().stream()
                .map(element1 -> element1.getFirstName())
                .filter(firstName -> (firstName.length() == number))
                .collect(Collectors.toList());
        return namesLength.toString();
    }

    public static String getFirstNameWithFirstChar(CitizenStorage citizenStorage) {
        Scanner console = new Scanner(System.in);
        String symbol = console.nextLine();
        ArrayList<String> citizensFirstName = new ArrayList<>();
        for (Citizen citizen : citizenStorage.getCitizenMap().values()) {
            citizensFirstName.add(citizen.getFirstName());
        }
        List<String> citizensFirstNameWithFirstChar = citizensFirstName.stream()
                .filter(citizenFirstName -> (citizenFirstName.startsWith(symbol)))
                .collect(Collectors.toList());
        return citizensFirstNameWithFirstChar.toString();
    }
}
