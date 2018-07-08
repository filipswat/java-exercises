package exercises;

import java.util.ArrayList;

public class PrintArraySum {
    public static void main(String[] args) {
        ArrayList<Double> testArray = new ArrayList<Double>();

        for (double i = 1; i <= 10; i++) {
            testArray.add(i);
        }

        System.out.println(ArrayCalculations.sumArrayList(testArray));

    }
}