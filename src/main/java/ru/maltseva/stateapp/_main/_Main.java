package ru.maltseva.stateapp._main;

import ru.maltseva.stateapp.model.State;
import ru.maltseva.stateapp.model.services.UserServices;
import ru.maltseva.stateapp.model.storage.CitizenStorage;

public class _Main {
    public static void main(String[] args) {
        State state = State.getInstance();
        state.fillState();
        CitizenStorage citizenStorage = CitizenStorage.getInstance();
//        System.out.println(state);
//        System.out.println(state.getCapitalCity());
//        System.out.println(state.getRegions().size());
//        System.out.println(UserServices.getRegionsCapital(state.getRegions()));
//        System.out.println(citizenStorage.getCitizenMap());
//        System.out.println(UserServices.getCitizenAverageAge(citizenStorage));
//        System.out.println(UserServices.showNamesWithNLetters(citizenStorage));
            }
        }



