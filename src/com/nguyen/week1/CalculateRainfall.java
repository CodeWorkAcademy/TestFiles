package com.nguyen.week1;

import java.util.Scanner;

public class CalculateRainfall {

    public static void main(String[] args) {

        double calculation;
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the length of your roof (in feet)?: ");
        int roofLength = sc.nextInt();

        System.out.println("What is the width of your roof (in feet)?: ");
        int roofWidth = sc.nextInt();

        System.out.println("What is the inches of rainfall (in inches)?: ");
        int rainfall = sc.nextInt();

        calculation=((roofLength*12)*(roofWidth*12)*(rainfall))/231;
        System.out.println("For a "+roofWidth+"' x "+roofLength+"' roof with "+rainfall+" inches of rain.");
        System.out.println("The amount of water that fell off the roof is "+calculation+ " gallons.");

        sc.close();
    }

}
