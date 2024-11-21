package com.example.alimentACAO.service;

import com.example.alimentACAO.model.Doacao;
import com.example.alimentACAO.model.Pagamento;
import com.example.alimentACAO.repositorys.PagamentoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Autowired
    private DoacaoService doacaoService;


    @Transactional
    public Pagamento create(Long doacaoId, Pagamento pagamento) {

        Doacao doacao = doacaoService.get(doacaoId);
        if (doacao == null) {
            throw new RuntimeException("Doação não encontrada com ID: " + doacaoId);
        }

        pagamento.setDoacao(doacao);
        pagamento.setStatusDePagamento("Pendente"); //status inicial do pagamento

        return pagamentoRepository.save(pagamento);
    }

    @Transactional
    public List<Pagamento> findAll() {
        return pagamentoRepository.findAll();
    }

    @Transactional
    public Pagamento get(Long id) {
        return pagamentoRepository.findById(id).orElse(null);
    }

    @Transactional
    public Pagamento update(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    public void delete(Long id) {
        pagamentoRepository.deleteById(id);
    }
}
