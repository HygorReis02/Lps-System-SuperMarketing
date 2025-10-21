package com.hygor.erick.DTO;




import java.time.LocalDate;
import java.util.List;

public class CompraDTO {
    private Long id;
    private Long clienteId;
    private LocalDate dataCompra;
    private Double total;
    private List<ItemCompraDTO> itens;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getClienteId() { return clienteId; }
    public void setClienteId(Long clienteId) { this.clienteId = clienteId; }

    public LocalDate getDataCompra() { return dataCompra; }
    public void setDataCompra(LocalDate dataCompra) { this.dataCompra = dataCompra; }

    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }

    public List<ItemCompraDTO> getItens() { return itens; }
    public void setItens(List<ItemCompraDTO> itens) { this.itens = itens; }
}
