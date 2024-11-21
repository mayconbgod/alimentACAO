package com.example.alimentACAO.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
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
    private String statusDePagamento; //status aprovado ou recusado
    @OneToOne
    @JoinColumn(name = "doacao_íd", nullable = false)
    private Doacao doacao;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public  String getMetodoDePagamento(){return metodoDePagamento;}
    public void setMetodoDePagamento(String metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public String getNumeroCartao(){return numeroCartao;}
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getCodigoSeguranca(){return codigoSeguranca;}
    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public LocalDate getDataDeValidade(){return dataDeValidade;}
    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public String getStatusDePagamento(){return statusDePagamento;}
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
