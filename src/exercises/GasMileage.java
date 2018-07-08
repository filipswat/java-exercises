package exercises;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        double miles;
        double gas;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter miles driven:");
        miles = input.nextDouble();
        input = new Scanner(System.in);
        System.out.println("Enter the gas used:");
        gas = input.nextDouble();

        mpg = miles / gas;

        System.out.println("Your car runs at " + mpg + " miles per gallon");
        }
    }
