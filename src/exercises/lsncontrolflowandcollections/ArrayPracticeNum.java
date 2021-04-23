package exercises.lsncontrolflowandcollections;

public class ArrayPracticeNum {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        for (int integer : integerArray) {
            if (integer % 2 != 0) {
                System.out.println(integer);
            }
        }
    }
}


