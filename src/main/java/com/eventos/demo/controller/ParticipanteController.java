package com.eventos.demo.controller;

import com.eventos.demo.model.Participante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/participantes")
public class ParticipanteController {

    private List<Participante> lista = new ArrayList<>();

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("participantes", lista);
        return "participantes";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("participante", new Participante());
        return "participante-form";
    }

    @PostMapping("/salvar")
    public String salvar(Participante p) {
        lista.add(p);
        return "redirect:/participantes";
    }
}
