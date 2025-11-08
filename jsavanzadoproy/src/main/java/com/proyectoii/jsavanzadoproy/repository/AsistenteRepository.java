package com.proyectoii.jsavanzadoproy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoii.jsavanzadoproy.model.Asistente;
import java.util.List;

@Repository
public interface AsistenteRepository extends JpaRepository<Asistente, Long> {

    // Listar asistentes por evento (para el detalle del evento)
    List<Asistente> findByEventoId(long EventoId);

    // Validación: verificar si un email ya está registrado en un evento
    boolean existByEmailAndEventoId(String email, long eventoId);

}
