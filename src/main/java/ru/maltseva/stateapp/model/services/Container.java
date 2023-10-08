package ru.maltseva.stateapp.model.services;

public class Container <T> {
    private final Class <T> className;

    public Container(Class<T> className) {
        this.className = className;
    }
    public T getInstance(){
        try {
            return className.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
