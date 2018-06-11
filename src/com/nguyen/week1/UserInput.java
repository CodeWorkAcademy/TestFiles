package com.nguyen.week1;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first initial: ");
        String firstInitial = sc.next();

        System.out.println("Enter the last name: ");
        String lastName = sc.next();

        System.out.println("Enter the house number: ");
        int houseNumber = sc.nextInt();

        System.out.println("Enter the street name: ");
        String streetName = sc.next();

        System.out.println("Enter the street type: ");
        String streetType = sc.next();

        System.out.println("Enter the city: ");
        String city = sc.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);

        sc.close();
    }

}
