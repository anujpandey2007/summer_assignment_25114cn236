package week_5.day_6;

// 1. Independent Top-Level Class
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isBorrowed() { return isBorrowed; }

    public void setBorrowed(boolean borrowed) { this.isBorrowed = borrowed; }

    @Override
    public String toString() {
        return "Title: " + title + " | Author: " + author + " | ISBN: " + isbn +
                " | Status: " + (isBorrowed ? "Borrowed" : "Available");
    }
}

// 2. Independent Top-Level Class (Removed 'static' and 'public')
class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Success: Book added successfully!");
        } else {
            System.out.println("Error: Library is full! Cannot add more books.");
        }
    }

    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("The library is currently empty.");
            return;
        }
        System.out.println("\n--- Library Catalog ---");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }

    public void borrowBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                if (!books[i].isBorrowed()) {
                    books[i].setBorrowed(true);
                    System.out.println("Success: You borrowed \"" + books[i].getTitle() + "\".");
                } else {
                    System.out.println("Error: This book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Error: Book with ISBN " + isbn + " not found.");
    }

    public void returnBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                if (books[i].isBorrowed()) {
                    books[i].setBorrowed(false);
                    System.out.println("Success: Returned \"" + books[i].getTitle() + "\".");
                } else {
                    System.out.println("Error: This book wasn't borrowed.");
                }
                return;
            }
        }
        System.out.println("Error: Book with ISBN " + isbn + " not found.");
    }
}

// 3. The Main Public Class (Matches file name: code_118.java)
public class code_118 {
    public static void main(String[] args) {
        Library library = new Library(50);

        library.addBook(new Book("1984", "George Orwell", "102"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "103"));

        library.displayBooks();
    }
}