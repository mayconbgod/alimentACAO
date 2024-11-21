package com.example.alimentACAO.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "doacoes")
public class Doacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "doador_id")
    private Usuario doador;

    @ManyToOne
    @JoinColumn(name = "beneficiario_id")
    private Beneficiario beneficiario;

    @NotEmpty(message = "O TIPO DE DOAÇÃO não pode estar em Branco")
    private String tipoDoacao; //Financeira ou alimentos

    @NotNull(message = "O VALOR DA DOAÇÃO não pode estar em Branco")
    private double valorDoacao;

    @Column
    private boolean doacaoRecorrente;
    @Column
    private String metodoDePagamento;
    @Column
    private LocalDate dataDeDoacao;

    @Column
    private String status; //Concluida ou Recusada

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getDoador() {
        return doador;
    }

    public void setDoador(Usuario doador) {
        this.doador = doador;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getTipoDoacao() {
        return tipoDoacao;
    }

    public void setTipoDoacao(String tipoDoacao) {
        this.tipoDoacao = tipoDoacao;
    }

    public double getValorDoacao() {
        return valorDoacao;
    }

    public void setValorDoacao(double valorDoacao) {
        this.valorDoacao = valorDoacao;
    }

    public boolean isDoacaoRecorrente() {
        return doacaoRecorrente;
    }

    public void setDoacaoRecorrente(boolean doacaoRecorrente) {
        this.doacaoRecorrente = doacaoRecorrente;
    }


    public String getMetodoDePagamento() {
        return metodoDePagamento;
    }

    public void setMetodoDePagamento(String metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public LocalDate getDataDeDoacao() {
        return dataDeDoacao;
    }

    public void setDataDeDoacao(LocalDate dataDeDoacao) {
        this.dataDeDoacao = dataDeDoacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

