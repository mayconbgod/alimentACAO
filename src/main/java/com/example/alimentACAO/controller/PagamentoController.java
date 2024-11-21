package com.example.alimentACAO.controller;

import com.example.alimentACAO.model.Pagamento;
import com.example.alimentACAO.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping
    public ResponseEntity<Pagamento> create(@RequestParam Long doacaoId, @RequestBody Pagamento pagamento) {
        Pagamento novoPagamento = pagamentoService.create(doacaoId, pagamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPagamento);
    }

    @GetMapping
    public ResponseEntity<List<Pagamento>> findALL() {
        List<Pagamento> pagamentos = pagamentoService.findAll();
        return ResponseEntity.ok(pagamentos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pagamento> get(@PathVariable Long id) {
        Pagamento pagamento = pagamentoService.get(id);
        if (pagamento != null) {
            return ResponseEntity.ok(pagamento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Pagamento> update(@PathVariable Long id, @RequestBody Pagamento pagamento) {
        Pagamento pagamentoExistente = pagamentoService.get(id);
        if (pagamentoExistente != null) {
            pagamento.setId(id);
            Pagamento pagamentoAtualizadoFinal = pagamentoService.update(pagamento);
            return ResponseEntity.ok(pagamentoAtualizadoFinal);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Pagamento pagamento = pagamentoService.get(id);
        if (pagamento != null) {
            pagamentoService.delete(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
