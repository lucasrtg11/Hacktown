package com.eventos.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventos.demo.model.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante, Long> {
}
