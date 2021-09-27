package ru.neoflex.springbootapp.service;

import org.springframework.stereotype.Service;
import ru.neoflex.springbootapp.model.Book;
import ru.neoflex.springbootapp.repository.BookJpaRepository;

import java.util.List;

@Service
public class BookService {
    private final BookJpaRepository bookJpaRepository;

    public BookService(BookJpaRepository bookJpaRepository) {
        this.bookJpaRepository = bookJpaRepository;
    }
    public List<Book> findAll() {
        return bookJpaRepository.findAll();
    }
    public Book findById(Integer id){
        return bookJpaRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cannot find author by ID - " + id));
    }

    public Book saveBook(Book book){
        return bookJpaRepository.save(book);
    }

    public void deleteById(Integer id){
        bookJpaRepository.deleteById(id);
    }
}
