package ru.maltseva.stateapp.controller;

import ru.maltseva.stateapp.model.entity.Region;
import ru.maltseva.stateapp.model.entity.State;
import ru.maltseva.stateapp.model.services.UserServices;
import ru.maltseva.stateapp.model.storage.CitizenStorage;
import ru.maltseva.stateapp.view.ResultWriter;

import java.util.ArrayList;

public class UserController {

    public void getCapitalCity(State state) {
        String result = UserServices.getCapitalCity(state);
        ResultWriter.printResult(result);
    }

    public void getRegionsAmount(State state) {
        String result = UserServices.getRegionsAmount(state);
        ResultWriter.printResult(result);
    }

    public void getStateArea(State state) {
        String result = UserServices.getStateArea(state);
        ResultWriter.printResult(result);
    }

    public void getRegionsCapitals(ArrayList<Region> regions) {
        String result = UserServices.getRegionsCapitals(regions);
        ResultWriter.printResult(result);
    }

    public void getCitizenAverageAge(CitizenStorage citizenStorage) {
        String result = UserServices.getCitizenAverageAge(citizenStorage);
        ResultWriter.printResult(result);
    }

    public void getNamesContainingNLetters(CitizenStorage citizenStorage, int number) {
        String result = UserServices.getNamesContainingNLetters(citizenStorage, number);
        ResultWriter.printResult(result);
    }

    public void getFirstNameWithFirstChar(CitizenStorage citizenStorage, String symbol) {
        String result = UserServices.getFirstNameWithFirstChar(citizenStorage, symbol);
        ResultWriter.printResult(result);
    }
}
