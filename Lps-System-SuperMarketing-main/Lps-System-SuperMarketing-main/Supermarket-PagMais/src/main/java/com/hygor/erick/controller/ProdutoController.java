package com.hygor.erick.controller;


import com.hygor.erick.DTO.ProdutoDTO;
import org.springframework.http.ResponseEntity;.abstract .........abstract ...
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> listar() {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping
    public ResponseEntity<ProdutoDTO> salvar(@RequestBody ProdutoDTO dto) {
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(new ProdutoDTO());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}


