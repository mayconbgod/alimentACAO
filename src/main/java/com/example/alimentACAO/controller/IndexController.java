package com.example.alimentACAO.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Controlador para retornar a página inicial HTML
    @GetMapping("/")
    public String index(Model model) {
        // Aqui você pode adicionar lógica para passar os dados do modelo, se necessário
        // Por exemplo:
        // model.addAttribute("nome", "Valor");

        return "index"; // Retorna o nome do arquivo HTML que será renderizado
    }
}
