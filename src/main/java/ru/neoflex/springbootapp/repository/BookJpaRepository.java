package ru.neoflex.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neoflex.springbootapp.model.Book;

public interface BookJpaRepository extends JpaRepository<Book, Integer> {
}
