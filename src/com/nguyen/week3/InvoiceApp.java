package com.nguyen.week3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean quit = false;

        Invoice invoice = new Invoice();
        System.out.print("What is your name? ");
        String inputCustName = sc.next();

        LocalDate currDate = LocalDate.now();

        invoice.setCustomerName(inputCustName);
        invoice.setTransactionDate(currDate);

        while(quit==false) {
            Item item = new Item();

            System.out.print("Enter your item name: ");
            String itemName = sc.next();

            System.out.print("Enter your item description: ");
            String itemDescription = sc.next();

            System.out.print("Enter your item price: ");
            double itemPrice = sc.nextDouble();

            System.out.print("Enter your item quantity: ");
            int itemQuantity = sc.nextInt();

            item.setName(itemName);
            item.setDescription(itemDescription);
            item.setPrice(itemPrice);
            item.setQuantity(itemQuantity);
            item.setItemTotal(itemPrice*itemQuantity);

            invoice.addItemToInvoice(item);

            System.out.println("Do you want to add a new item? (Y/N): ");
            String userAnswer = sc.next();

            if (userAnswer.equalsIgnoreCase("n")) {
                System.out.println("Name"+"\t\t"+"Description"+"\t\t"+"Price"+"\t\t"+"Quantity"+"\t\t"+"Total");
                for (Item aItem : invoice.getItems()) {
                    System.out.println(aItem.getName()+"\t\t"+aItem.getDescription()+"\t\t\t"
                            +"$"+aItem.getPrice()+"\t\t\t"+aItem.getQuantity()+"\t\t\t"+"$"+aItem.getItemTotal());
                }

                System.out.println();
                System.out.println("Sub-Total: $" + invoice.getTotal());
                quit=true;
            }
        }






    }

}
