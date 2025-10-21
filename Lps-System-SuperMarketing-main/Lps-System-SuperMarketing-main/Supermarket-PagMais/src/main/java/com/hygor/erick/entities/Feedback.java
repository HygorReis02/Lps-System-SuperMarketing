package com.hygor.erick.entities;



import jakarta.persistence.*;

@Entity
@Table(name = "feedbacks")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comentario;

    private int nota; // de 1 a 5

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }

    public int getNota() { return nota; }
    public void setNota(int nota) { this.nota = nota; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}
