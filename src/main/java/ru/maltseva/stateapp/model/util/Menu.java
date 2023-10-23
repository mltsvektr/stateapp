package ru.maltseva.stateapp.model.util;

import ru.maltseva.stateapp.controller.UserController;
import ru.maltseva.stateapp.model.State;
import ru.maltseva.stateapp.model.storage.CitizenStorage;

import java.util.Scanner;

public class Menu {
    UserController userController = new UserController();
    State state;
    CitizenStorage citizenStorage;

    public Menu() {
        this.state = State.getInstance();
        state.fillState();
        this.citizenStorage = CitizenStorage.getInstance();
    }

    public void startMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Enter 1 to get Capital City");
            System.out.println("Enter 2 to get amount of Regions");
            System.out.println("Enter 3 to get State's Area");
            System.out.println("Enter 4 to get Capital Cities of Regions");
            System.out.println("Enter 5 to get average age of Citizens");
            System.out.println("Enter 6 to get names which contains of n letters");
            System.out.println("Enter 7 to get citizens, whose first names begin with letter m");
            System.out.println("Enter 8 to exit the program");
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();
            switch (command) {
                case (1):
                    userController.getCapitalCity(state);
                    break;
                case (2):
                    userController.getRegionsAmount(state);
                    break;
                case (3):
                    userController.getStateArea(state);
                    break;
                case (4):
                    userController.getRegionsCapitals(state.getRegions());
                    break;
                case (5):
                    userController.getCitizenAverageAge(citizenStorage);
                    break;
                case (6):
                    Scanner console = new Scanner(System.in);
                    int number = console.nextInt();
                    userController.getNamesContainingNLetters(citizenStorage, number);
                    break;
                case (7):
                    Scanner console1 = new Scanner(System.in);
                    String symbol = console1.nextLine();
                    userController.getFirstNameWithFirstChar(citizenStorage, symbol);
                    break;
                case (8):
                    flag = false;
                    break;
                default:
                    System.out.println("Incorrect number! Try again.");
            }
        }
    }
}
