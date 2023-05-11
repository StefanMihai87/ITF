package com.itfactory.sesiunea4.oop.inharitance;

public class Vehicle {
    // generam un constructor click drapta - generate - constructor
    int yearOfFabrication;
    int cubicCapacity;
    String name;
    String color;

    public int getYearOfFabrication() {
        return yearOfFabrication;
    }

    public void setYearOfFabrication(int yearOfFabrication) {
        this.yearOfFabrication = yearOfFabrication;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicle(int yearOfFabrication, int cubicCapacity, String name, String color) {
        this.yearOfFabrication = yearOfFabrication;
        this.cubicCapacity = cubicCapacity;
        this.name = name;
        this.color = color;


    }


}
