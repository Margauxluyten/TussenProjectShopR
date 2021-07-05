package com.vdab.services;

import com.vdab.domain.Book;
import com.vdab.domain.BookFiction;
import com.vdab.domain.BookNonFiction;
import com.vdab.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;



    public List<BookNonFiction> getNonFictionBooks() {
        return bookRepository.getNonFictionBooks();
    }

    public List<BookFiction> getFictionBooks() {
        return bookRepository.getFictionBooks();
    }

    public List<Book>getBooks() {
        return bookRepository.getBooks();
    }

    public void saveFictionBook(BookFiction newFictionBook) {
        bookRepository.saveFictionBook(newFictionBook);
    }

    public void saveNonFictionBook(BookNonFiction newNonFictionBook) {
        bookRepository.saveNonFictionBook(newNonFictionBook);
    }

    public BookFiction findFictionBookById(long id) {

        return bookRepository.findFictionBookById(id);
    }

    public void updateFictionBook(BookFiction bookFiction) {

        bookRepository.updateFictionBook(bookFiction);
    }
    public void deleteFictionBook(long id) {
        bookRepository.deleteFictionBook(id);
    }

    public BookNonFiction findNonFictionBookById(long id) {

        return bookRepository.findNonFictionBookById(id);
    }

    public void updateNonFictionBook(BookNonFiction bookNonFiction) {
        bookRepository.updateNonFictionBook(bookNonFiction);
    }
        public void deleteNonFictionBook(long id) {
        bookRepository.deleteNonFictionBook(id);
    }

    public Book findBooksById(long id) {
        return bookRepository.findBooksById(id);
    }
}
