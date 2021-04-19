package com.cabal.neio.domain.publicacao.model;

import com.cabal.neio.common.BaseModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "publicacoes")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Publicacao extends BaseModel {

    @NotBlank
    @ApiModelProperty(value = "Titulo da publicacao", required = true)
    private String titulo;

    private LocalDateTime dataPostagem;

    @ApiModelProperty(value = "flag de destaque", required = true)
    private Boolean destacar = false;

    @ApiModelProperty(value = "Subtitulo da postagem")
    private String subtitulo;

    @ApiModelProperty(value = "Tipo de publicacao", required = true)
    @NotNull
    private TipoPublicacao tipoPublicacao;

    @ApiModelProperty(value = "Texto da publicação")
    @Column(columnDefinition = "LONGTEXT")
    private String texto;

    @ApiModelProperty(value = "Autor da publicação")
    private String autor;

    @ApiModelProperty(value = "Fonte da publicação")
    private String fonte;

    @ApiModelProperty(value = "Link da principal imagem da publicação")
    private String imagemPrincipal;

    @ApiModelProperty(value = "Legenda da imagem principal")
    private String legendaImagem;

    @ApiModelProperty(value = "Link de um video")
    private String videoUrl;

    @ApiModelProperty(value = "palavras chaves")
    private String keywords;
}
