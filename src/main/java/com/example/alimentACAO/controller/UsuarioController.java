package com.example.alimentACAO.controller;

import com.example.alimentACAO.model.Usuario;
import com.example.alimentACAO.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    private Usuario create(@RequestBody Usuario usuario) {
        usuario = usuarioService.create(usuario);
        return usuario;
    }

    @GetMapping
    private List<Usuario> findAll() {
        List<Usuario> usuarios = usuarioService.findAll();
        return usuarios;
    }

    @GetMapping
    private Usuario get(@PathVariable(name = "id") Long id) {
        Usuario usuario = usuarioService.get(id);
        return usuario;
    }

    @PostMapping(value = "/{id}")
    public void update(@PathVariable(name = "id") Long id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        usuario = usuarioService.update(usuario);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        usuarioService.delete(id);
    }

}
