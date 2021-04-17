package com.cabal.neio.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ErrorResponse implements Serializable {

    private String mensagem;

    private List<String> detalhes;

    private Integer status;
}
