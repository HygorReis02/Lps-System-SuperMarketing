package com.hygor.erick.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private String codigoBarras;

    private String descricao;

    private double preco;

    private LocalDate validade;

    private Integer estoqueMinimo;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;

    @ManyToMany
    @JoinTable(
        name = "produto_promocao",
        joinColumns = @JoinColumn(name = "produto_id"),
        inverseJoinColumns = @JoinColumn(name = "promocao_id")
    )
    private List<Promocao> promocoes = new ArrayList<>();

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<HistoricoFornecimento> fornecimentos = new ArrayList<>();

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCodigoBarras() { return codigoBarras; }
    public void setCodigoBarras(String codigoBarras) { this.codigoBarras = codigoBarras; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public LocalDate getValidade() { return validade; }
    public void setValidade(LocalDate validade) { this.validade = validade; }

    public Integer getEstoqueMinimo() { return estoqueMinimo; }
    public void setEstoqueMinimo(Integer estoqueMinimo) { this.estoqueMinimo = estoqueMinimo; }

    public Fornecedor getFornecedor() { return fornecedor; }
    public void setFornecedor(Fornecedor fornecedor) { this.fornecedor = fornecedor; }

    public List<Promocao> getPromocoes() { return promocoes; }
    public void setPromocoes(List<Promocao> promocoes) { this.promocoes = promocoes; }

    public List<HistoricoFornecimento> getFornecimentos() { return fornecimentos; }
    public void setFornecimentos(List<HistoricoFornecimento> fornecimentos) { this.fornecimentos = fornecimentos; }

    public String getCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setCategoria(String categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
