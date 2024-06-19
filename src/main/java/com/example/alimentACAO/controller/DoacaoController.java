package com.example.alimentACAO.controller;

import com.example.alimentACAO.model.Doacao;
import com.example.alimentACAO.model.DoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doacao")
public class DoacaoController {

    @Autowired
    private DoacaoRepository repository;

    @GetMapping
    public ResponseEntity<List<Doacao>> getAllDoacoes() {
        try {
            List<Doacao> doacoesList = repository.findAll();
            if (doacoesList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(doacoesList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/mensal")
    public ResponseEntity<String> receberDoacaoMensal(@RequestBody Doacao doacao) {
        try {
            repository.save(doacao);
            return new ResponseEntity<>("Doação mensal recebida com sucesso!", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Falha ao receber doação mensal.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/unica")
    public ResponseEntity<String> receberDoacaoUnica(@RequestBody Doacao doacao) {
        try {
            repository.save(doacao);
            return new ResponseEntity<>("Doação única recebida com sucesso!", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Falha ao receber doação única.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
