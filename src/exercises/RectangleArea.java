package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the length:");
        length = input.nextDouble();
        input = new Scanner(System.in);
        System.out.println("Enter the width:");
        width = input.nextDouble();

        area = length * width;

        System.out.println("The area is: " + area);
    }
}
