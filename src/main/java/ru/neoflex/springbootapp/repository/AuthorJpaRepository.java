package ru.neoflex.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neoflex.springbootapp.model.Author;

public interface AuthorJpaRepository extends JpaRepository<Author, Integer> {

}
