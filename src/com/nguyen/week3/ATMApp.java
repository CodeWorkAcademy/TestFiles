package com.nguyen.week3;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMApp {

    static Scanner sc = new Scanner(System.in);

    static int attemptCounter=0;
    static boolean quit = false;
    static ArrayList<Account> accounts = new ArrayList<>();


    public static void main(String[] args) {
        createAccount();
        beginTransaction();
    }

    public static void createAccount() {
        Account myAccount = new Account();
        myAccount.setAccountNumber("A123456789");
        myAccount.setUsername("DPN2018");
        myAccount.setBalance(100.00);
        myAccount.setPinNumber(2018);
        accounts.add(myAccount);
        System.out.println("The account for " + myAccount.getUsername() + " has been created.");
    }

    public static void beginTransaction() {

        while(attemptCounter<3 && quit==false) {
            System.out.print("Enter your account number: ");
            String inputAccountNo = sc.next();

            for (Account tempAcc : accounts) {
                if (!tempAcc.getAccountNumber().equalsIgnoreCase(inputAccountNo)) {
                    System.out.println("Account does not exist.");
                }
                else {
                    System.out.print("Enter your pin number: ");
                    int inputPinNo = sc.nextInt();

                    if (tempAcc.getAccountNumber().equalsIgnoreCase(inputAccountNo) && tempAcc.getPinNumber()==inputPinNo) {
                        System.out.println("Welcome back " + tempAcc.getUsername() + ".");
                        System.out.print("Would you like to make a deposit or withdraw? (D/W): ");
                        String inputSelection = sc.next();

                        if (inputSelection.equalsIgnoreCase("w")) {
                            System.out.print("How much would you like to withdraw? ");
                            int inputAmount = sc.nextInt();

                            if (inputAmount>tempAcc.getBalance()) {
                                System.out.println("Error. Cannot withdraw more than current balance.");
                            }
                            else {
                                tempAcc.withdraw(inputAmount);
                                System.out.println("You have successfully withdrawn " + inputAmount);
                                System.out.println("Your current balance is: " + tempAcc.getBalance());
                                quit=true;
                            }
                        }
                        else if (inputSelection.equalsIgnoreCase("d")) {
                            System.out.print("How much would you like to deposit? ");
                            int inputAmount = sc.nextInt();

                            tempAcc.deposit(inputAmount);
                            System.out.println("You have successfully deposited $" + inputAmount);
                            System.out.println("Your current balance is: $" + tempAcc.getBalance());
                            quit=true;
                        }
                        else {
                            System.out.println("Invalid selection.");
                        }
                    }
                    else {
                        attemptCounter++;
                        System.out.println("You have " + (3-attemptCounter) + " attempts left.");
                    }
                }
            }

        }

    }


}
