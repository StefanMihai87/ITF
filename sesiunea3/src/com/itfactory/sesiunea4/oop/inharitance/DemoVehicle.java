package com.itfactory.sesiunea4.oop.inharitance;

public class DemoVehicle {
    public static void main(String[] args) {

        Vehicle volvo = new Vehicle(2023, 1950,"Volvo v60","Red");
        Vehicle bmw = new Vehicle(2023, 1950,"M3","Blue");
        System.out.println(volvo.equals(bmw));



    }
}
