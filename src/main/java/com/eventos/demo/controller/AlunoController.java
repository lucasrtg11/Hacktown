package com.eventos.demo.controller;


import com.eventos.demo.model.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/aluno")
public class AlunoController {
    
    private List<Aluno> lista = new ArrayList<>();

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("aluno", lista);
        return "aluno";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "aluno-form";
    }

    @PostMapping("/salvar")
    public String salvar(Aluno a) {
        lista.add(a);
        return "redirect:/aluno";
    }
}
