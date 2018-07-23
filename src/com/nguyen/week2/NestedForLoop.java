package com.nguyen.week2;

public class NestedForLoop {

    public static void main(String[] args) {

        for (int row = 1; row <= 9; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row + "\t");
            }
            System.out.println();
        }

    }

}
