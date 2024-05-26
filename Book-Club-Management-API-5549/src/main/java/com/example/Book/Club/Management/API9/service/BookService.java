package com.example.Book.Club.Management.API9.service;

import com.example.Book.Club.Management.API9.model.Book;
import com.example.Book.Club.Management.API9.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow();
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        return bookRepository.save(book);
    }
    public Book getBookById(Long id){
        return bookRepository.findBookById(id);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}