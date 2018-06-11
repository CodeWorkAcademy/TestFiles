package com.nguyen.week1;

import java.util.Random;
import java.util.Scanner;

public class Project8Ball {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean quit = false;

        String[] defaultAnswers = new String[20];
        defaultAnswers[0]="It is certain";
        defaultAnswers[1]="It is decidedly so";
        defaultAnswers[2]="Without a doubt";
        defaultAnswers[3]="Yes definitely";
        defaultAnswers[4]="You may rely on it";
        defaultAnswers[5]="As I see it, yes";
        defaultAnswers[6]="Most likely";
        defaultAnswers[7]="Outlook good";
        defaultAnswers[8]="Yes";
        defaultAnswers[9]="Signs point to yes";
        defaultAnswers[10]="Reply hazy try again";
        defaultAnswers[11]="Ask again later";
        defaultAnswers[12]="Better not tell you now";
        defaultAnswers[13]="Cannot predict now";
        defaultAnswers[14]="Concentrate and ask again";
        defaultAnswers[15]="Don't count on it";
        defaultAnswers[16]="My reply is no";
        defaultAnswers[17]="My sources say no";
        defaultAnswers[18]="Outlook not so good";
        defaultAnswers[19]="Very doubtful";

        do {
            System.out.println("What is your question for the Magic 8-Ball?: ");
            String userQuestion = sc.next();
            userQuestion+=sc.nextLine();

            int randomNumber = rand.nextInt(defaultAnswers.length-1);
            System.out.println("YOU ASKED: " + userQuestion);
            System.out.println("MAGIC 8-BALL SAYS: " + defaultAnswers[randomNumber]);

            System.out.println("Do you want to quit?");
            String quitInput = sc.next();

            if (quitInput.equalsIgnoreCase("y") || quitInput.equalsIgnoreCase("yes")) {
                quit=true;
            }
        }
        while(quit==false);

        sc.close();
    }

}
