package com.CRUD.CRUDBeatme.UsersModels;

import javax.persistence.*;

@Entity
@Table(name = "usuarios_Game")
public class UserModels {

//    paramentros dos usuarios
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String nome;
    @Column
    private String apleido;
    @Column
    private String email;
    @Column
    private Double cpf;
    @Column
    private Double senha;


// GETTERS E SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApleido() {
        return apleido;
    }

    public void setApleido(String apleido) {
        this.apleido = apleido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getCpf() {
        return cpf;
    }

    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }

    public Double getSenha() {
        return senha;
    }

    public void setSenha(Double senha) {
        this.senha = senha;
    }
}
