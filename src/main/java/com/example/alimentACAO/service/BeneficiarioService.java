package com.example.alimentACAO.service;

import com.example.alimentACAO.model.Beneficiario;
import com.example.alimentACAO.repositorys.BeneficiarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficiarioService {

    @Autowired
    private BeneficiarioRepository repository;

    @Transactional
    public Beneficiario create(Beneficiario beneficiario) {
        return repository.save(beneficiario);
    }

    @Transactional
    public List<Beneficiario> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Beneficiario get(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Transactional
    public Beneficiario update(Beneficiario beneficiario) {
        return repository.save(beneficiario);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
