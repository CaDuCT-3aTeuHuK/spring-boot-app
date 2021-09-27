package ru.neoflex.springbootapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@SuppressWarnings("JpaDataSourceORMInspection")




@Entity
@Table(name = "authors")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullName;

}
