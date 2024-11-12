package com.task.librarysystem;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class BookService {
    private final List<Book> books = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong();

   
    public Book addBook(Book book) {
        book.setId((int) idCounter.incrementAndGet()); 
        books.add(book);
        return book;
    }

   
    public List<Book> getAllBooks() {
        return books;
    }

    
    public Optional<Book> getBookById(int id) {
        return books.stream()
                .filter(book -> book.getId() == id) 
                .findFirst();
    }

  
    public Optional<Book> updateBook(int id, Book updatedBook) {
        return getBookById(id).map(book -> {
            book.setTitle(updatedBook.getTitle());
            book.setAuthorname(updatedBook.getAuthorname());
            book.setPublishyear(updatedBook.getPublishyear());
            return book;
        });
    }

  
    public boolean deleteBook(Long id) {
        return books.removeIf(book -> book.getId() == id); 
    }
}
