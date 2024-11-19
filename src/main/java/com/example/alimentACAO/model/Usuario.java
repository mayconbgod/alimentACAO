package com.example.alimentACAO.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.util.Date;
import java.util.List;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotEmpty(message = "O NOME não pode estar em Branco")
    public String nome;

    @Column
    @NotEmpty(message = "O CPF não pode estar em Branco")
    public String cpf;

    @Column
    public String email;

    @Column
    public String telefone;
    @Column
    private Date dataNascimento;
    @Column
    private String sexo;
    @Column
    private String endereco;

    @OneToMany
    private List<Doacao> doacoes;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNome(){ return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCpf(){ return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public String getTelefone(){return telefone;}
    public void setTelefone(String telefone){this.telefone = telefone;}

    public Date getDataNascimento(){return dataNascimento;}
    public void setDataNascimento(Date dataNascimento){this.dataNascimento = dataNascimento;}

    public String getSexo(){return sexo;}
    public void setSexo(String sexo){this.sexo = sexo;}

    public String getEndereco(){return endereco;}
    public void setEndereco(String email){this.endereco = endereco;}

    public List<Doacao> getDoacoes() {
        return doacoes;
    }

    public void setDoacoes(List<Doacao> doacoes) {
        this.doacoes = doacoes;
    }
}
