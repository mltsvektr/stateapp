package ru.maltseva.stateapp.model.services;

import ru.maltseva.stateapp.model.Citizen;
import ru.maltseva.stateapp.model.Region;
import ru.maltseva.stateapp.model.storage.CitizenStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UserServices {

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

    public static String showNamesWithNLetters(CitizenStorage citizenStorage) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        List<String> namesLength = citizenStorage.getCitizenMap().values().stream()
                .map(element1 -> element1.getFirstName())
                .filter(firstName -> (firstName.length() == number))
                .collect(Collectors.toList());
        return namesLength.toString();
    }
}