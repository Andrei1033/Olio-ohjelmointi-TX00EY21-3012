import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    // get
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // set
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Laina kirja
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
    // palauta kirja
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
    // Hakee lainatut kirjat
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

}
