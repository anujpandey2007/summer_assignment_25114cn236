package week_5.day_3;


import java.util.Scanner;

// Class to store student details and calculate marks
class Student_ {
    String rollNo;
    String name;
    int[] marks = new int[5]; // Array to store marks for 5 subjects
    String[] subjects = {"Maths", "Science", "English", "History", "Geography"};

    // Constructor
    public Student_(String rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Method to calculate total marks
    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    // Method to calculate percentage
    public double calculatePercentage() {
        return calculateTotal() / 5.0;
    }

    // Method to determine Grade
    public String calculateGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "Fail";
    }
}

// Main class to handle input and output
public class code_108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Marksheet Generation System ===");

        // Taking Student Details
        System.out.print("Enter Student Roll Number: ");
        String rollNo = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        // Creating Student Object
        Student_ student = new Student_(rollNo, name);

        // Taking Marks Input
        System.out.println("\nEnter marks out of 100 for the following subjects:");
        for (int i = 0; i < student.subjects.length; i++) {
            while (true) {
                //in sequence of subject taking marks input
                System.out.print(student.subjects[i] + ": ");
                int mark = scanner.nextInt();

                // to ensure marks are between 0 and 100
                if (mark >= 0 && mark <= 100) {
                    student.marks[i] = mark;
                    break;
                } else {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                }
            }
        }

        // Generating Calculations
        int totalMarks = student.calculateTotal();
        double percentage = student.calculatePercentage();
        String grade = student.calculateGrade(percentage);

        // Displaying the Marksheet
        System.out.println("----                MARKSHEET                  ----");
        System.out.println("Name    : " + student.name);
        System.out.println("Roll No : " + student.rollNo);
        System.out.println();
        System.out.println("Subject          |  Marks Obtained");
        System.out.println();
        for (int i = 0; i < student.subjects.length; i++) {
            // Using printf for neat column alignment
            System.out.printf("%-16s |  %d\n", student.subjects[i], student.marks[i]);
        }
        System.out.println();
        System.out.println("Total Marks      : " + totalMarks + " / 500");
        System.out.printf("Percentage       : %.2f%%\n", percentage);
        System.out.println("Final Grade      : " + grade);
        System.out.println();

        scanner.close();
    }
}