package com.hygor.erick.controller;

import com.example.supermarket.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/registrar")
    public String registrar(
            @RequestParam String username,
            @RequestParam String senha,
            @RequestParam String nomeCompleto,
            @RequestParam(defaultValue = "ROLE_CLIENTE") String role) {

        return authService.registrar(username, senha, nomeCompleto, role);
    }

    @PostMapping("/login")
    public String login(
            @RequestParam String username,
            @RequestParam String senha) {

        return authService.login(username, senha);
    }
}

