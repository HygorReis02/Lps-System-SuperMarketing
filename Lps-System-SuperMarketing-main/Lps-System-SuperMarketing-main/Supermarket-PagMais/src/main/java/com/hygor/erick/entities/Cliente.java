package com.hygor.erick.entities;


import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    private String cpf;

    private String endereco;

    private String senha;

    // Associação com compras realizadas
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Compra> compras = new ArrayList<>();

    // Construtores
    public Cliente() {}

    public Cliente(String nome, String email, String telefone, String cpf, String endereco, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
        this.senha = senha;
    }

    // Métodos auxiliares
public void adicionarCompra(Compra compra) {
    compras.add(compra);
    compra.setUsuario(this);
}


    public void removerCompra(Compra compra) {
        compras.remove(compra);
        compra.setCliente(null);
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public List<Compra> getCompras() { return compras; }
    public void setCompras(List<Compra> compras) { this.compras = compras; }
}
