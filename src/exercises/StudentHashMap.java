package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newID;
        String newName;
        String newEntry;

        System.out.println("Enter a student ID (press Enter to finish)");

        do {
            System.out.println("Student ID");
            newEntry = input.nextLine();

            if (!newEntry.equals("")) {
                System.out.println("Student Name:");
                newName = input.next();
                newID = Integer.valueOf(newEntry);
                students.put(newID, newName);

                input.nextLine();
            }
        } while (!newEntry.equals(""));

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}
