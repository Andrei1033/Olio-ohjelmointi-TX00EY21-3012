package Tasks_2_3_libary.model;

public class Book {
    private String title;
    private String author;
    private String isbn;

    // For book reservation system
    private boolean reserved = false;

    // Constructor, getters, setters
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // For book reservation system
    public boolean isReserved() {
        return reserved;
    }
    public void setReserved(boolean b) {
        reserved = b;
    }
}
