package com.vdab.repositories;

import com.vdab.domain.Book;
import com.vdab.domain.BookFiction;
import com.vdab.domain.BookNonFiction;
import com.vdab.services.BookService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.lang.reflect.Type;
import java.util.List;

@Repository
public class BookRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Book> getBooks() {
        TypedQuery<Book> books = entityManager.createQuery("select b from Book b",Book.class);
        return books.getResultList();
    }
    public List<BookNonFiction> getNonFictionBooks() {
        return entityManager.createQuery("select nf from BookNonFiction nf",BookNonFiction.class).getResultList();
    }

    public List<BookFiction> getFictionBooks() {
        return entityManager.createQuery("select f from BookFiction f",BookFiction.class).getResultList();
    }
    @Transactional(rollbackOn = Exception.class)
    public void saveFictionBook(BookFiction newFictionBook) {
        entityManager.persist(newFictionBook);
    }

    @Transactional(rollbackOn = Exception.class)
    public void saveNonFictionBook(BookNonFiction newNonFictionBook) {
        entityManager.persist(newNonFictionBook);
    }

    public BookFiction findFictionBookById(long id) {
        return entityManager.find(BookFiction.class, id);
    }

    @Transactional
    public void updateFictionBook(BookFiction bookFiction) {

        entityManager.merge(bookFiction);
    }

    @Transactional
    public void deleteFictionBook(long id) {
        BookFiction bookFiction = findFictionBookById(id);
        entityManager.remove(bookFiction);
    }

    public BookNonFiction findNonFictionBookById(long id) {

        return entityManager.find(BookNonFiction.class, id);
    }
    @Transactional
    public void updateNonFictionBook(BookNonFiction bookNonFiction) {

        entityManager.merge(bookNonFiction);
    }

    @Transactional
    public void deleteNonFictionBook(long id) {
        BookNonFiction bookNonFiction = findNonFictionBookById(id);
        entityManager.remove(bookNonFiction);
    }

    public Book findBooksById(long id) {
        return entityManager.find(Book.class,id);
    }
}
