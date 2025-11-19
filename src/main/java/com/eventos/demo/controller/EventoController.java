package com.eventos.demo.controller;

import com.eventos.demo.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping("/eventos")
    public String listarEventos(Model model) {
        model.addAttribute("eventos", eventoRepository.findAll());
        return "eventos";
    }
}
