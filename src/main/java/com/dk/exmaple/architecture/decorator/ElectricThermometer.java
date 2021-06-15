package com.dk.exmaple.architecture.decorator;

public class ElectricThermometer implements TemperatureSensor {
    @Override
    public double getTemperature() {
        System.out.println("ELECTRIC|Result: "+20);
        return 20.0d;
    }
}
