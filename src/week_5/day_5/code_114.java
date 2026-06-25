package week_5.day_5;

import java.util.Scanner;

//  Base Class: Encapsulates basic array modifications
class ArrayContainer {
    protected int[] array;
    protected int currentSize;
    protected final int MAX_CAPACITY;

    public ArrayContainer(int capacity) {
        this.MAX_CAPACITY = capacity;
        this.array = new int[capacity];
        this.currentSize = 0;
    }

    public int getCurrentSize() { return currentSize; }
    public int getCapacity() { return MAX_CAPACITY; }

    // Insertion operation
    public boolean insert(int element) {
        if (currentSize >= MAX_CAPACITY) {
            System.out.println("Error: Array is full! Cannot insert.");
            return false;
        }
        array[currentSize] = element;
        currentSize++;
        return true;
    }

    // normal array operation
    public void display() {
        if (currentSize == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array elements: [ ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}

// claas which extend normal array operation
class SearchableArray extends ArrayContainer {

    public SearchableArray(int capacity) {
        super(capacity); // Invoke parent constructor
    }

    // Linear Search operation
    public int linearSearch(int target) {
        for (int i = 0; i < currentSize; i++) {
            if (array[i] == target) {
                return i; // Target found at index i
            }
        }
        return -1; // Target not found
    }
}

// User Interface Class
class ArrayUI {
    private Scanner scanner;
    private SearchableArray dataArray;

    // constructor
    public ArrayUI() {
        this.scanner = new Scanner(System.in);
        // Initialize the array with a maximum structural capacity of 10 elements
        this.dataArray = new SearchableArray(10);
    }

    public void start() {
        int choice;
        do {
            System.out.println("\n===== ARRAY OPERATIONS MENU =====");
            System.out.println("1. Insert Element");
            System.out.println("2. Display Array (Traverse)");
            System.out.println("3. Search Element (Linear Search)");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");

            choice = scanner.nextInt();
            processChoice(choice);
        } while (choice != 4);

        scanner.close();
    }

    private void processChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter an integer to insert: ");
                int value = scanner.nextInt();
                if (dataArray.insert(value)) {
                    System.out.println("Successfully inserted " + value);
                }
                break;
            case 2:
                dataArray.display();
                break;
            case 3:
                System.out.print("Enter element to search for: ");
                int target = scanner.nextInt();
                int index = dataArray.linearSearch(target);
                if (index != -1) {
                    System.out.println("Element found at index position: " + index);
                } else {
                    System.out.println("Element not found in the array.");
                }
                break;
            case 4:
                System.out.println("Exiting Array System. Goodbye!");
                break;
            default:
                System.out.println("Invalid entry! Choose from options 1-4.");
        }
    }
}

public class code_114 {
    public static void main(String[] args) {
        // Instantiate the application layer and run
        ArrayUI app = new ArrayUI();
        app.start();
    }
}
