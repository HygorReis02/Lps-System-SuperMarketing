package com.hygor.erick.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "estoques")
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

    private Integer quantidadeAtual;

    private Integer quantidadeReservada; // opcional: usada para pedidos em andamento

    private LocalDateTime ultimaAtualizacao;

    // Construtores
    public Estoque() {}

    public Estoque(Produto produto, Integer quantidadeAtual) {
        this.produto = produto;
        this.quantidadeAtual = quantidadeAtual;
        this.ultimaAtualizacao = LocalDateTime.now();
    }

    // Métodos auxiliares
    public void adicionarEstoque(int quantidade) {
        this.quantidadeAtual += quantidade;
        this.ultimaAtualizacao = LocalDateTime.now();
    }

    public void removerEstoque(int quantidade) {
        this.quantidadeAtual -= quantidade;
        if (this.quantidadeAtual < 0) this.quantidadeAtual = 0;
        this.ultimaAtualizacao = LocalDateTime.now();
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidadeAtual() {
        return quantidadeAtual;
    }
    public void setQuantidadeAtual(Integer quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public Integer getQuantidadeReservada() {
        return quantidadeReservada;
    }
    public void setQuantidadeReservada(Integer quantidadeReservada) {
        this.quantidadeReservada = quantidadeReservada;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }
    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
}
