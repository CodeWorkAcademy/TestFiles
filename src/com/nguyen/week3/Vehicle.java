package com.nguyen.week3;

public class Vehicle {

    public int speed;

    public Vehicle() {
        System.out.println("A vehicle has been created!");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String start() {
        return " is starting...";
    }

    public String accelerate() {
        return " is accelerating...";
    }

    public void readSpeed() {
        System.out.println("This vehicle is going " + getSpeed() + " mph...");
    }

    public String stop() {
        return " is stopping...";
    }



}
