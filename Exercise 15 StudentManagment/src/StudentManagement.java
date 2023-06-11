/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.06.03 StudentManagment\src\StudentManagment.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.06.03 StudentManagment\src
*    Created Date: Saturday, June 3rd 2023, 8:23:44 pm
*    Author: Björn Metzger
*    -----
*    Last Modified: Sat Jun 03 2023
*    Modified By: Björn Metzger
*    -----
*    Copyright (c) 2023 Desma.Africa
*    
*    MIT License
*    For more information, please refer to the Licence File included in the root folder.
*    -----
*    HISTORY:
*    Date      	By	Comments
*    ----------	---	----------------------------------------------------------
*/    




import java.util.Scanner;
import modules.Student;

/**
 * The StudentManagement class provides a menu-driven program for managing student records.
 */
public class StudentManagement {

    /**
     * Main method to start the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Student[] students = new Student[200]; // Array to store student objects
        boolean continueProgram = true;
        Scanner scanner = new Scanner(System.in);

        while (continueProgram) {
            clearScreen();

            System.out.println("Select the type of operation:");
            System.out.println("1. Enroll student");
            System.out.println("2. Edit student");
            System.out.println("3. Output data of all students");
            System.out.println("4. Expel student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading the integer

            switch (choice) {
                case 1:
                    enrollStudent(students, scanner);
                    break;
                case 2:
                    editStudent(students, scanner);
                    break;
                case 3:
                    outputAllStudents(students, scanner);
                    break;
                case 4:
                    expelStudent(students, scanner);
                    break;
                case 5:
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    /**
     * Enrolls a new student.
     *
     * @param students array of students
     * @param scanner  scanner object for user input
     */
    public static void enrollStudent(Student[] students, Scanner scanner) {
        clearScreen();
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = Student.createStudent(scanner);
                System.out.println("Student enrolled successfully. Student ID: " + i);
                waitForInput(scanner);
                return;
            }
        }
        System.out.println("Cannot enroll student. The student array is full.");
        waitForInput(scanner);
    }

    /**
     * Edits an existing student's data.
     *
     * @param students array of students
     * @param scanner  scanner object for user input
     */
    public static void editStudent(Student[] students, Scanner scanner) {
        clearScreen();
        System.out.print("Enter the student ID to edit: ");
        int studentID = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the integer

        if (isValidStudentID(studentID, students)) {
            Student.manipulateStudent(students[studentID], scanner);
        } else {
            System.out.println("Invalid student ID!");
        }
        waitForInput(scanner);
    }

    /**
     * Outputs the data of all students.
     *
     * @param students array of students
     * @param scanner  scanner object for user input
     */
    public static void outputAllStudents(Student[] students, Scanner scanner) {
        clearScreen();
        boolean foundStudent = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                students[i].dataOutput();
                System.out.println();
                foundStudent = true;
            }
        }
        if (!foundStudent) {
            System.out.println("No students found.");
        }
        waitForInput(scanner);
    }

    /**
     * Expels a student.
     *
     * @param students array of students
     * @param scanner  scanner object for user input
     */
    public static void expelStudent(Student[] students, Scanner scanner) {
        clearScreen();
        System.out.print("Enter the student ID to expel: ");
        int studentID = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the integer

        if (isValidStudentID(studentID, students)) {
            students[studentID] = null;
            System.out.println("Student expelled successfully.");
        } else {
            System.out.println("Invalid student ID!");
        }
        waitForInput(scanner);
    }

    /**
     * Checks if the student ID is valid.
     *
     * @param studentID the student ID to check
     * @param students  array of students
     * @return true if the student ID is valid, false otherwise
     */
    private static boolean isValidStudentID(int studentID, Student[] students) {
        return studentID >= 0 && studentID < students.length && students[studentID] != null;
    }

    /**
     * Clears the console screen.
     */
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Waits for user input to continue.
     *
     * @param scanner scanner object for user input
     */
    public static void waitForInput(Scanner scanner) {
        System.out.println("Press any key to continue...");
        scanner.nextLine(); // Wait for the user to press Enter
    }

}
