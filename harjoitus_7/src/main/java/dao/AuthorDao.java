package dao;

import entity.Author;
import jakarta.persistence.EntityManager;
import datasource.MariaDbJpaConnection;

public class AuthorDao {
    public void persist(Author author) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(author);
        em.getTransaction().commit();
    }
}
