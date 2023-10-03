package ru.maltseva.stateapp.model.storage;

import ru.maltseva.stateapp.model.Citizen;

import java.util.HashMap;
import java.util.Map;

public class CitizenStorage {

    private final Map<Integer, Citizen> storage = new HashMap<>();

    public void putCitizen(Integer id, Citizen citizen) {
        storage.put(id, citizen);
    }

    public Citizen getCitizen(Integer id) {
        return storage.get(id);
    }
}

