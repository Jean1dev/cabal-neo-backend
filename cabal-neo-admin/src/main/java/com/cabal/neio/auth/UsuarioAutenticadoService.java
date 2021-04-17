package com.cabal.neio.auth;

import com.cabal.neio.domain.usuario.model.UsuarioGerenciador;
import com.cabal.neio.domain.usuario.repository.UsuarioGerenciadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioAutenticadoService {

    @Autowired
    private UsuarioGerenciadorRepository repository;

    public UsuarioAutenticado find(String usuario) {
        UsuarioGerenciador usuarioEncontrado = repository.findByUsuario(usuario).orElseThrow();

        return UsuarioAutenticado.builder()
                .login(usuarioEncontrado.getUsuario())
                .password(usuarioEncontrado.getSenha())
                .build();
    }
}
