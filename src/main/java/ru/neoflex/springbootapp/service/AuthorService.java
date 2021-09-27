package ru.neoflex.springbootapp.service;

import org.springframework.stereotype.Service;
import ru.neoflex.springbootapp.model.Author;
import ru.neoflex.springbootapp.repository.AuthorJpaRepository;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorJpaRepository authorJpaRepository;

    public AuthorService(AuthorJpaRepository authorJpaRepository){
        this.authorJpaRepository=authorJpaRepository;
    }

    public List<Author> findAll() {
        return authorJpaRepository.findAll();
    }

    public Author findById(Integer id) {
        return authorJpaRepository
                .findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cannot find author by ID - " + id));
    }

    public Author saveAuthor(Author author){
        return authorJpaRepository.save(author);
    }

    public void deleteById(Integer id){
        authorJpaRepository.deleteById(id);
    }
}
