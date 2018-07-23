package com.nguyen.week2;

import java.util.Scanner;

public class GiftAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] giftDatabase = new String[13][3];

        giftDatabase[0][0] = "Gift Item";
        giftDatabase[0][1] = "Gender";
        giftDatabase[0][2] = "Price";

        giftDatabase[1][0] = "Weekend Getaway";
        giftDatabase[1][1] = "Female";
        giftDatabase[1][2] = "High";

        giftDatabase[2][0] = "Selfie Stick";
        giftDatabase[2][1] = "Female";
        giftDatabase[2][2] = "Low";

        giftDatabase[3][0] = "Wine Bottle";
        giftDatabase[3][1] = "Female";
        giftDatabase[3][2] = "Low";

        giftDatabase[4][0] = "Perfume";
        giftDatabase[4][1] = "Female";
        giftDatabase[4][2] = "Medium";

        giftDatabase[5][0] = "Sweater";
        giftDatabase[5][1] = "Female";
        giftDatabase[5][2] = "Medium";

        giftDatabase[6][0] = "Smart TV";
        giftDatabase[6][1] = "Male";
        giftDatabase[6][2] = "High";

        giftDatabase[7][0] = "Apple Watch";
        giftDatabase[7][1] = "Male";
        giftDatabase[7][2] = "High";

        giftDatabase[8][0] = "Books";
        giftDatabase[8][1] = "Male";
        giftDatabase[8][2] = "Low";

        giftDatabase[9][0] = "Shoes";
        giftDatabase[9][1] = "Male";
        giftDatabase[9][2] = "Low";

        giftDatabase[10][0] = "Guitar";
        giftDatabase[10][1] = "Male";
        giftDatabase[10][2] = "Medium";

        giftDatabase[11][0] = "Playstation";
        giftDatabase[11][1] = "Male";
        giftDatabase[11][2] = "Medium";

        giftDatabase[12][0] = "Jewelry";
        giftDatabase[12][1] = "Female";
        giftDatabase[12][2] = "High";

        System.out.println("Enter the gender you are shopping for (Male or Female): ");
        String genderInput = sc.next();

        System.out.println("Enter your budget (Low, Medium, or High): ");
        String budgetInput = sc.next();

        int[] resultRow = new int[giftDatabase.length];

        for (int row=1; row<giftDatabase.length; row++) {
            if (giftDatabase[row][1].contains(genderInput) && giftDatabase[row][2].contains(budgetInput)) {
                for (int i=0; i<resultRow.length; i++) {
                    if (resultRow[i]==0) {
                        resultRow[i] = row;
                        break;
                    }
                }
            }
        }

        String giftResult = "";
        for (int i=0; i<resultRow.length; i++) {
            giftResult += giftDatabase[resultRow[i]][0] + ", ";
        }

        System.out.println("Based on the recipient's gender and your budget, the gift you should get is: " + giftResult);

    }

}
