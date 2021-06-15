package com.dk.exmaple.java11.var;

public class ObjectWrapper<T> {
    private T value;
    private String description;

    public ObjectWrapper(T value, String description) {
        this.value = value;
        this.description = description;
    }

    public T getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
