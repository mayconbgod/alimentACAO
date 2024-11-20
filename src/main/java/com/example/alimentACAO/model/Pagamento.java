package com.example.alimentACAO.model;

import jakarta.persistence.*;

import java.time.LocalDate;

public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String metodoDePagamento;
    @Column
    private String numeroCartao;
    @Column
    private String codigoSeguranca;
    @Column
    private LocalDate dataDeValidade;
    @Column
    private String statusDePagamento;
    @OneToOne
    @JoinColumn(name = "doacao_íd", nullable = false)
    private Doacao doacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setMetodoDePagamento(String metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public void setStatusDePagamento(String statusDePagamento) {
        this.statusDePagamento = statusDePagamento;
    }

    public Doacao getDoacao() {
        return doacao;
    }

    public void setDoacao(Doacao doacao) {
        this.doacao = doacao;
    }
}
