package com.example.alimentACAO.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DoacaoRepository extends JpaRepository<Doacao,Long>{
    List<Doacao> procurarPeloNome(String nome);
}