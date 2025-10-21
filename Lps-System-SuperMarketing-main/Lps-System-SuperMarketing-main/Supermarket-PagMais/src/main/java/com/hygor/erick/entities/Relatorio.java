package com.hygor.erick.entities;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "relatorios")
public class Relatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;

    private LocalDate dataGeracao;

    @Lob
    private String conteudo;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public LocalDate getDataGeracao() { return dataGeracao; }
    public void setDataGeracao(LocalDate dataGeracao) { this.dataGeracao = dataGeracao; }

    public String getConteudo() { return conteudo; }
    public void setConteudo(String conteudo) { this.conteudo = conteudo; }
}
