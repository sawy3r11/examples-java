package com.dk.exmaple.architecture.decorator;

public class ThermometerDecorator implements TemperatureSensor {
    private TemperatureSensor temperatureSensor;

    public ThermometerDecorator(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
    }

    @Override
    public double getTemperature() {
        double result = temperatureSensor.getTemperature();
        System.out.println("DECORATOR|Result: "+result);
        return result;
    }
}
