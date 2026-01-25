import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add methods here
    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: \"" + book.getTitle() + "\", Author:" + book.getAuthor() + ", Year: " + book.getYear() + ", Rating: " +  book.getRating() + ", review : " + book.getAllReviews());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by Author \"" + author + "\":");
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: \"" + book.getTitle() + "\", Author:" + book.getAuthor() + ", Year: " + book.getYear() + ", Rating: " +  book.getRating() + ", review : " + book.getAllReviews());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found for Author \"" + author + "\"");
        }
    }

    public void borrowBook(String title) {
        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equals(title)) {
                iterator.remove();
                System.out.println("Book \"" + title + "\" has been borrowed.");
                return;
            }
        }
        System.out.println("No books found for \"" + title + "\"");
    }

    public void returnBook(Book book){
        books.add(book);
        System.out.println("\"" + book.getTitle() + "\""  + " has been returned.");
    }

    public boolean isBookAvailable(String title){
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating(){
        double total = 0;
        int count = 0;
        for (Book book : books) {
            total += book.getRating();
            if (book.getRating() > 0) {
                count++;
            }
        }
        return total / count;
    }

    public Book getMostReviewedBook(){
        if (books.isEmpty()) {
            System.out.println("The library is empty. No books available.");
            return null;
        }

        Book mostReviewedBook = books.getFirst();
        int maxReviews = mostReviewedBook.getReviews().size();

        for (Book book : books) {
            int currentReviews = book.getReviews().size();
            if (currentReviews > maxReviews) {
                maxReviews = currentReviews;
                mostReviewedBook = book;
            }
        }
        return mostReviewedBook;
    }

    // lisätän käytäjiä ja niiden listan
    private ArrayList<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }


    // kirja lainaus ja palautus
    public void borrowBook(User user, String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                user.borrowBook(book);
                books.remove(book);
                System.out.println(user.getName() + " borrowed \"" + title + "\"");
                return;
            }
        }
        System.out.println(user.getName() + " Can't borrow book: \"" + title + "\"");
    }
    public void returnBook(User user, Book book) {
        user.returnBook(book);
        books.add(book);
        System.out.println(user.getName() + " returned " + book.getTitle());
    }

}