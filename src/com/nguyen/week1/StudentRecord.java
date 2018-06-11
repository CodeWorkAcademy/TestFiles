package com.nguyen.week1;

import java.util.Scanner;

public class StudentRecord {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String fname, lname, status;
        double gpa;
        int hours;

        System.out.print("Student's First Name? ");
        fname = keyboard.next();

        System.out.print("Student's Last Name? ");
        lname = keyboard.next();

        System.out.print("Student's GPA? ");
        gpa = keyboard.nextDouble();

        System.out.print("Student's Current Course Load? ");
        hours = keyboard.nextInt();

        if (hours>=12) {
            System.out.println("\n **************** Student Record **************** \n");
            System.out.println("Student Name: " + fname + " " + lname);
            System.out.println("Student GPA: " + gpa);
            if (gpa >= 3.0) {
                System.out.println("This student is in good standing.");
            } else if (gpa >= 2.0) {
                System.out.println("This student needs to study more.");
            } else if (gpa >= 1.0) {
                System.out.println("This student is on academic probation.");
            } else {
                System.out.println("This student has been expelled.");
            }
        }
        else {
            System.out.println("This student is not enrolled full-time.");
        }
    }
}

