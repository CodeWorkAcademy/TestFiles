package com.nguyen.week2;

import java.util.Scanner;

public class MovieList2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;

        String[] movies = new String[50];

        do {
            System.out.println("Enter the name of your favorite movie: ");
            String userMovie = sc.next();

            for (int i=0; i<movies.length; i++) {
                if (userMovie.equalsIgnoreCase(movies[i])) {
                    System.out.println("Movie already exists.");
                    break;
                }
                else if (movies[i]==null) {
                    movies[i]=userMovie;
                    break;
                }
                else {
                    continue;
                }
            }

            System.out.println("Do you want to quit? (Q to quit)");
            String quitInput = sc.next();

            if (quitInput.equalsIgnoreCase("q")) {
                quit=true;
            }
        }
        while (quit==false);

        System.out.println("Current movie list: ");
        for (int i=0; i<movies.length; i++) {
            if (movies[i]!=null) {
                System.out.println(movies[i]);
            }
        }

        sc.close();
    }

}
