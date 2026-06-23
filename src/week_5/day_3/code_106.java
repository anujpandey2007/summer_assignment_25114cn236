package week_5.day_3;
import java.util.ArrayList;
import java.util.List;

// 1. Base Employee Class (Encapsulation)
class Employe {
    private String id;
    private String name;
    private double baseSalary;

    //constructor
    public Employe(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    // Polymorphic method to calculate total dynamic pay
    public double calculateSalary() {
        return baseSalary; // Standard employee gets just the base salary
    }

    // Polymorphic method to display profile information
    public void displayProfile() {
        System.out.printf("ID: "+ id + " | Name: "+ name+ " | Role: Regular Employee | Total Pay: "+ calculateSalary());
        System.out.println();
    }
}

// 2. Manager Class (Inheritance & Polymorphism)
class Manager extends Employe {
    // hr can give extra bonus
    private double performanceBonus;
    private String department;

    public Manager(String id, String name, double baseSalary, double performanceBonus, String department) {
        super(id, name, baseSalary); // Call parent constructor og employee class
        this.performanceBonus = performanceBonus;
        this.department = department;
    }

    // Overriding salary calculation to include the performance bonus
    @Override
    public double calculateSalary() {
        return getBaseSalary() + performanceBonus;
    }

    // Overriding profile display
    @Override
    public void displayProfile() {
        System.out.printf("ID:"+getId() +"| Name:"+getName() +" | Role: Manager "+department + "   | Total Pay: "+calculateSalary() +" (Includes Bonus)\n");
    }
}

// 3. HRDepartment Class (Manages the collection of workforce resources)
class HRDepartment {
    private List<Employe> staffList;

    public HRDepartment() {
        this.staffList = new ArrayList<>();
    }

    // Accepts both standard Employee and Manager instances due to Polymorphism
    public void hireEmploye(Employe emp) {
        staffList.add(emp);
        System.out.println("HR System: Successfully onboarded \"" + emp.getName() + "\".");
    }

    // Process global payroll and display employee registry
    public void generatePayrollReport() {
        System.out.println("\n================================== WORKFORCE PAYROLL REPORT ==================================");

        // this involve company bonuses if any
        double totalCompanyPayroll = 0;

        for (Employe emp : staffList) {
            emp.displayProfile(); // Dynamic binding ensures managers display manager details
            totalCompanyPayroll += emp.calculateSalary();
        }

        System.out.println();
        System.out.printf("Total Corporate Payroll Outflow: $%.2f\n", totalCompanyPayroll);
        System.out.println();
    }
}


public class code_106 {
    public static void main(String[] args) {
        // Instantiate our decoupled corporate HR layer
        HRDepartment hr = new HRDepartment();

        // 1. Create standard employees
        Employe emp1 = new Employe("EMP101", "Alice Smith", 4500.00);
        Employe emp2 = new Employe("EMP102", "Bob Jones", 4800.00);

        // 2. Create a manager (Demonstrates Inheritance)
        Manager mgr1 = new Manager("MGR001", "Carol Danvers", 7500.00, 1500.00, "HR");

        System.out.println("--- Processing New Hires ---");
        hr.hireEmploye(emp1);
        hr.hireEmploye(emp2);
        hr.hireEmploye(mgr1);

        // Generate corporate payroll report showcase
        hr.generatePayrollReport();
    }
}