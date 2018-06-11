package com.nguyen.week2;

import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using the information provided in the previous two content pages for the course,
        // create a program which prompts the user for the Month and Year and prints out to the console a calendar
        // for the given month and year.

        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] startDayOfMonth = {};

        System.out.println("Enter in the year: ");
        int yearInput = sc.nextInt();

        System.out.println("Enter in the month (1-12): ");
        int monthInput = sc.nextInt();

        // Accommodate for the leap year and additional date in February
        if (yearInput % 4 == 0 && yearInput % 100 != 0 || (yearInput % 400 == 0 && monthInput % 2 == 0)) {
            // Should only fix the third index in days
            days[2] = 29;
        }

        // To be continued
        // Reference: https://stackoverflow.com/questions/35679827/how-to-display-calendar-in-java

//        System.out.println("\t\t"+months[monthInput]+"\t"+yearInput+"\t");
//        // Display the lines
//        System.out.println("____________________________");
//        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
//
//        for (int i=0; i<days[monthInput]; i++) {
//
//        }


        // Josh's code

//        int dayDisplay[][] = new int[5][7];
//        GregorianCalendar gc = new GregorianCalendar(yearInput, monthInput, 1);
//        int startDay = gc.get(java.util.Calendar.DAY_OF_WEEK) - 1;
//        int k = 1;
//        for (int w = 0; w < 5; w++) {
//            for (int d = startDay; d < 7; d++) {
//                dayDisplay[w][d] = k;
//                k++;
//            }
//            startDay = 0;
//        }
////        for (int i=0; i<dayDisplay.length; i++) {
////            for (int j=0; j<=i; j++) {
////                System.out.println(dayDisplay[i][j]);
////            }
////        }


        sc.close();
    }

}
