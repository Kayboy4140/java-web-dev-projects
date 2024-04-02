package org.launchcode;

import studios.areaofacircle.Circle;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a radius: ");
//
//        if (input.hasNextDouble()) {
//            double radius = input.nextDouble();
//
//            if (radius > 0) {
//                double area = Circle.getArea(radius);
//                System.out.println("The area of a circle of radius " + radius + " is " + area + ".");
//            } else {
//                System.out.println("Sorry, the radius must be a positive number.");
//            }
//
//        } else {
//            System.out.println("Sorry, that was not a valid number.");
//        }

        double radius;
        do{
            System.out.println("Please enter a positive value for the radius: ");

            while (!input.hasNextDouble()) {
                System.out.println("The radius must be a number! Try again!");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is " + area + ".");

        input.close();
    }
}

