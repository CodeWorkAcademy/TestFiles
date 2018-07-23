package com.nguyen.week2;

import java.util.Random;
import java.util.Scanner;

public class VariationOnPig {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        String userInput="";
        int firstDice, secondDice;
        int currDiceTotal;
        int gameTotal = 0;

        do  {

            System.out.println("Rolling dice...");
            firstDice = 1 + rand.nextInt(6);
            secondDice = 1 + rand.nextInt(6);
            currDiceTotal = firstDice + secondDice;

            if (firstDice == 1 && secondDice == 1) {
                gameTotal += 25;
            }
            else if (firstDice == 1 || secondDice == 1) {
                gameTotal += 0;
            }
            else {
                gameTotal += currDiceTotal;
            }

            System.out.println("You roll: " + firstDice + " and " + secondDice + ". Your score is " + gameTotal);

            System.out.print("Press Y to roll again: ");
            userInput = sc.next();

            System.out.println();

        } while (userInput.equalsIgnoreCase("y") && gameTotal <= 100);

        if (gameTotal >= 100) {
            System.out.println("Congratulations, you won!");
        }

        System.out.println("Thank you for playing PIG!");

        sc.close();

    }

}
