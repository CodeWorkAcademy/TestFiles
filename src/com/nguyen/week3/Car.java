package com.nguyen.week3;

public class Car extends Vehicle {

    private String color;
    private String manufacturer;
    private String model;
    private int year;
    private int weight;

    public Car() {
        super();
        System.out.println("A car has been created!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String start() {
        return year+" "+manufacturer+" "+model+super.start();
    }

    @Override
    public String accelerate() {
        return year+" "+manufacturer+" "+model+super.accelerate();
    }

    @Override
    public void readSpeed() {
        super.readSpeed();
    }

    @Override
    public String stop() {
        return year+" "+manufacturer+" "+model+super.stop();
    }
}
