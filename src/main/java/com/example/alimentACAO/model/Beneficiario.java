package com.example.alimentACAO.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "beneficiarios")
public class Beneficiario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco endereco;

    @OneToMany(mappedBy = "beneficiario", cascade = CascadeType.ALL)
    private List<Doacao> doacoesRecebidas;

    @Column(nullable = false)
    @NotEmpty(message = "O NOME não pode estar em Branco")
    private String nome;

    @Column(nullable = false, unique = true)
    @NotEmpty(message = "O documento não pode estar em Branco")
    private String documento; //cpf ou cnpj

    @Column(unique = true, nullable = false)
    @NotEmpty(message = "O EMAIL não pode estar em branco")
    @Email(message = "Formato de email inválido")
    private String email;

    @Column
    public String telefone;
    @Column
    private LocalDate dataNascimento; //apenas se for pessoa fisica

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public enum Sexo {
        MASCULINO,
        FEMININO,
        OUTRO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return nome;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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

    public List<Doacao> getDoacoesRecebidas() {
        return doacoesRecebidas;
    }

    public void setDoacoesRecebidas(List<Doacao> doacoesRecebidas) {
        this.doacoesRecebidas = doacoesRecebidas;
    }
}
