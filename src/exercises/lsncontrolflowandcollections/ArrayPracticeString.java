package exercises.lsncontrolflowandcollections;

import java.util.Arrays;


public class ArrayPracticeString {
    public static void main(String[] args) {
        String rhyme = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] modifiedRhyme = rhyme.split(" ");
        System.out.println(Arrays.toString(modifiedRhyme));

        String[] words = rhyme.split("\\.");
        System.out.println(Arrays.toString(words));
    }
}
