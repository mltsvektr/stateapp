package ru.maltseva.stateapp.model.services;

import java.util.Random;

public class CitizenService {
    public static String generateNames() {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
        char[] consonants = new char[]{'p', 'b', 'k', 'f', 'v', 'm', 'z', 'h', 't', 'd', 'l', 'n'};
        StringBuilder wholeName = new StringBuilder();
        int result = CitizenService.generateRandomNumber(5, 10);
        for (int i = 0; i < result; i++) {
            if (i % 2 == 0) {
                int index = CitizenService.generateRandomNumber(0, vowels.length);
                wholeName.append(vowels[index]);
            } else {
                int index = CitizenService.generateRandomNumber(0, consonants.length);
                wholeName.append(consonants[index]);
            }
        }
        return wholeName.toString();
    }

    public static int generateRandomNumber(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low) + low;
    }
}
