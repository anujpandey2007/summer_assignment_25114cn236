package week_5.day_3;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.Scanner;

// 1. Student class holding data AND managing database operations
class Student {
    private int rollNumber;
    private String name;
    private int age;
    private String course;
    private double cgpa;

    // Updated URL to point to MySQL 'school' database schema
    private static final String DB_URL = "jdbc:mysql://localhost:3306/school";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "asdfghjkl";

    // Constructor
    public Student(int rollNumber, String name, int age, String course, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.course = course;
        this.cgpa = cgpa;
    }

    // Getters
    public int getRollNumber() { return rollNumber; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public double getCgpa() { return cgpa; }

    // Static method to initialize the database table
    public static void initializeDatabase() {
        // MYSQL initial code to create of add in database
        String sql = "CREATE TABLE IF NOT EXISTS students (" +
                "  roll_number INT PRIMARY KEY," +
                "  name VARCHAR(100) NOT NULL," +
                "  age INT," +
                "  course VARCHAR(100)," +
                "  cgpa DOUBLE" +
                ");";

        // Added DB_USER and DB_PASSWORD to the connection parameters
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement()) {
            System.out.println("before database intialization");
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Database initialization error: " + e.getMessage());
        }
    }

    // student object saves *itself* to the database with this method
    public void addMethod() {
        String sql = "INSERT INTO students(roll_number, name, age, course, cgpa) VALUES(?, ?, ?, ?, ?)";

        // Added DB_USER and DB_PASSWORD to the connection parameters
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, this.rollNumber);
            pstmt.setString(2, this.name);
            pstmt.setInt(3, this.age);
            pstmt.setString(4, this.course);
            pstmt.setDouble(5, this.cgpa);

            pstmt.executeUpdate();
            System.out.println(">> Success: Student record securely saved to MySQL!");

        } catch (SQLException e) {
            if (e.getMessage().toLowerCase().contains("duplicate")) {
                System.out.println(">> Error: A student with Roll Number " + this.rollNumber + " already exists.");
            } else {
                System.out.println(">> Database error: " + e.getMessage());
            }
        }
    }

    // Static method: Searches the database and prints student info by Roll Number
    public static void searchMethod(int roll) {
        // basic sql query to find students by their roll number
        String sql = "SELECT * FROM students WHERE roll_number = ?";

        // Added DB_USER and DB_PASSWORD to the connection parameters to get connection from database
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, roll);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("\n--- Student Found ---");
                System.out.println("Roll Number: " + rs.getInt("roll_number"));
                System.out.println("Name:        " + rs.getString("name"));
                System.out.println("Age:         " + rs.getInt("age"));
                System.out.println("Course:      " + rs.getString("course"));
                System.out.println("CGPA:        " + rs.getDouble("cgpa"));
                System.out.println("----------------------");
            } else {
                System.out.println(">> No student found with Roll Number: " + roll);
            }

        } catch (SQLException e) {
            System.out.println(">> Database error: " + e.getMessage());
        }
    }

    // Static method: Searches the database and prints students meeting a minimum CGPA
    public static void searchByCgpaMethod(double minCgpa) {
        String sql = "SELECT * FROM students WHERE cgpa >= ? ORDER BY cgpa DESC";

        // Added DB_USER and DB_PASSWORD to the connection parameters
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDouble(1, minCgpa);
            ResultSet rs = pstmt.executeQuery();

            System.out.println("\n--- Students matching CGPA >= " + minCgpa + " ---");
            boolean foundAny = false;

            while (rs.next()) {
                foundAny = true;
                System.out.printf("Roll: %d | Name: %-15s | Course: %-10s | CGPA: %.2f\n",
                        rs.getInt("roll_number"),
                        rs.getString("name"),
                        rs.getString("course"),
                        rs.getDouble("cgpa"));
            }

            if (!foundAny) {
                System.out.println("No students found matching this criteria.");
            }
            System.out.println("------------------------------------------------");

        } catch (SQLException e) {
            System.out.println(">> Database error: " + e.getMessage());
        }
    }
}

// 2. Main class - Acts only as the user controller/interface
public class code_105 {
    public static void main(String[] args) {
        // Initialize table structure using the Student class static method
        Student.initializeDatabase();

        Scanner scanner = new Scanner(System.in);

        System.out.println("   STUDENT RECORD MANAGEMENT SYSTEM     ");

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Search Student by Roll Number");
            System.out.println("3. Search Students by minimum CGPA");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.println("\n--- Add New Student ---");
                    System.out.print("Enter Roll Number (ID): ");
                    int roll = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    System.out.print("Enter CGPA: ");
                    double cgpa = scanner.nextDouble();

                    // Create the student object and tell it to save itself
                    Student newStudent = new Student(roll, name, age, course, cgpa);
                    newStudent.addMethod();
                    break;

                case 2:
                    System.out.print("\nEnter Roll Number to search: ");
                    int searchRoll = scanner.nextInt();
                    Student.searchMethod(searchRoll);
                    break;

                case 3:
                    System.out.print("\nEnter minimum CGPA threshold: ");
                    double minCgpa = scanner.nextDouble();
                    Student.searchByCgpaMethod(minCgpa);
                    break;

                case 4:
                    System.out.println("Exiting application. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
        }
    }
}