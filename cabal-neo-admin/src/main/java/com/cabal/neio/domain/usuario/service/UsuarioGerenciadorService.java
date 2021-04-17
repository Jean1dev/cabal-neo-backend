package com.cabal.neio.domain.usuario.service;

import com.cabal.neio.domain.usuario.api.dto.UsuarioGerenciadorDto;
import com.cabal.neio.domain.usuario.model.UsuarioGerenciador;
import com.cabal.neio.domain.usuario.repository.UsuarioGerenciadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioGerenciadorService {

    @Autowired
    private UsuarioGerenciadorRepository repository;

    public void criarUsuario(UsuarioGerenciadorDto dto) {
        repository.save(UsuarioGerenciador.builder()
                .nome(dto.getNome())
                .email(dto.getEmail())
                .usuario(dto.getUsario())
                .senha(new BCryptPasswordEncoder().encode(dto.getSenha()))
                .build());
    }
}
