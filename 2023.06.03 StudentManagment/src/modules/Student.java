/**    
*    File: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.06.03 StudentManagment\src\modules\Student.java
*    Project: e:\OneDrive\University\1. Fächer\2. Semester\9. Informatik II\Java Code\2023.06.03 StudentManagment\src\modules
*    Created Date: Saturday, June 3rd 2023, 8:35:13 pm
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




 
package modules;
import java.util.Scanner;

/**
 * The Student class represents a student with their attributes such as first name, last name, university, etc.
 */
public class Student {
    private static int numberOfStudents = 0;
    private String firstName;
    private String lastName;
    private String university;
    private int semesterCount;
    private int birthYear;
    private boolean isFromUniversityOfAppliedSciences;
    private int studentID;

    /**
     * Default constructor for the Student class.
     * It initializes the isFromUniversityOfAppliedSciences attribute to false.
     * It also increments the numberOfStudents class variable by 1.
     */
    public Student() {
        isFromUniversityOfAppliedSciences = false;
        numberOfStudents++;
    }
    

    /**
     * Parameterized constructor for the Student class.
     * It calls the default constructor and then assigns the provided values to the respective attributes.
     *
     * @param firstName    The first name of the student.
     * @param lastName     The last name of the student.
     * @param birthYear    The birth year of the student.
     */
    public Student(String firstName, String lastName, int birthYear) {
        this(); // Call to the default constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    
    /**
     * Factory method to create a new student object based on user input.
     *
     * @return The newly created student object.
     */
    public static Student createStudent(Scanner scanner) {
    
        System.out.print("Enter the first name of the student: ");
        String firstName = scanner.nextLine();
    
        System.out.print("Enter the last name of the student: ");
        String lastName = scanner.nextLine();
    
        int birthYear = 0;
        boolean validBirthYear = false;
        while (!validBirthYear) {
            System.out.print("Enter the birth year of the student: ");
            String birthYearInput = scanner.nextLine();
    
            try {
                birthYear = Integer.parseInt(birthYearInput);
                validBirthYear = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer value for the birth year.");
            }
        }
    
        Student newStudent = new Student(firstName, lastName, birthYear);
    
        System.out.print("Enter the university of the student: ");
        String university = scanner.nextLine();
        newStudent.setUniversity(university);
    
        int semesterCount = 0;
        boolean validSemesterCount = false;
        while (!validSemesterCount) {
            System.out.print("Enter the number of semesters the student has completed: ");
            String semesterCountInput = scanner.nextLine();
    
            try {
                semesterCount = Integer.parseInt(semesterCountInput);
                validSemesterCount = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer value for the semester count.");
            }
        }
    
        boolean isFromUniversityOfAppliedSciences = false;
        boolean validIsFromUniversity = false;
        while (!validIsFromUniversity) {
            System.out.print("Is the student from a University of Applied Sciences? (true/false): ");
            String isFromUniversityInput = scanner.nextLine();
    
            if (isFromUniversityInput.equalsIgnoreCase("true")) {
                isFromUniversityOfAppliedSciences = true;
                validIsFromUniversity = true;
            } else if (isFromUniversityInput.equalsIgnoreCase("false")) {
                isFromUniversityOfAppliedSciences = false;
                validIsFromUniversity = true;
            } else {
                System.out.println("Invalid input! Please enter 'true' or 'false'.");
            }
        }
    
        newStudent.setSemesterCount(semesterCount);
        newStudent.setIsFromUniversityOfAppliedSciences(isFromUniversityOfAppliedSciences);
    
        saveToDB(newStudent);
    
        return newStudent;
    }

    /**
     * Setter method for the semesterCount attribute.
     * 
     * @param SemesterCount The number of semesters the student has completed.
     */
    public void setSemesterCount(int SemesterCount) {
        semesterCount = SemesterCount;
    }

    /**
     * Setter method for the university attribute.
     * 
     * @param University The university the student is attending.
     */
    public void setUniversity(String University) {
        university = University;
    }

    /**
     * Setter method for the isFromUniversityOfAppliedSciences attribute.
     * 
     * @param IsUfh A boolean value indicating if the student is from a University of Applied Sciences.
     */
    public void setIsFromUniversityOfAppliedSciences(boolean IsUfh) {
        isFromUniversityOfAppliedSciences = IsUfh;
    }
    
    /**
     * Getter method for the firstName attribute.
     * 
     * @return The first name of the student.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Getter method for the lastName attribute.
     * 
     * @return The last name of the student.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Getter method for the birthYear attribute.
     * 
     * @return The birth year of the student.
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Getter method for the studentID attribute.
     * 
     * @return The student identification number.
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * Getter method for the university attribute.
     * 
     * @return The university the student is attending.
     */
    public String getUniversity() {
        return university;
    }

    /**
     * Getter method for the semesterCount attribute.
     * 
     * @return The number of semesters the student has completed.
     */
    public int getSemesterCount() {
        return semesterCount;
    }

    /**
     * Getter method for the isFromUniversityOfAppliedSciences attribute.
     * 
     * @return A boolean value indicating if the student is from a University of Applied Sciences.
     */
    public boolean isFromUniversityOfAppliedSciences() {
        return isFromUniversityOfAppliedSciences;
    }

    /**
     * Class method to get the number of students.
     * 
     * @return The current value of the numberOfStudents class variable.
     */
    public static int getNumberOfStudents() {
        return numberOfStudents;
    }
    
    /**
     * Method to display the student's data.
     */
    public void dataOutput() {
        System.out.println("Student Information:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Student ID: " + studentID);
        System.out.println("University: " + university);
        System.out.println("Semester Count: " + semesterCount);
        System.out.println("From University of Applied Sciences: " + isFromUniversityOfAppliedSciences);
    }

    /**
    * Saves the student information to the database. (for now only a message is displayed i will create a version of this project where this is actually implemented)
    *
    * @param student The student object to be saved to the database.
    */
    public static void saveToDB(Student student) {
        System.out.println("Student added to the database.");
    }
    
    /**
     * Compares the semester count of two student objects and prints whether they are identical.
     *
     * @param st1 The first student object.
     * @param st2 The second student object.
     */
    public static void vergleicheSemesterZahl(Student st1, Student st2) {
        if (st1.getSemesterCount() == st2.getSemesterCount()) {
            System.out.println("The semester count of the two students is identical.");
        } else {
            System.out.println("The semester count of the two students is not identical.");
        }
    }

    /**
     * Prompts the user for the type of operation to be performed on the student object and performs the chosen option.
     * Valid options are:
     * - "semester": Change the semester count of the student.
     * - "university": Change the university location of the student.
     * - "output": Output the student's data.
     *
     * @param student The student object on which the operation will be performed.
     */
    public static void manipulateStudent(Student student, Scanner scanner) {
        if (student == null) {
            System.out.println("No active student was passed!");
            return;
        }

        System.out.println("Select the type of operation to perform:");
        System.out.println("1. Change semester count");
        System.out.println("2. Change university location");
        System.out.println("3. Change university status (From University of Applied Sciences?)");
        System.out.print("Enter the option number: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the integer

        switch (option) {
            case 1:
                System.out.print("Enter the new semester count: ");
                int newSemesterCount = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character after reading the integer
                student.setSemesterCount(newSemesterCount);
                System.out.println("Semester count changed successfully!");
                break;
            case 2:
                System.out.print("Enter the new university location: ");
                String newUniversity = scanner.nextLine();
                student.setUniversity(newUniversity);
                System.out.println("University location changed successfully!");
                break;
            case 3:
                System.out.print("Enter the new university status: ");
                String newUniversityState = scanner.nextLine();
                student.setUniversity(newUniversityState);
                System.out.println("University status changed successfully!");
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
    }

    

}