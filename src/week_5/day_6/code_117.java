package week_5.day_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Studentss {
    String name;
    int schoolId;
    String standard;

    public Studentss(String name, int rollNo, String standard) {
        this.name = name;
        this.schoolId = rollNo;
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public String getStandard() {
        return standard;
    }

    @Override
    public String toString() {
        return "Roll No: " + schoolId + " | Name: " + name + " | Class: " + standard;
    }
}

class SchoolRecord {
    // Initialized the list to prevent NullPointerException
    List<Studentss> studentDetail = new ArrayList<>();

    public void addMethod(Studentss stu) {
        studentDetail.add(stu);
    }

    // Searches and prints the student matching the Roll No / ID
    public void searchById(int id) {
        boolean found = false;
        for (Studentss stu : studentDetail) {
            if (stu.getSchoolId() == id) {
                System.out.println(stu);
                found = true;
                break; // Roll No is unique, we can stop searching
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    // Searches and prints all students matching the given class standard
    public void searchByClass(String standard) {
        boolean found = false;
        for (Studentss stu : studentDetail) {
            if (stu.getStandard().equalsIgnoreCase(standard)) {
                System.out.println(stu);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found in class: " + standard);
        }
    }
}

public class code_117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SchoolRecord rec = new SchoolRecord();

        // Initializing students
        Studentss stu1 = new Studentss("raftaar", 1, "tenth");
        Studentss stu2 = new Studentss("badshah", 2, "tenth");
        Studentss stu3 = new Studentss("yoyo", 3, "eighth");

        rec.addMethod(stu1);
        rec.addMethod(stu2);
        rec.addMethod(stu3);

        System.out.println("--------------STUDENT RECORD SYSTEM-----------------");
        System.out.println("Search student details: 1 --> By ID | 2 --> By Class");

        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            System.out.println("Enter student id:");
            int id = input.nextInt();
            rec.searchById(id);
        }
        else if (choice == 2) {
            System.out.println("Enter class standard (e.g., tenth, eighth):");
            String standard = input.nextLine();
            rec.searchByClass(standard);
        }
        else {
            System.out.println("Enter a valid choice.");
        }

        input.close();
    }
}