package com.example.alimentACAO.controller;

import com.example.alimentACAO.model.Doacao;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//Controlador para lidar com as solicitações HTTP relacionadas a doações.
@RestController
@RequestMapping("/doacao")
public class DoacaoController {

    private List<Doacao> doacoes;

    public DoacaoController() {
        doacoes = new ArrayList<>();
    }

    // Método para receber doação mensal
    //manipulações de solicitações POST
    @PostMapping("/mensal")
    public void receberDoacoesMensais(@RequestBody Doacao doacao) {
        doacoes.add(doacao);
        System.out.println("Doação mensal de " + doacao.getValorDoacao() + " recebida de " + doacao.getNome());
    }

    // Método para receber uma doação única
    @PostMapping("/unica")
    public void receberDoacoesUnicas(@RequestBody Doacao doacao) {
        doacoes.add(doacao);
        System.out.println("Doação única de " + doacao.getValorDoacao() + " recebida de " + doacao.getNome());
    }

    // Método para listar todas as doações
    @GetMapping("/lista")
    public List<Doacao> listarDoacoes() {
        return doacoes;
    }
}