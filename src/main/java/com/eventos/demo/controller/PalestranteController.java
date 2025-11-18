package com.eventos.demo.controller;

import com.eventos.demo.model.Palestrante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/palestrantes")
public class PalestranteController {

    private List<Palestrante> lista = new ArrayList<>();

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("palestrantes", lista);
        return "palestrantes";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("palestrante", new Palestrante());
        return "palestrante-form";
    }

    @PostMapping("/salvar")
    public String salvar(Palestrante p) {
        lista.add(p);
        return "redirect:/palestrantes";
    }
}
