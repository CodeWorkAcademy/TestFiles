package com.nguyen.week2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Eliza {

    private static int responseCounter = 0;
    private static boolean quit = false;

    private static String userInput = "";
    private static String elizaOutput = "";
    private static String splitResponse = "";

    private static String[] qualifiers = new String[3];
    private static String[] hedges = new String[3];

    private static String[] elizaResponses = new String[10];
    private static String[] userHistory = new String[10];

    public static void main(String[] args) {
        populateHedges();
        populateQualifiers();

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, I am Eliza, your personal chat-bot therapist. What is your problem? ");
        userInput = sc.next();
        sc.nextLine();

        do {
            if (responseCounter >= 10) {
                System.out.println("It is getting late, maybe we had better quit...");
                break;
            }
            else {
                System.out.println(randomHedge() + "Type Q to quit: ");
                userInput = sc.next();
                sc.nextLine();
                addUserResponse();

                if (userInput.equalsIgnoreCase("q")) {
                    System.out.println("Goodbye. Until next time...");
                    System.out.println("ELIZA: " + (Arrays.toString(elizaResponses)));
                    System.out.println("USER: " + (Arrays.toString(userHistory)));
                    quit = true;
                } else {
                    replaceWords(splitWord());
                    System.out.println(getElizaResponse());
                }
            }
            responseCounter++;
        } while (quit == false);
    }

    private static String[] splitWord() {
        elizaOutput = "";
        String[] word = userInput.split(" ");
        return word;
    }

    private static void replaceWords(String[] wordArray) {
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].equalsIgnoreCase("me") || wordArray[i].equalsIgnoreCase("i")) {
                wordArray[i] = "you";
            } else if (wordArray[i].equalsIgnoreCase("my")) {
                wordArray[i] = "your";
            } else if (wordArray[i].equalsIgnoreCase("am")) {
                wordArray[i] = "are";
            }
            elizaOutput += wordArray[i] + " ";
        }
    }

    private static String getElizaResponse() {
        splitResponse = randomQualifier() + elizaOutput;
        addElizaResponse();
        return splitResponse;
    }

    private static void addElizaResponse() {
        for (int i = 0; i < elizaResponses.length; i++) {
            if (elizaResponses[i] == null) {
                elizaResponses[i] = splitResponse;
                break;
            } else {
                continue;
            }
        }
    }

    private static void addUserResponse() {
        for (int i = 0; i < userHistory.length; i++) {
            if (userHistory[i] == null) {
                userHistory[i] = userInput;
                break;
            } else {
                continue;
            }
        }
    }

    private static String randomQualifier() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(qualifiers.length);
        return qualifiers[randomNumber];
    }

    private static String randomHedge() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(hedges.length);
        return hedges[randomNumber];
    }

    private static void populateQualifiers() {
        qualifiers[0] = "Why do you say that ";
        qualifiers[1] = "You seem to think that ";
        qualifiers[2] = "So, you are concerned that ";
    }

    private static void populateHedges() {
        hedges[0] = "Please tell me more... ";
        hedges[1] = "Many of my patients tell me the same thing... ";
        hedges[2] = "Don't worry too much... ";
    }

    private static String runPigLatin(String[] wordArray) {
        char firstLetterOfWord = ' ';
        String restOfWord = "";
        String pigLatinOutput = "";

        Random rand = new Random();
        int randomNumber = rand.nextInt(2);

        for (int i = 0; i < wordArray.length; i++) {
            for (int j = 0; j < wordArray[i].length(); j++) {
                if (j == 0) {
                    firstLetterOfWord = wordArray[i].charAt(0);
                } else {
                    restOfWord = wordArray[i].substring(j, wordArray[i].length());
                }
            }
        }

        if (firstLetterOfWord == 'a' || firstLetterOfWord == 'e' || firstLetterOfWord == 'i'
                || firstLetterOfWord == 'o' || firstLetterOfWord == 'u') {
            if (randomNumber == 0) {
                pigLatinOutput = firstLetterOfWord + restOfWord + "way";
            } else {
                pigLatinOutput = firstLetterOfWord + restOfWord + "tay";
            }
        } else {
            pigLatinOutput = restOfWord + firstLetterOfWord + "ay";
        }

        return pigLatinOutput;
    }

}
