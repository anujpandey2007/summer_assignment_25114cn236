package week_5.day_3;

import java.util.Scanner;

// Class 1: Represents the Employee's core details
class Employee {
    int id;
    String name;
    String designation;

    // Constructor
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }
}

// Class 2: Handles all salary computations
class SalaryCalculator {
    double basicSalary;

    public SalaryCalculator(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // House Rent Allowance (HRA) calculated at 15% of basic salary
    public double calculateHRA() {
        return basicSalary * 0.15;
    }

    // Dearness Allowance (DA) calculated at 10% of basic salary
    public double calculateDA() {
        return basicSalary * 0.10;
    }

    // Provident Fund (PF) deduction at 12% of basic salary
    public double calculatePF() {
        return basicSalary * 0.12;
    }

    // Gross Salary = Basic + HRA + DA
    public double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    // Net Salary (Take-home) = Gross Salary - PF
    public double calculateNetSalary() {
        return calculateGrossSalary() - calculatePF();
    }
}

// Class 3: Main class to handle user interactions and generate the payslip
public class code_107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Salary Management System ===");

        // Step 1: Input Employee Details
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();

        // Step 2: Input Salary Details
        System.out.print("Enter Basic Salary ($): ");
        double basicSalary = scanner.nextDouble();

        // Step 3: Instantiate Objects
        Employee emp = new Employee(id, name, designation);
        SalaryCalculator calc = new SalaryCalculator(basicSalary);

        // Step 4: Generate and Print Salary Slip
        System.out.println();
        System.out.println("$$$$               EMPLOYEE SALARY SLIP              $$$$");
        System.out.println();
        System.out.printf("Employee ID   : %d\n", emp.id);
        System.out.printf("Name          : %s\n", emp.name);
        System.out.printf("Designation   : %s\n", emp.designation);
        System.out.println();
        System.out.printf("Basic Salary   : $%.2f\n", calc.basicSalary);
        System.out.printf("HRA (15%%)     : $%.2f\n", calc.calculateHRA());
        System.out.printf("DA (10%%)      : $%.2f\n", calc.calculateDA());
        System.out.println("-------------------------------------------------");
        System.out.printf("Gross Salary   : $%.2f\n", calc.calculateGrossSalary());
        System.out.printf("PF Deduct(12%%): $%.2f\n", calc.calculatePF());
        System.out.println("-------------------------------------------------");
        System.out.printf("NET PAYABLE    : $%.2f\n", calc.calculateNetSalary());
        System.out.println("-------------------------------------------------");

        scanner.close();
    }
}
