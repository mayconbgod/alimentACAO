package com.example.alimentACAO.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoacaoService {
    @Autowired
    private DoacaoRepository doacaoRepository;

    public void processarDoacao(Doacao doacao) {
        doacaoRepository.save(doacao);
    }

    public List<Doacao> buscarPorNome(String nome) {
        return doacaoRepository.procurarPeloNome(nome);
    }

}
