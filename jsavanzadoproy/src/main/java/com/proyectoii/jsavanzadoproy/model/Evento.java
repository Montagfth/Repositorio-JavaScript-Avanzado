package com.proyectoii.jsavanzadoproy.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    @Min(value = 1)
    private int cupoMaximo;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List<Asistente> asistentes;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    @NotNull
    private Categoria categoria;

}
