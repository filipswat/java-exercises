package exercises;


import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        String textString;
        String searchTerm;
        Boolean found;
        Scanner input;

        textString = "Alice was beginning to get " +
                "very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she " +
                "had peeped into the book her sister was reading, but it " +
                "had no pictures or conversations in it, 'and what is the " +
                "use of a book,' thought Alice 'without pictures or conversation?'";
        textString = textString.toLowerCase();

        input = new Scanner(System.in);
        System.out.println("Enter a search term:");
        searchTerm = input.next();
        searchTerm = searchTerm.toLowerCase();

        found = textString.contains(searchTerm);

        System.out.println(found);
    }
}
