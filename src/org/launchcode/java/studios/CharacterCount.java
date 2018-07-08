package org.launchcode.java.studios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

 public class CharacterCount {
    public static void main(String[] args) throws FileNotFoundException {
        // Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> charMap = new HashMap<>();

        //System.out.println("Enter words");
        //inputString = scanner.nextLine();
        // File file = new File("testfile.txt");
        Scanner scanner = new Scanner(new File("C:\\Users\\filip\\OneDrive\\Coding\\JavaLearnings\\java-exercises\\resources\\alice.txt"));

        String inputString = scanner.nextLine();
        while (scanner.hasNextLine()) {
            inputString = inputString + "\n" + scanner.nextLine();
        }
        inputString = inputString.toLowerCase();

        char[] charArr = inputString.toCharArray();
        Arrays.sort(charArr);

        for (char letter : charArr) {
            if (charMap.containsKey(letter)) {
                charMap.put(letter, charMap.get(letter) + 1);
            } else {
                charMap.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> charCount : charMap.entrySet()) {
            System.out.println(charCount.getKey() + " " + charCount.getValue());
        }
    }
}

