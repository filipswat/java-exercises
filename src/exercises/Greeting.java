package exercises;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        String greetingText;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("What is your name?");
        greetingText = input.next();

        System.out.println("Hello, " + greetingText + ", how are you?");
    }
}
