package com.example.alimentACAO.service;

import com.example.alimentACAO.model.Usuario;
import com.example.alimentACAO.repositorys.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Transactional
    public Usuario create(Usuario usuario) {
        return repository.save(usuario);
    }

    @Transactional
    public List<Usuario> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Usuario get(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Transactional
    public Usuario update(Usuario usuario) {
        return repository.save(usuario);
    }

    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
