package com.objectmodelling;
import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    String libraryName;
    ArrayList<Book> books;

    Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    void addBook(Book b) {
        books.add(b);
    }

    void showBooks() {
        System.out.println("\nBooks in " + libraryName + ":");
        for (Book b : books) {
            b.displayBook();
        }
    }
}

public class AggregationDemo {
    public static void main(String[] args) {

        // Book objects (independent)
        Book b1 = new Book("Clean Code", "Robert C. Martin");
        Book b2 = new Book("Effective Java", "Joshua Bloch");

        // Library objects
        Library lib1 = new Library("Central Library");
        Library lib2 = new Library("College Library");

        // Adding books to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b1); // Same book added to another library

        // Display books
        lib1.showBooks();
        lib2.showBooks();
    }
}

