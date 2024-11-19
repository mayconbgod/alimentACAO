package com.example.alimentACAO.repositorys;

import com.example.alimentACAO.model.Doacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoacaoRepository extends JpaRepository<Doacao,Long>{
}