package com.hygor.erick.service;

import com.example.supermarket.entity.Role;
import com.example.supermarket.entity.Usuario;
import com.example.supermarket.repository.RoleRepository;
import com.example.supermarket.repository.UsuarioRepository;
import com.example.supermarket.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;

@Service
public class AuthService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    public String registrar(String username, String senha, String nomeCompleto, String roleNome) {
        if (usuarioRepository.existsByUsername(username)) {
            throw new RuntimeException("Usuário já existe!");
        }

        Role role = roleRepository.findByNome(roleNome)
                .orElseGet(() -> roleRepository.save(new Role(roleNome)));

        Set<Role> roles = new HashSet<>();
        roles.add(role);

        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setSenha(passwordEncoder.encode(senha));
        usuario.setNomeCompleto(nomeCompleto);
        usuario.setRoles(roles);
        usuario.setAtivo(true);

        usuarioRepository.save(usuario);
        return "Usuário registrado com sucesso!";
    }

    public String login(String username, String senha) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, senha));
        return jwtUtil.generateToken(username);
    }
}
