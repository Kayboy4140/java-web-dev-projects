package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of Miles Driven:");
        double miles = input.nextDouble();
        System.out.println("Amount of gas consumed (in gallons):");
        double gallonsConsumed = input.nextDouble();
        System.out.println("The car is running on " + miles / gallonsConsumed + " miles-per-gallon.");
    }
}