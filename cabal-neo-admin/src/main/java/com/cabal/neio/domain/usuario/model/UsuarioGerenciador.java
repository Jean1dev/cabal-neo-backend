package com.cabal.neio.domain.usuario.model;

import com.cabal.neio.common.BaseModel;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "usuario_gerenciador")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioGerenciador extends BaseModel {

    @NotBlank(message = "O Nome não pode ser vazio")
    private String nome;

    @Email(message = "forneça um email valido")
    private String email;

    @Column(unique = true)
    @NotNull(message = "usuario é obrigatorio")
    private String usuario;

    @NotNull(message = "senha é obrigatorio")
    private String senha;
}
