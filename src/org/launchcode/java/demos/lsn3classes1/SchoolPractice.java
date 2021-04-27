package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student liz = new Student("Liz", 5005, 1, 4.0);
        System.out.println("Student: " + liz.getName() + "\nStudent: Id " + liz.getStudentId() + "\nNumber Of Credits: " + liz.getNumberOfCredits() + "\nGpa: " + liz.getGpa());
    }
}
