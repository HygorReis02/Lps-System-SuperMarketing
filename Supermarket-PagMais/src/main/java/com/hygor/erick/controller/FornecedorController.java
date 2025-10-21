package com.hygor.erick.controller;


import com.hygor.erick.DTO.FornecedorDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/fornecedores")
public class FornecedorController {

    @GetMapping
    public ResponseEntity<List<FornecedorDTO>> listar() {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping
    public ResponseEntity<FornecedorDTO> salvar(@RequestBody FornecedorDTO dto) {
        return ResponseEntity.ok(dto);
    }
}

