package com.eventos.demo.repository;

import com.eventos.demo.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface EventoRepository extends JpaRepository<Evento, Long> {

    List<Evento> findByData(LocalDate data); // <-- MÉTODO NECESSÁRIO
}
