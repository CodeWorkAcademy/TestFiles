package com.nguyen.week3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Invoice {

    private String customerName;
    private LocalDate transactionDate;
    private ArrayList<Item> items;

    public Invoice() {
        this.items = new ArrayList<>();
    }

    public void addItemToInvoice(Item item) {
        this.items.add(item);
    }

    public double getTotal() {
        double total = 0.0;
        for (Item aItem : items) {
            total+=aItem.getItemTotal();
        }
        return total;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
