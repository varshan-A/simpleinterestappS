package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double p, r, t, si, amount;

        System.out.println("Simple Interest Calculator");

        System.out.print("Enter Principal Amount: ");
        p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        r = sc.nextDouble();

        System.out.print("Enter Time Period: ");
        t = sc.nextDouble();

        si = (p * r * t) / 100;
        amount = p + si;

        System.out.println("Simple Interest = " + si);
        System.out.println("Total Amount = " + amount);

        sc.close();
    }
}
