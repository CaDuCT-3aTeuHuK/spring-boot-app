package ru.neoflex.springbootapp.model;

import lombok.*;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private Integer cost;
    private Integer id_author;
}
