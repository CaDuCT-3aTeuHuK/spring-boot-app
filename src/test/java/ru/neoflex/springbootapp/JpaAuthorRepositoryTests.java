package ru.neoflex.springbootapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.neoflex.springbootapp.model.Author;
import ru.neoflex.springbootapp.service.AuthorService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class JpaAuthorRepositoryTests {

    @Autowired
    private AuthorService authorService;

    @Test
    public void findAllTest() {
        List<Author> authors = authorService.findAll();
        assertTrue(authors.size() > 0);
    }

    @Test
    public void findByIdTest() {
        Author author = authorService.findById(1);
        assertEquals("Adolf Hitler", author.getFullName());
    }

}
