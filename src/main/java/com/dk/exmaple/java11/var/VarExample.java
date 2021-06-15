package com.dk.exmaple.java11.var;

import java.util.ArrayList;

public class VarExample {
    public static void main(String[] args) {
        var car = new Car("Golf", "Wolkswage");

        // list without type
        var list = new ArrayList<>(); // its object list
        list.add(car);
        list.add(new Object());

        // list with type
        var carList = new ArrayList<Car>();
        carList.add(car);

        var objectWrapperForString = new ObjectWrapper<>("value string", "description for string");
        var objectWrapperForCar = new ObjectWrapper<>(new Car("Vectra", "Opel"), "Description for car OPEL!");
        var opelVectra = objectWrapperForCar.getValue();
    }
}
