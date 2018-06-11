package com.nguyen.week1;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your test score: ");
        int studentTestScore = sc.nextInt();
        char studentGrade = 'F';

        // Calculate the student's grade into a range
        if (studentTestScore <= 100 && studentTestScore > 89) {
            studentGrade = 'A';
        } else if (studentTestScore <= 89 && studentTestScore > 79) {
            studentGrade = 'B';
        } else if (studentTestScore <= 79 && studentTestScore > 69) {
            studentGrade = 'C';
        } else if (studentTestScore <= 69 && studentTestScore > 59) {
            studentGrade = 'D';
        } else if (studentTestScore <= 59 && studentTestScore > 49) {
            studentGrade = 'E';
        }

        // Assign "+" and "-" depending on the student's score
        int lastGradeDigit = Integer.parseInt(Integer.toString(studentTestScore).substring(1, 2));
        //System.out.println("Last digit of grade: " + lastGradeDigit);

        if (lastGradeDigit>=7 && lastGradeDigit<=9 || studentTestScore==100) {
            System.out.println("Final Grade: " + studentGrade +"+");
        }
        else if (lastGradeDigit>=0 && lastGradeDigit<=2) {
            System.out.println("Final Grade: " + studentGrade +"-");
        }
        else {
            System.out.println("Final Grade: " + studentGrade);
        }

        // Print out message if student needs to retake the exam
        if (studentTestScore > 69) {
            System.out.println("Very good! You don't have to retake the exam!");
        }
        else {
            System.out.println("Did you even look at the book?");
        }


    }

}
