package com.nguyen.week2;

import java.util.Random;

public class ProjectFizzBuzz {

    public static void main(String args[]) {
        runFizzBuzz();
    }

    private static void runFizzBuzz() {
        // Initialize the scanner
        //Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean quit = false;
        int countSeven = 0;
//        int countSeventeen = 0;
//        int countTwentyThree = 0;
//        int countUserVal = 0;

        // Allows user to input a value to end
        //System.out.print("Enter an ending value: ");
        //int endValue = sc.nextInt();
        int beginValue = 1+rand.nextInt(100);
        int endValue = 1+rand.nextInt(100);

        //System.out.print("Enter a multiple value: ");
        //int multipleValue = sc.nextInt();

        System.out.println("**************************************************");

        do {
            if (endValue > 1) {
                if (beginValue==endValue) {
                    System.out.println("SHAZAM!");
                }
                else if (endValue-beginValue<=10) {
                    System.out.println("This won't take long... ");
                }
                for (int i=beginValue; i<=endValue; i++) {
                    // If value is a multiple of user input, count and print
//                    if (i % multipleValue == 0) {
//                        countUserVal++;
//                        System.out.println(i +" - Multiple of "+multipleValue);
//                    }
                    // If value is a multiple of 7, count and print
                    if (i % 7 == 0) {
                        countSeven++;
                        System.out.println(i +" - Multiple of 7");
                    }
//                    // If value is a multiple of 17, count and print
//                    else if (i % 17 == 0) {
//                        countSeventeen++;
//                        System.out.println(i +" - Multiple of 17");
//                    }
//                    // If value is a multiple of 23, count and print
//                    else if (i % 23 == 0) {
//                        countTwentyThree++;
//                        System.out.println(i);
//                    }
                    // If value is divisible by 3 and 5 (or 15) print out FizzBuzz
                    else if (i % 3 == 0 && i % 5 == 0) {
                        System.out.println("FizzBuzz");
                    }
                    // If value is divisible by 3 print out Fizz
                    else if (i % 3 == 0) {
                        System.out.println("Fizz");
                    }
                    // If value is divisible by 5 print out Buzz
                    else if (i % 5 == 0) {
                        System.out.println("Buzz");
                    }
                    // Else print out all the values
                    else {
                        System.out.println(i);
                    }
                }
                System.out.println("**************************************************");
                System.out.println("Multiples of 7: " + countSeven);
//                System.out.println("Multiples of 17: " + countSeventeen);
//                System.out.println("Multiples of 23: " + countTwentyThree);
                //System.out.println("Multiples of " + multipleValue + ": " + countUserVal);

                quit=true;

            } else {
                System.out.println("Enter an ending number greater than 1.");
            }
        } while(quit==false);

        // Close the scanner
        //sc.close();
    }
}
