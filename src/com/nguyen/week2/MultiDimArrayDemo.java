package com.nguyen.week2;

public class MultiDimArrayDemo {

    public static void main(String[] args) {

        // Create a multi-dimensional array that prints out each column and row
        String[][] tabularGrid = new String[12][5];

        for (int row=0; row<12; row++) {
            for (int col=0; col<5; col++) {
                tabularGrid[row][col] = "row " + (row+1) + " col " + (col+1);
                System.out.print(tabularGrid[row][col]+"\t");
            }
            System.out.println();
        }


        int[][] multiplicationTable = new int[12][12];

        for (int row=0; row<12; row++) {
            for (int col=0; col<12; col++) {
                multiplicationTable[row][col] = (row+1)*(col+1);
                System.out.print(multiplicationTable[row][col]+"\t");
            }
            System.out.println();
        }

    }

}
