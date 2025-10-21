package com.hygor.erick.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Cliente que realizou a compra
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Usuario cliente;

    // Lista de itens comprados (associação N:N com detalhes)
    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemCompra> itens = new ArrayList<>();

    private BigDecimal valorTotal;

    private LocalDateTime dataCompra;

    private String metodoPagamento;

    // Construtores
    public Compra() {
        this.dataCompra = LocalDateTime.now();
    }

    public Compra(Usuario cliente, String metodoPagamento) {
        this.cliente = cliente;
        this.metodoPagamento = metodoPagamento;
        this.dataCompra = LocalDateTime.now();
    }

    // Métodos auxiliares
    public void adicionarItem(ItemCompra item) {
        itens.add(item);
        item.setCompra(this);
        recalcularValorTotal();
    }

    public void removerItem(ItemCompra item) {
        itens.remove(item);
        item.setCompra(null);
        recalcularValorTotal();
    }

    public void recalcularValorTotal() {
        this.valorTotal = itens.stream()
                .map(ItemCompra::getSubtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Usuario getCliente() { return cliente; }
    public void setCliente(Usuario cliente) { this.cliente = cliente; }

    public List<ItemCompra> getItens() { return itens; }
    public void setItens(List<ItemCompra> itens) { this.itens = itens; }

    public BigDecimal getValorTotal() { return valorTotal; }
    public void setValorTotal(BigDecimal valorTotal) { this.valorTotal = valorTotal; }

    public LocalDateTime getDataCompra() { return dataCompra; }
    public void setDataCompra(LocalDateTime dataCompra) { this.dataCompra = dataCompra; }

    public String getMetodoPagamento() { return metodoPagamento; }
    public void setMetodoPagamento(String metodoPagamento) { this.metodoPagamento = metodoPagamento; }
}

