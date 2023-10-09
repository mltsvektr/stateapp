package ru.maltseva.stateapp.model.storage;

import ru.maltseva.stateapp.model.Citizen;

import java.util.HashMap;
import java.util.Map;

public class CitizenStorage {
    private static CitizenStorage instance = null;
    private Map<Integer, Citizen> citizenMap = new HashMap<>();
    private CitizenStorage(){

    }
    public static CitizenStorage getInstance(){
        if( instance == null){
            instance = new CitizenStorage();
        } return instance;
    }

    public Map<Integer, Citizen> getCitizenMap() {
        return citizenMap;
    }

    public void setCitizenMap(Map<Integer, Citizen> citizenMap) {
        this.citizenMap = citizenMap;
    }
}
