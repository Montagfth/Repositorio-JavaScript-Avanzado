package com.proyectoii.jsavanzadoproy.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
public class Asistente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    @Email
    private String email;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;
}
