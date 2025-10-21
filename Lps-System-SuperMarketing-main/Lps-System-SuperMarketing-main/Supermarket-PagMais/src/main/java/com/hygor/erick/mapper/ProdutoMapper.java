package com.hygor.erick.mapper;


import com.hygor.erick.DTO.ProdutoDTO;
import com.hygor.erick.entities.Produto;

public class ProdutoMapper {

    public static ProdutoDTO toDTO(Produto produto) {
        ProdutoDTO dto = new ProdutoDTO();
        dto.setId(produto.getId());
        dto.setNome(produto.getNome());
        dto.setPreco(produto.getPreco());
        dto.setCategoria(produto.getCategoria());
        return dto;
    }

    public static Produto toEntity(ProdutoDTO dto) {
        Produto produto = new Produto();
        produto.setId(dto.getId());
        produto.setNome(dto.getNome());
        produto.setPreco(dto.getPreco());
        produto.setCategoria(dto.getCategoria());
        return produto;
    }
}

