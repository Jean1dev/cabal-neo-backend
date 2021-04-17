package com.cabal.neio.domain.usuario.repository;

import com.cabal.neio.domain.usuario.model.UsuarioGerenciador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface UsuarioGerenciadorRepository extends PagingAndSortingRepository<UsuarioGerenciador, Integer> {

    Optional<UsuarioGerenciador> findByUsuario(String usuario);
}
