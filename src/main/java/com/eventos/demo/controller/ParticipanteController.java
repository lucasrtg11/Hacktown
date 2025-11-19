package com.eventos.demo.controller;

import com.eventos.demo.model.Evento;
import com.eventos.demo.model.Participante;
import com.eventos.demo.repository.ParticipanteRepository;
import com.eventos.demo.repository.EventoRepository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/participantes")
public class ParticipanteController {

    @Autowired
    private ParticipanteRepository participanteRepository;

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping
    public String cadastroInicial(Model model) {
        model.addAttribute("participante", new Participante());
        return "participante-form";
    }

    @PostMapping("/salvar")
    public String salvar(Participante participante, Model model) {

        // Salva o participante
        participanteRepository.save(participante);

        // Busca eventos do dia
        LocalDate hoje = LocalDate.now();
        List<Evento> eventosDoDia = eventoRepository.findByData(hoje);

        // Envia eventos para a página
        model.addAttribute("eventos", eventosDoDia);

        // Exibe nova página
        return "eventos-do-dia";
    }
}
