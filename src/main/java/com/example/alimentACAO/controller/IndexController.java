package com.example.alimentACAO.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //controlador para retornar página web HTML
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
