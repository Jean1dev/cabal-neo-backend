package com.cabal.neio.domain.usuario.api;

import com.cabal.neio.domain.usuario.api.dto.UsuarioGerenciadorDto;
import com.cabal.neio.domain.usuario.model.UsuarioGerenciador;
import com.cabal.neio.domain.usuario.repository.UsuarioGerenciadorRepository;
import com.cabal.neio.domain.usuario.service.UsuarioGerenciadorService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "usuario-gerenciador")
public class UsuarioGerenciadorApi {

    @Autowired
    private UsuarioGerenciadorRepository repository;

    @Autowired
    private UsuarioGerenciadorService service;

    @PostMapping
    @ApiOperation(value = "cria um usuario gerenciador da aplicação")
    public void criarUsuario(@RequestBody @Valid UsuarioGerenciadorDto usuario) {
        service.criarUsuario(usuario);
    }

    @GetMapping
    @ApiOperation(value = "Retorna a lista de usuarios gerenciadores da api")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Retorna a lista de usuarios gerenciadores da api"),})
    public Page<UsuarioGerenciador> findAll(@RequestParam(value = "page", defaultValue = "0", required = false) int page,
                                            @RequestParam(value = "size", defaultValue = "10", required = false) int size) {
        return repository.findAll(PageRequest.of(page, size));
    }
}
