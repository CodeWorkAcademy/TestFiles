package com.nguyen.week2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Dated {

    public static void main(String[] args) {
        //The date entered in day, Month (3 letters) and year (4 digit) format
        //The date entered in Month (3 letters), day  and year (4 digit) format
        //The date entered in day, month (2 digits) and year format
        //Add output before each line to explain the format the user is looking at.
        //If the date the user enters is after today, the program should loop until the user enters a date on or before today.
        //If the date the user enters  is NOT in dd/mm/yyyy format, the user should be prompted to re-enter the date.

        /* *************************************** */
        Scanner sc = new Scanner(System.in);
        LocalDate currentDate= LocalDate.now();
        LocalDate userDate = null;
        boolean firstStop = false;
        boolean secondStop = false;

        System.out.println("CUSTOM or CURRENT date?");
        String dateChoiceInput = sc.next();

        //Set up formatters so that you can use them later
        DateTimeFormatter firstFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
        DateTimeFormatter secondFormat = DateTimeFormatter.ofPattern("MMM dd yyyy");
        DateTimeFormatter thirdFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (firstStop==false) {
            if (dateChoiceInput.equalsIgnoreCase("current")) {

                System.out.println("Format of \"01 Jan 0000\": "+currentDate.format(firstFormat));
                System.out.println("Format of \"Jan 01 0000\": "+currentDate.format(secondFormat));
                System.out.println("Format of \"01/01/0000\": "+currentDate.format(thirdFormat));
                // System.out.println("Format of \033[1m 01/01/0000 \033[0m: "+currentDate.format(thirdFormat));
                // Example of a bolded string console output using n=1
                // n=3 should be italicized but not visible in intellij console
                firstStop=true;

            }
            else if (dateChoiceInput.equalsIgnoreCase("custom")){
                while (secondStop==false) {
                    System.out.println("Enter the custom date: ");
                    String userDateInput = sc.next();
                    // Convert string to parsable date-time format
                    userDate = LocalDate.parse(userDateInput);
                    // Make sure the format aligns with the dd/MM/yyyy
                    String formatParseDate = userDate.format(thirdFormat);

                    if (userDateInput.equals(formatParseDate)) {
                        if (userDate.isBefore(currentDate)) {
                            System.out.println("Format of \"01 Jan 0000\": "+userDate.format(firstFormat));
                            System.out.println("Format of \"Jan 01 0000\": "+userDate.format(secondFormat));
                            System.out.println("Format of \"01/01/0000\": "+userDate.format(thirdFormat));
                            secondStop=true;
                            firstStop=true;
                        }
                        else {
                            System.out.println("The entered date is after today's date. Please try again.");
                        }
                    }
                    else {
                        System.out.println("Parsed input: "+userDate);
                        System.out.println("Date input from user: "+userDateInput);
                        System.out.println("The date is NOT in dd/MM/yyyy format. Please try again.");
                    }
                }

            }
            else {
                System.out.println("Invalid choice. Choose CUSTOM or CURRENT only.");
            }
        }

        sc.close();

        /* *************************************** */




    }

}
