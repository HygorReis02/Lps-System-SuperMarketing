package com.hygor.erick.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.*;

@RestController
@RequestMapping("/api/promocoes")
public class PromocaoController {

    @GetMapping
    public ResponseEntity<List<String>> listarPromocoes() {
        return ResponseEntity.ok(List.of("Promoção 1", "Promoção 2"));
    }
}
