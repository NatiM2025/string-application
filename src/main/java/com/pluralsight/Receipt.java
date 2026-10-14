package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String item = "appels";
        double price = 2.10;
        int quantity = 3;
        double total = quantity * price;

        System.out.println("You bought:" + quantity + " "+ item + " for:$" + total );

    }
}
