package com.nguyen.week2;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of rows: ");
        int userRows = sc.nextInt();

        for (int row=1; row<=userRows; row++) {
            // Accommodate for the first row of the triangle
            if (row==1) {
                System.out.println(1);
            }
            else {
                for (int col=1; col<=row; col++) {
                    // Accommodate for the first column of the triangle
                    if (col==1) {
                        System.out.print(1);
                    }
                    // Accommodate for the last column of the triangle
                    else if (col==row) {
                        System.out.println(1);
                    }
                    else {
                        System.out.print((row-2)+(col-1));
                    }
                }
            }
        }

    }

}
