package com.hygor.erick.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/relatorios")
public class RelatorioController {

    @GetMapping("/vendas")
    public ResponseEntity<String> gerarRelatorioVendas() {
        return ResponseEntity.ok("Relatório de vendas gerado!");
    }
}
