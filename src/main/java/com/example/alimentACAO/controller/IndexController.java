package com.example.alimentACAO.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //controlador para retornar página web HTML
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("cssFile", "css/style.css");
        model.addAttribute("cssFile2", "css/reset.css");
        model.addAttribute("logoPath", "/images/logo.png");
        model.addAttribute("bgImagePath", "/static/images/bg_caridade.png");
        return "index";
    }
}
