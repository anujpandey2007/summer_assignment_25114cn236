package week_5.day_4;

import java.util.ArrayList;
import java.util.Scanner;

// Book
class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // New books are available by default
    }

    // Getters and Setters of book
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void displayBookInfo() {
        String status = isAvailable ? "Available" : "Borrowed";
        System.out.println("ISBN:"+ isbn+" | Title: "+ title+" | Author: "+ author +" | Status: "+status);
    }
}

//Library Member
class Member {
    private int memberId;
    private String name;
    private ArrayList<Book> borrowedBooks;

    //constructor of library member
    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    //getters of library member

    public int getMemberId() {
        return memberId;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    //Methods that  library member can perform
    public void borrowBook(Book book) {

        borrowedBooks.add(book);
    }

    //Methods that  library member can perform

    public void returnBook(Book book) {

        borrowedBooks.remove(book);
    }
}

//Actual library class
class Library {
    //books arraylist to deal with book and member to managae members of library
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    // Add Methods
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully: " + book.getTitle());
    }

    // register method
    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member registered successfully: " + member.getName());
    }

    // Search Methods
    public Book findBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equalsIgnoreCase(isbn)) return b;
        }
        return null;
    }

    // find member method
    public Member findMember(int id) {
        for (Member m : members) {
            if (m.getMemberId() == id) return m;
        }
        return null;
    }

    // Transaction Methods
    public void issueBook(String isbn, int memberId) {
        Book book = findBook(isbn);
        Member member = findMember(memberId);

        if (book == null) {
            System.out.println("Error: Book not found!");
            return;
        }
        if (member == null) {
            System.out.println("Error: Member not registered!");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println("Error: Book is already borrowed by someone else.");
            return;
        }

        book.setAvailable(false);
        member.borrowBook(book);
        System.out.println("Success: '" + book.getTitle() + "' issued to " + member.getName() + ".");
    }

    // return book method
    public void returnBook(String isbn, int memberId) {
        Book book = findBook(isbn);
        Member member = findMember(memberId);

        if (book != null && member != null && member.getBorrowedBooks().contains(book)) {
            book.setAvailable(true);
            member.returnBook(book);
            System.out.println("Success: '" + book.getTitle() + "' returned by " + member.getName() + ".");
        } else {
            System.out.println("Error: Invalid return transaction details.");
        }
    }

    // display book method
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        System.out.println("\n--- Library Catalog ---");
        for (Book b : books) {
            b.displayBookInfo();
        }
    }
}

// Main Menu Application
public class code_109 {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Seeding initial data for testing
        library.addBook(new Book("101", "Java Programming", "munshi"));
        library.addBook(new Book("102", "Clean Code", "harish"));
        library.registerMember(new Member(1, "yoyo"));
        library.registerMember(new Member(2, "ikka"));

        while (true) {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add a Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(isbn, title, author));
                    break;

                case 2:
                    library.displayAllBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ISBN to Issue: ");
                    String issueIsbn = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    int issueMemId = scanner.nextInt();
                    library.issueBook(issueIsbn, issueMemId);
                    break;

                case 4:
                    System.out.print("Enter Book ISBN to Return: ");
                    String retIsbn = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    int retMemId = scanner.nextInt();
                    library.returnBook(retIsbn, retMemId);
                    break;

                case 5:
                    System.out.println("Exiting System. Thank you!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Option! Try again.");
            }
        }
    }
}
