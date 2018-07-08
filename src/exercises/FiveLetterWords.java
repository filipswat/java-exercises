package exercises;

import java.util.ArrayList;

public class FiveLetterWords {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();

        wordList.add("Hello");
        wordList.add("Goodbye");
        wordList.add("another word");
        wordList.add("fives");
        wordList.add("aaAaa");

        newList = ArrayCalculations.filterStringList(wordList);

        for (String word : newList) {
            System.out.println(word);
        }

    }
}
