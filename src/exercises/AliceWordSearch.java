package exercises;

import java.util.Scanner;

public class AliceWordSearch {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her" +
                "sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the " +
                "use of a book,' thought Alice 'without pictures or conversation?";
        String firstSentence = sentence.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search for: ");
        String word = input.nextLine().toLowerCase();

        Boolean result = firstSentence.contains(word);
        System.out.println("The first sentence contains your word: " + result);

        Integer index = firstSentence.indexOf(word);
        Integer length = word.length();
        System.out.println("Your word appears at index " + index + ". Your word is " + length + " characters long.");
        String modifiedFirstSentence = firstSentence.replace(word, "");
        System.out.println(modifiedFirstSentence);
    }
}
