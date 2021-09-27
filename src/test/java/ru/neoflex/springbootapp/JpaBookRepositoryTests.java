package ru.neoflex.springbootapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.neoflex.springbootapp.model.Book;
import ru.neoflex.springbootapp.service.BookService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class JpaBookRepositoryTests {
    @Autowired
    private BookService bookService;

    @Test
    public void findAllTest() {
        List<Book> books = bookService.findAll();
        assertTrue(books.size() > 0);
    }

    @Test
    public void findByIdTest() {
        Book book = bookService.findById(2);
        assertEquals(1500, book.getCost());
    }
}
