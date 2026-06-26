package week_5.day_6;

import java.util.Scanner;

public class code_120 {

    private static final int MAX_VEHICLES = 5;

    private static String[] vehicleNames = new String[MAX_VEHICLES];
    private static String[] vehicleIds = new String[MAX_VEHICLES];
    private static boolean[] isRented = new boolean[MAX_VEHICLES];
    private static double[] rentalRates = new double[MAX_VEHICLES];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Initialize data using a function
        initializeFleet();

        boolean running = true;
        System.out.println("====== WELCOME TO MINI DRIVE RENTAL SYSTEM ======");

        while (running) {
            displayMenu();
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear scanner buffer

            switch (choice) {
                case 1:
                    displayFleet();
                    break;

                case 2:
                    System.out.print("Enter the Vehicle ID you want to rent: ");
                    String rentId = scanner.nextLine().trim();
                    System.out.print("Enter number of days to rent: ");
                    int days = scanner.nextInt();

                    // Function to process rental
                    processRental(rentId, days);
                    break;

                case 3:
                    System.out.print("Enter the Vehicle ID you want to return: ");
                    String returnId = scanner.nextLine().trim();

                    processReturn(returnId);
                    break;

                case 4:
                    System.out.print("Search by vehicle name keywords: ");
                    String keyword = scanner.nextLine().trim();

                    // Function to search using String manipulation
                    searchVehicleByName(keyword);
                    break;

                case 5:
                    System.out.println("Thank you for using Mini Drive. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please select between 1 and 5.");
            }
        }
        scanner.close();
    }

    // seeding initial data into the  arrays
    public static void initializeFleet() {
        vehicleNames[0] = "Thar SUV";      vehicleIds[0] = "V101"; isRented[0] = false; rentalRates[0] = 3500.0;
        vehicleNames[1] = "Swift Hatch";   vehicleIds[1] = "V102"; isRented[1] = false; rentalRates[1] = 1500.0;
        vehicleNames[2] = "City Sedan";    vehicleIds[2] = "V103"; isRented[2] = true;  rentalRates[2] = 2200.0;
        vehicleNames[3] = "Fortuner 4x4";  vehicleIds[3] = "V104"; isRented[3] = false; rentalRates[3] = 5000.0;
        vehicleNames[4] = "Innova MPV";    vehicleIds[4] = "V105"; isRented[4] = false; rentalRates[4] = 4000.0;
    }

    // Display system menu
    public static void displayMenu() {
        System.out.println("\n-------------------------------------------------");
        System.out.println("1. View Available Fleet");
        System.out.println("2. Rent a Vehicle");
        System.out.println("3. Return a Vehicle");
        System.out.println("4. Search Vehicle by Name");
        System.out.println("5. Exit Application");
        System.out.println("-------------------------------------------------");
    }

    // Display all fleet items mapping index across arrays
    public static void displayFleet() {
        System.out.println("\nID\t| Vehicle Name\t\t| Rate/Day\t| Status");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < MAX_VEHICLES; i++) {
            String status = isRented[i] ? "Rented" : "Available";
            System.out.printf("%s\t| %-18s\t| Rs. %.2f\t| %s\n", vehicleIds[i], vehicleNames[i], rentalRates[i], status);
        }
    }

    //  searching
    public static int findVehicleIndexById(String id) {
        for (int i = 0; i < MAX_VEHICLES; i++) {
            if (vehicleIds[i].equalsIgnoreCase(id)) {
                return i; // Found vehicle at this index
            }
        }
        return -1;
    }

    //  function to rent from fleet
    public static void processRental(String id, int days) {
        int index = findVehicleIndexById(id);

        if (index == -1) {
            System.out.println("Error: Vehicle ID " + id + " does not exist.");
            return;
        }

        if (isRented[index]) {
            System.out.println("Sorry, \"" + vehicleNames[index] + "\" is already out on rent.");
        } else {
            isRented[index] = true;
            double totalCost = rentalRates[index] * days;
            System.out.println("\n--- Booking Confirmed! ---");
            System.out.println("Vehicle: " + vehicleNames[index]);
            System.out.println("Duration: " + days + " Days");
            System.out.printf("Total Bill: Rs. %.2f\n", totalCost);
        }
    }

    // Handle check-in of a vehicle
    public static void processReturn(String id) {
        int index = findVehicleIndexById(id);

        if (index == -1) {
            System.out.println("Error: Vehicle ID " + id + " does not exist.");
            return;
        }

        if (!isRented[index]) {
            System.out.println("Validation Error: This vehicle is already parked in our garage.");
        } else {
            isRented[index] = false;
            System.out.println("Success: \"" + vehicleNames[index] + "\" returned successfully.");
        }
    }

    // searching
    public static void searchVehicleByName(String keyword) {
        boolean matchFound = false;
        System.out.println("\nMatches found for \"" + keyword + "\":");

        for (int i = 0; i < MAX_VEHICLES; i++) {
            // Case-insensitive matching technique using string manipulation
            if (vehicleNames[i].toLowerCase().contains(keyword.toLowerCase())) {
                String status = isRented[i] ? "Rented" : "Available";
                System.out.println("-> [" + vehicleIds[i] + "] " + vehicleNames[i] + " | Status: " + status);
                matchFound = true;
            }
        }

        if (!matchFound) {
            System.out.println("No vehicles matched your search terms.");
        }
    }
}