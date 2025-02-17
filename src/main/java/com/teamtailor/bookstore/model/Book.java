package com.teamtailor.bookstore.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;


@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El título no puede estar vacío")
    private String title;

    @NotBlank(message = "El autor no puede estar vacío")
    private String author;

    @NotBlank(message = "El ISBN no puede estar vacío")
    @Size(min = 10, max = 13, message = "El ISBN debe tener entre 10 y 13 caracteres")
    private String isbn;

    @Min(value = 1000, message = "El año de publicación no es válido")
    private int publicationYear;

    @NotBlank(message = "La descripción no puede estar vacía")
    @Column(length = 1000) // Para permitir descripciones largas
    private String description;
}