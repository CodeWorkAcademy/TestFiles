package com.nguyen.week1;

import java.util.Scanner;

public class WhatIfCompletion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, sum, max, min, product;
        double average;
        String sumMessage;

        System.out.print( "First Number: " );
        num1 = sc.nextInt();

        System.out.print( "Last Number: " );
        num2 = sc.nextInt();

        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
        sum = num1 + num2;
        product = num1 * num2;
        average = sum/2;

        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
        System.out.println("Average is: " + average);
        System.out.println("Product is: " + product);

        sumMessage = "Sum is: " + sum;

        if (sum>=200) {
            sumMessage+="*";
        }
        if (sum<=1000) {
            sumMessage = "~"+sumMessage;
        }
        System.out.println(sumMessage);

    }

}
