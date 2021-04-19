package com.cabal.neio.domain.usuario.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class UsuarioGerenciadorDto {

    @ApiModelProperty(value = "Nome do usuario", required = true)
    private String nome;

    @ApiModelProperty(value = "Email do usuario")
    private String email;

    @ApiModelProperty(value = "usuario que sera usado no login", required = true)
    private String usario;

    @ApiModelProperty(value = "senha usada no login", required = true)
    @NotNull
    private String senha;
}
