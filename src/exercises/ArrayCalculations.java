package exercises;

import java.util.ArrayList;

public class ArrayCalculations {
    public static Double sumArrayList(ArrayList<Double> inputList) {
        Double listSum = 0.0;

        for (Double input : inputList) {
            listSum = listSum + input;
        }

        return listSum;
    }

    public static ArrayList<String> filterStringList(ArrayList<String> stringList) {
        ArrayList<String> outputList = new ArrayList<>();

        for (String word : stringList) {
            if (word.length() == 5) {
                outputList.add(word);
            }
        }

        return outputList;
    }
}
