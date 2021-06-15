package com.dk.exmaple.java11.var;

public class Car {
    private String model;
    private String producer;
    public Car() {
    }

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }
}
