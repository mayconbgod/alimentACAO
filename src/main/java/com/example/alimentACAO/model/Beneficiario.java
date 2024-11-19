package com.example.alimentACAO.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "beneficiarios")
public class Beneficiario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotEmpty(message = "O NOME não pode estar em Branco")
    public String nome;

    @Column(nullable = false, unique = true)
    @NotEmpty(message = "O documento não pode estar em Branco")
    public String documento; //cpf ou cnpj

    @Column(unique = true, nullable = false)
    public String email;

    @Column
    public String telefone;
    @Column
    private Date dataNascimento; //apenas se for pessoa fisica
    @Column
    private String sexo; //apenas se for pessoa fisica
    @Column
    private String endereco;
    @OneToMany
    private List<Doacao> doacoesRecebidas;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNome(){ return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getDocumento(){return nome;}
    public void setDocumento(String documento){this.documento = documento;}

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

    public List<Doacao> getDoacoesRecebidas() {return doacoesRecebidas;}
    public void setDoacoesRecebidas(List<Doacao> doacoesRecebidas) {this.doacoesRecebidas = doacoesRecebidas;}
}
