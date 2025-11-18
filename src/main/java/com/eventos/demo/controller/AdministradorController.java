package com.eventos.demo.controller;

import com.eventos.demo.model.Administrador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {

    private final String ADMIN_USER = "professor";
    private final String ADMIN_PASS = "123";

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("admin", new Administrador());
        return "admin-login";
    }

    @PostMapping("/logar")
    public String logar(Administrador adm, Model model) {

        if (adm.getUsuario().equals(ADMIN_USER) && adm.getSenha().equals(ADMIN_PASS)) {
            return "admin-home";
        }

        model.addAttribute("erro", "Usuário ou senha incorretos!");
        return "admin-login";
    }
}
