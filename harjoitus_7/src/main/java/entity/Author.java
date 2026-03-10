package entity;

import jakarta.persistence.*;

import java.lang.reflect.Type;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // PUUTTUU: Default-konstruktori
    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Book> books;
    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }



    // Getterit ja setterit (oletetaan että ne on olemassa)
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }
}