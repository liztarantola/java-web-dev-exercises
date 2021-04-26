package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student newStudent = new Student("Liz", 5005, 1, 4.0);
        System.out.println("Student: " + newStudent.getName() + "\nStudent: Id " + newStudent.getStudentId() + "\nNumber Of Credits: " + newStudent.getNumberOfCredits() + "\nGpa: " + newStudent.getGpa());
    }
}
