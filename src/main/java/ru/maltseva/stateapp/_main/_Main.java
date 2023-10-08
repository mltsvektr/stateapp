package ru.maltseva.stateapp._main;

import ru.maltseva.stateapp.model.Citizen;
import ru.maltseva.stateapp.model.State;
import ru.maltseva.stateapp.model.services.UserServices;

public class _Main {
    public static void main(String[] args) {
        State state = State.getInstance();
        state.fillState();
//        System.out.println(state);
//        System.out.println(state.getCapitalCity());
//        System.out.println(state.getRegions().size());
        System.out.println(UserServices.getRegionsCapital(state.getRegions()));
            }
        }



