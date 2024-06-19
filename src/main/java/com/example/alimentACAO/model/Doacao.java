package com.example.alimentACAO.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "Doacoes", schema = "ALIMENTACAO")
public class Doacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DoacaoID")
    private long id;

    @ManyToOne
    @JoinColumn(name = "DoadorID", nullable = false)
    private Doador doador;

    @ManyToOne
    @JoinColumn(name = "EnderecoID", nullable = false)
    private Endereco endereco;

    @NotEmpty(message = "O TIPO DE DOAÇÃO não pode estar em Branco")
    @Column(name = "TipoDoacao")
    private String tipoDoacao;

    @NotNull(message = "O VALOR DA DOAÇÃO não pode estar em Branco")
    @Positive(message = "O VALOR DA DOAÇÃO deve ser positivo")
    @Column(name = "Valor")
    private Double valor;

    @Column(name = "MeioPagamento")
    private String meioPagamento;

    @Column(name = "DesejaAceitarTermos")
    private boolean desejaAceitarTermos;

    // Getters e Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTipoDoacao() {
        return tipoDoacao;
    }

    public void setTipoDoacao(String tipoDoacao) {
        this.tipoDoacao = tipoDoacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getMeioPagamento() {
        return meioPagamento;
    }

    public void setMeioPagamento(String meioPagamento) {
        this.meioPagamento = meioPagamento;
    }

    public boolean isDesejaAceitarTermos() {
        return desejaAceitarTermos;
    }

    public void setDesejaAceitarTermos(boolean desejaAceitarTermos) {
        this.desejaAceitarTermos = desejaAceitarTermos;
    }

    public void setAceitarTermos(Boolean aceitarTermos) {

    }
}
