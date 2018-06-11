package com.nguyen.week1;

import java.util.Scanner;

public class TriangleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean equilateralTriangle=false;
        boolean rightTriangle=false;

        System.out.println("Enter the first side's length of the triangle: ");
        int firstSide = sc.nextInt();

        System.out.println("Enter the second side's length of the triangle: ");
        int secondSide = sc.nextInt();

        System.out.println("Enter the third side's length of the triangle: ");
        int thirdSide = sc.nextInt();

        // Checks if the triangle is equilateral (same length on all sides)
        if (firstSide==secondSide && secondSide==thirdSide) {
            equilateralTriangle=true;
        }
        // Checks if it is a right triangle (A^2)+(B^2)=(C^2)
        else {
            // First side has the largest length
            if (firstSide>secondSide && firstSide > thirdSide) {
                if ((firstSide*firstSide)==((secondSide*secondSide)+(thirdSide*thirdSide))) {
                    rightTriangle=true;
                }
            }
            // Second side has the largest length
            else if (secondSide>firstSide && secondSide>thirdSide) {
                if ((secondSide*secondSide)==((firstSide*firstSide)+(thirdSide*thirdSide))) {
                    rightTriangle=true;
                }
            }
            // Third side has the largest length
            else {
                if ((thirdSide*thirdSide)==((firstSide*firstSide)+(secondSide*secondSide))) {
                    rightTriangle=true;
                }
            }
        }

        if (equilateralTriangle) {
            System.out.println("This an equilateral triangle.");
        }
        else if (rightTriangle) {
            System.out.println("This is a right triangle.");
        }
        else {
            System.out.println("This is not a right triangle");
        }

        sc.close();
    }

}
