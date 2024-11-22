package com.example.alimentACAO.controller;

import com.example.alimentACAO.model.Beneficiario;
import com.example.alimentACAO.service.BeneficiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beneficiario")
public class BeneficiarioController {

    @Autowired
    private BeneficiarioService beneficiarioService;

    @PostMapping
    private Beneficiario create(@RequestBody Beneficiario beneficiario) {
        beneficiario = beneficiarioService.create(beneficiario);
        return beneficiario;
    }

    @GetMapping //para listar todos beneficiarios
    private List<Beneficiario> findAll() {
        List<Beneficiario> beneficiarios = beneficiarioService.findAll();
        return beneficiarios;
    }

    @GetMapping
    private Beneficiario get(@PathVariable(name = "id") Long id) {
        Beneficiario beneficiario = beneficiarioService.get(id);
        return beneficiario;
    }

    @PostMapping(value = "/{id}")
    public void update(@PathVariable(name = "id") Long id, @RequestBody Beneficiario beneficiario) {
        beneficiario.setId(id);
        beneficiario = beneficiarioService.update(beneficiario);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        beneficiarioService.delete(id);
    }

}
