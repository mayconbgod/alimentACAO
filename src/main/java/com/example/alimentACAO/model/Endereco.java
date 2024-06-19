package com.example.alimentACAO.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Enderecos", schema = "ALIMENTACAO")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EnderecoID")
    private long id;

    @NotEmpty(message = "O CEP não pode estar em Branco")
    @Column(name = "Cep")
    private String cep;

    @NotEmpty(message = "A RUA não pode estar em Branco")
    @Column(name = "Rua")
    private String rua;

    @NotEmpty(message = "O NÚMERO não pode estar em Branco")
    @Column(name = "Numero")
    private String numero;

    @Column(name = "Complemento")
    private String complemento;

    @NotEmpty(message = "O BAIRRO não pode estar em Branco")
    @Column(name = "Bairro")
    private String bairro;

    @NotEmpty(message = "A CIDADE não pode estar em Branco")
    @Column(name = "Cidade")
    private String cidade;

    @NotEmpty(message = "O ESTADO não pode estar em Branco")
    @Column(name = "Estado")
    private String estado;

    // Getters e Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNumero(int numero) {

    }
}
