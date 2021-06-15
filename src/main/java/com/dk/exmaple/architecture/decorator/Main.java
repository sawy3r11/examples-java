package com.dk.exmaple.architecture.decorator;

public class Main {

    public static void main(String[] args) {
        TemperatureSensor electric = new ElectricThermometer();
        electric.getTemperature();

        TemperatureSensor decorator = new ThermometerDecorator(electric);
        decorator.getTemperature();
    }
}
