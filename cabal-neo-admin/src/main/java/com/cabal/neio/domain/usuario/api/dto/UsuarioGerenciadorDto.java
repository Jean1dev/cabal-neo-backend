package com.cabal.neio.domain.usuario.api.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class UsuarioGerenciadorDto {

    private String nome;

    private String email;

    private String usario;

    @NotNull
    private String senha;
}
