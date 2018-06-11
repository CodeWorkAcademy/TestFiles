package com.nguyen.week3;

public class CarApp {

    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle();
        myVehicle.setSpeed(65);
        System.out.println("My vehicle" + myVehicle.start());
        System.out.println("My vehicle" + myVehicle.accelerate());
        myVehicle.readSpeed();
        System.out.println("My vehicle" + myVehicle.stop());
        System.out.println();

        Car myCar = new Car();
        myCar.setColor("red");
        myCar.setYear(2019);
        myCar.setManufacturer("Porsche");
        myCar.setModel("Cayenne");
        myCar.setWeight(4377);
        myCar.setSpeed(70);
        System.out.println();

        System.out.println(myCar.start());
        System.out.println(myCar.accelerate());
        myCar.readSpeed();
        System.out.println(myCar.stop());

    }

}
