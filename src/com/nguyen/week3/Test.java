package com.nguyen.week3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        String userInput = " ";

        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE ");
        System.out.println("You are in a creepy house ! Would you like to go \"upstair\" or into the \"kitchen\"?");
        userInput = input.next();

        if (userInput.equalsIgnoreCase("kitchen")) {
            System.out.println("There is a long countertop with dirthy dishes everywhere. Off to one side\n" + "thre is, as you'd expect, a refrigerator. You may open the \"refrigerator\n" +
                    "or look in a \"cabinet\".");
            userInput = input.next();

        }
        if (userInput.equalsIgnoreCase("refrigerator")) {
            System.out.println("Inside the refrigerator you see food and Staff.\n " +
                    "It loos pretty nasty.\n Would you like to eat some of the food ?\"Yes\" or \"No\")");
            userInput = input.next();

        } else if (userInput.equalsIgnoreCase("YES")) {
            System.out.println("Well, then I guess you'll ever know what was in there\n"
                    + "Thanks for playing, I'm tired of making nested if statements");
        }
        if (userInput.equalsIgnoreCase("upstairs")) {
            System.out.println("Upstaris you see a hallway.\n" +
                    "At the end of the hallway is the master \"bedroom\".\n" +
                    "There is also a \"bathroom\"off the hallway.\n" + "Where would you like to go ?");
            userInput = input.next();

        } else if (userInput.equalsIgnoreCase("No")) {
            System.out.println("You die of starvation ..... eventually");

        }
        if (userInput.equalsIgnoreCase("bedroom")) {
            System.out.println("You are in a plush bedroom, with expensive-looking furniture.\n" +
                    "The bed is unmade. In the back of the room, the closet door is ajar.\n" + "Would you like to open the door?\n" +
                    "\"Yes\" or \"No\")");
            userInput = input.next();

        }
    }

}
