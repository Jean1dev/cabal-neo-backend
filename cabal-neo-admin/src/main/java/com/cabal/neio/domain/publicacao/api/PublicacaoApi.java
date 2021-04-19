package com.cabal.neio.domain.publicacao.api;

import com.cabal.neio.domain.publicacao.model.Publicacao;
import com.cabal.neio.domain.publicacao.repository.PublicacaoRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "publicacao")
public class PublicacaoApi {

    @Autowired
    private PublicacaoRepository repository;

    @GetMapping
    @ApiOperation(value = "Retorna a lista de publicações")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Retorna a lista de publicações"),})
    public Page<Publicacao> findAll(@RequestParam(value = "page", defaultValue = "0", required = false) int page,
                                    @RequestParam(value = "size", defaultValue = "10", required = false) int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

    @PostMapping
    @ApiOperation(value = "Insere uma nova publicação")
    public void postPublicacao(@RequestBody @Valid Publicacao publicacao) {
        publicacao.setDataPostagem(LocalDateTime.now());
        repository.save(publicacao);
    }
}
