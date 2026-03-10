package dao;

import entity.Book;
import jakarta.persistence.EntityManager;
import datasource.MariaDbJpaConnection;

public class BookDao {

    public void persist(Book book) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        // PUUTTUU: Aloita transaktio
        em.getTransaction().begin();
        em.persist(book);
        // PUUTTUU: Tallenna transaktio
        em.getTransaction().commit();
    }

    public Book find(Long id) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        // PUUTTUU: Etsi kirja id:n perusteella
        return em.find(Book.class, id);
    }
}