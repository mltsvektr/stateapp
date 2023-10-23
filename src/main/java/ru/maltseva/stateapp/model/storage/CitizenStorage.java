package ru.maltseva.stateapp.model.storage;

import ru.maltseva.stateapp.model.Citizen;

import java.util.HashMap;
import java.util.Map;

public class CitizenStorage {
    private static CitizenStorage instance = null;
    private final Map<Integer, Citizen> CITIZENMAP = new HashMap<>();
    private CitizenStorage(){

    }
    public static CitizenStorage getInstance(){
        if( instance == null){
            instance = new CitizenStorage();
        } return instance;
    }

    public Map<Integer, Citizen> getCITIZENMAP() {
        return CITIZENMAP;
    }
}
