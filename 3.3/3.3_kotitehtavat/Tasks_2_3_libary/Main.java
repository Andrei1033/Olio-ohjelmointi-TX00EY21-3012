package Tasks_2_3_libary;

import Tasks_2_3_libary.model.Book;
import Tasks_2_3_libary.model.LibraryMember;
import Tasks_2_3_libary.system.Library;

public class Main {
    public static void main(String[] args) {
        // Create instances of Library, Book, LibraryMember
        Library library = new Library();

        Book book1 = new Book("Clean Code", "Robert Martin", "123");
        Book book2 = new Book("Java Basics", "James Gosling", "456");

        LibraryMember member1 = new LibraryMember("Matti", 1);
        LibraryMember member2 = new LibraryMember("Leena", 2);

        // Add books and members to the library
        library.addBook(book1);
        library.addBook(book2);
        System.out.println();

        library.addMember(member1);
        library.addMember(member2);
        System.out.println();

        // Perform borrowing and returning operations
        library.borrowBook(member1, book1);
        library.borrowBook(member2, book1);
        library.returnBook(member1, book1);

        System.out.println();
        library.borrowBook(member2, book2);
        library.borrowBook(member2, book1);
        library.returnBook(member2, book2);
        library.returnBook(member2, book1);

        // Library reservation tests
        System.out.println();
        System.out.println("Library reservation tests: ");
        library.reserveBook(member1, book1);
        library.reserveBook(member2, book1);
        library.reserveBook(member2, book2);

        System.out.println();
        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);

        System.out.println();
        library.cancelReservation(member1, book1);
        library.cancelReservation(member2, book1);
        library.cancelReservation(member2, book2);

    }
}
