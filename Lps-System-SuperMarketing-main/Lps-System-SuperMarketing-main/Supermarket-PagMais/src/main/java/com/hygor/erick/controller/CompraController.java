package com.hygor.erick.controller;


import com.example.supermarket.dto.CompraDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/compras")
public class CompraController {

    @PostMapping
    public ResponseEntity<CompraDTO> realizarCompra(@RequestBody CompraDTO compra) {
        return ResponseEntity.ok(compra);
    }
}

