package com.example.alimentACAO.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoacaoService {
    @Autowired
    private DoacaoRepository doacaoRepository;

    public void processarDoacao(Doacao doacao) {
        doacaoRepository.save(doacao);
    }
}
