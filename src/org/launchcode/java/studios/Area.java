package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Input a radius:");
        radius = input.nextDouble();

        while (radius < 0) {
            input = new Scanner(System.in);
            System.out.println("Input a radius:");
            radius = input.nextDouble();
        }

        area = Math.pow(radius,2) * Math.PI;
        System.out.println("The area is:" + area);
    }
}
