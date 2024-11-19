package com.example.alimentACAO.service;

import com.example.alimentACAO.model.Doacao;
import com.example.alimentACAO.repositorys.DoacaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoacaoService {
    @Autowired
    private DoacaoRepository doacaoRepository;

    @Transactional
    public Doacao create(Doacao doacao) {
        return doacaoRepository.save(doacao);
    }

    @Transactional
    public List<Doacao> findAll() {
        return doacaoRepository.findAll();
    }

    @Transactional
    public Doacao get(Long id) {
        return doacaoRepository.findById(id).orElse(null);
    }

    @Transactional
    public Doacao update(Doacao doacao) {
        return doacaoRepository.save(doacao);
    }

    @Transactional
    public void delete(Long id) {
        doacaoRepository.deleteById(id);
    }
}
