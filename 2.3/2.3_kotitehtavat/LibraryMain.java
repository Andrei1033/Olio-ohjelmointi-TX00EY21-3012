public class LibraryMain {
    public static void main(String[] args) {
        Library manager = new Library();

        // lisätän esimerki kirjoja
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);
        manager.addBook(book1);
        manager.addBook(book2);
        manager.addBook(book3);

        // tulostettan kaikki esimerkikirjat
        manager.displayBooks();
        System.out.println();

        // etsitään ja tulostetaan kirja ByAuthor
        manager.findBooksByAuthor("Jane Doe");
        System.out.println();

        // lainataan kirja
        manager.borrowBook("Introduction to Java Programming");
        manager.displayBooks();
        System.out.println();

        // laitetan kirja takaisiin kirjaston
        manager.returnBook(book1);
        manager.displayBooks();
        System.out.println();

        // book availability  check
        System.out.println("Is \"Introduction to Java Programming\" available? " + manager.isBookAvailable("Introduction to Java Programming"));
        System.out.println("Is \"Random Book\" available? " + manager.isBookAvailable("Unknown Book"));
        System.out.println();

        // rating ja rewiw adding
        book1.setRating(4.5);
        book1.addReview("Very good book for Java beginners");
        System.out.println("Rewiew and Rating has ben given to book1");
        book2.setRating(4.0);
        book2.addReview("Excellent overview of data structures");
        book2.setRating(3.5);
        book2.addReview("ok book");
        book2.addReview("govno");
        System.out.println("Rewiew and Rating has ben given to book2");
        manager.displayBooks();
        System.out.println();

        // tulostetaan  rating ja rewiw asioita
        System.out.println("Average book rating: " + manager.getAverageBookRating());
        Book mostReviewed = manager.getMostReviewedBook();
        if (mostReviewed != null) {
            System.out.println("Most reviewed book: " + mostReviewed.getTitle() + " with " + mostReviewed.getReviews().size() + " reviews");
        }
        System.out.println();

        // lisätän käytäjiä
        User alice = new User("Alice", 25);
        User Ben = new User("Ben", 169);
        manager.addUser(alice);
        manager.addUser(Ben);

        // lainatan kirjoja käytäjä nimelä
        manager.borrowBook(alice, "The Art of Fiction"); // Alice lainaa kirjan
        manager.borrowBook(Ben, "The Art of Fiction");
        manager.borrowBook(Ben, "Data Structures and Algorithms");
        manager.displayBooks();
        manager.returnBook(alice, book1);                 // Alice palauttaa kirjan
        manager.returnBook(Ben, book2);
        manager.displayBooks();
    }
}
