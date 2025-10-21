package com.hygor.erick.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/estoque")
public class EstoqueController {

    @GetMapping
    public ResponseEntity<String> listarEstoque() {
        return ResponseEntity.ok("Lista de estoque");
    }
}

