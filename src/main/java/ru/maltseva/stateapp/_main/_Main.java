package ru.maltseva.stateapp._main;

import ru.maltseva.stateapp.model.State;
import ru.maltseva.stateapp.model.storage.CitizenStorage;

public class _Main {
    public static void main(String[] args) {
        State state = State.getInstance();
        state.fillState();
        CitizenStorage citizenStorage = CitizenStorage.getInstance();
    }
}