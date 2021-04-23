package exercises.controlflowandcollections;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class HashMapsPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your student's names (or ENTER to finish):");

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("ID Number: ");
                Integer id = input.nextInt();
                students.put(newStudent, id);

                input.nextLine();
            }
        } while (!newStudent.equals(""));
        System.out.println("\nClass roster: ");
        int ids = 0;

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            ids += student.getValue();

        }
    }
}
