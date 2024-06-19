package com.example.alimentACAO.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "Doadores", schema = "ALIMENTACAO")
public class Doador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DoadorID")
    private long id;

    @NotEmpty(message = "O NOME não pode estar em Branco")
    @Size(max = 100, message = "O NOME deve ter no máximo 100 caracteres")
    @Column(name = "Nome")
    private String nome;

    @NotEmpty(message = "O EMAIL não pode estar em Branco")
    @Email(message = "O EMAIL deve ser válido")
    @Column(name = "Email")
    private String email;

    @NotEmpty(message = "O TELEFONE não pode estar em Branco")
    @Column(name = "Telefone")
    private String telefone;

    @NotNull(message = "A DATA DE NASCIMENTO não pode estar em Branco")
    @Column(name = "DataNascimento")
    private LocalDate dataNascimento;

    @NotEmpty(message = "O SEXO não pode estar em Branco")
    @Column(name = "Sexo")
    private String sexo;

    @NotEmpty(message = "O CPF não pode estar em Branco")
    @Size(min = 11, max = 11, message = "O CPF deve ter 11 caracteres")
    @Column(name = "Cpf")
    private String cpf;

    // Getters e Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
