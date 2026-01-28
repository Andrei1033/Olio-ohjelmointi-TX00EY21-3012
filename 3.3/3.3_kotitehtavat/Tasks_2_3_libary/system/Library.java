package Tasks_2_3_libary.system;

import Tasks_2_3_libary.model.Book;
import Tasks_2_3_libary.model.LibraryMember;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        // Add book to the library
        books.add(book);
        System.out.println("Book has been added: " + book.getTitle());
    }

    public void addMember(LibraryMember member) {
        // Add member to the library
        members.add(member);
        System.out.println("Member has been added: " + member.getName());
    }

    public void borrowBook(LibraryMember member, Book book) {
        // Borrow book from the library
        if (books.contains(book)) {
            books.remove(book);
            member.borrowBook(book);
            System.out.println("Book has been borrowed: " + book.getTitle() + " by " + member.getName());
        }
        else {
            System.out.println("The book is not available.");
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        // Return book to the library
        if (member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
            books.add(book);
            System.out.println(member.getName() + " returned the book: " + book.getTitle());
        }
    }

    // all for book reservation system
    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book " + book.getTitle() + " reserved successfully by " + member.getName());
        } else {
            System.out.println("Book " + book.getTitle() + " is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Book " + book.getTitle() + " Reservation canceled successfully by " + member.getName());
        } else {
            System.out.println("Book " + book.getTitle() + " was not reserved by member " + member.getName());
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}
