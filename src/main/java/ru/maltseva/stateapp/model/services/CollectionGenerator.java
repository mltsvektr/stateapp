package ru.maltseva.stateapp.model.services;

import java.util.ArrayList;

public class CollectionGenerator {
    public static <T> ArrayList<T> generateCollection(Class<T> className, int length){
        ArrayList<T> collection = new ArrayList<>();
        while (collection.size() < length){
            Container <T> object = new Container<>(className);
            collection.add(object.getInstance());
        }
        return collection;
    }
}
