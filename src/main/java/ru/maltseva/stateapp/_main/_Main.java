package ru.maltseva.stateapp._main;

import ru.maltseva.stateapp.model.Citizen;
import ru.maltseva.stateapp.model.Region;
import ru.maltseva.stateapp.model.services.CitizenService;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class _Main {
    public static void main(String[] args) {
//        Citizen firstCit = new Citizen();
//        Citizen firstCit1 = new Citizen();
//        Citizen firstCit2 = new Citizen();
//        Citizen firstCit3 = new Citizen();
//        Citizen firstCit4 = new Citizen();
//        System.out.println(firstCit.getId());
//        System.out.println(firstCit1.getId());
//        System.out.println(firstCit2.getId());
//        System.out.println(firstCit3.getId());
//        System.out.println(firstCit4.getId());
        System.out.println(CitizenService.generateNames() + " " + CitizenService.generateNames());
            }
        }



