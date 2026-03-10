package application;

import entity.*;
import dao.*;
import datasource.MariaDbJpaConnection;

public class Main {
    public static void main(String[] args) {
        AuthorDao authorDao = new AuthorDao();
        BookDao bookDao = new BookDao();

        Author author = new Author("J.R.R. Tolkien");
        authorDao.persist(author);

        Book book = new Book("The Hobbit", author);
        bookDao.persist(book);

        // PUUTTUU: Sulje yhteys (kutsu sopivaa metodia)
        MariaDbJpaConnection.close();


    }
}