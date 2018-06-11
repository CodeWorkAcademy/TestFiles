package com.nguyen.week1;

import java.util.Scanner;

public class SalesReport {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Double totalAmount = 0.00;
        boolean startLoop = true;

        do {
            System.out.print("Enter a Customer ID: ");
            int customerId = sc.nextInt();

            System.out.print("Enter a Customer Name: ");
            String customerName = sc.next();

            System.out.print("Enter a Sales Amount: ");
            Double amount = sc.nextDouble();

            System.out.print("Enter a Tax Code: ");
            String taxCode = sc.next();

            if (taxCode.equalsIgnoreCase("NRM")) {
                totalAmount = amount * 1.06;
            }
            else if (taxCode.equalsIgnoreCase("NPF")) {
                totalAmount = amount * 1.00;
            }
            else if (taxCode.equalsIgnoreCase("BIZ")) {
                totalAmount = amount * 1.45;
            }

            System.out.println("Do you want to enter another record? (Y/N)");
            String userAnswer = sc.next();

            if (userAnswer.equalsIgnoreCase("N")) {
                System.out.println("Customer ID: " + customerId);
                System.out.println("Customer Name: " + customerName);
                System.out.println("Sales Amount: $" + amount);
                System.out.println("Tax Code: " + taxCode.toUpperCase());
                System.out.println("Total Amount Due: $" + totalAmount);
                startLoop = false;
            }
        }
        while (startLoop == true);

        sc.close();

    }

}
