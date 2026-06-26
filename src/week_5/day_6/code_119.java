package week_5.day_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//  Employee
class Employee {
    private String name;
    private int empId;
    private String department;

    public Employee(String name, int empId, String department) {
        this.name = name;
        this.empId = empId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "ID: " + empId + " | Name: " + name + " | Department: " + department;
    }
}

// 2. Company Business Logic
class CompanyRecord {
    // Initialized the list to prevent NullPointerException
    private List<Employee> employeeDetail = new ArrayList<>();

    // Add employee method
    public void addEmployee(Employee emp) {
        employeeDetail.add(emp);
    }

    // Searches and prints the employee matching the Unique Employee ID
    public void searchById(int id) {
        boolean found = false;
        for (Employee emp : employeeDetail) {
            if (emp.getEmpId() == id) {
                System.out.println(emp);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    // Searches and prints all employees matching the given department
    public void searchByDepartment(String dept) {
        boolean found = false;
        for (Employee emp : employeeDetail) {
            if (emp.getDepartment().equalsIgnoreCase(dept)) {
                System.out.println(emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found in department: " + dept);
        }
    }
}

public class code_119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CompanyRecord record = new CompanyRecord();

        // Seeding initial employee data
        Employee emp1 = new Employee("Raftaar", 101, "Engineering");
        Employee emp2 = new Employee("Badshah", 102, "Marketing");
        Employee emp3 = new Employee("YoYo", 103, "Engineering");

        record.addEmployee(emp1);
        record.addEmployee(emp2);
        record.addEmployee(emp3);

        System.out.println("                 EMPLOYEE MANAGEMENT SYSTEM                   ");
        System.out.println("Search employee details: 1 --> By ID | 2 --> By Department");
        System.out.print("Enter choice: ");

        int choice = input.nextInt();
        input.nextLine(); // Clear the buffer

        if (choice == 1) {
            System.out.print("Enter Employee ID: ");
            int id = input.nextInt();
            record.searchById(id);
        }
        else if (choice == 2) {
            System.out.print("Enter Department Name (e.g., Engineering, Marketing): ");
            String department = input.nextLine();
            record.searchByDepartment(department);
        }
        else {
            System.out.println("Enter a valid choice.");
        }

        input.close();
    }
}