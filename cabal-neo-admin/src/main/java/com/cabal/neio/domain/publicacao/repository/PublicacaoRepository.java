package com.cabal.neio.domain.publicacao.repository;

import com.cabal.neio.domain.publicacao.model.Publicacao;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PublicacaoRepository extends PagingAndSortingRepository<Publicacao, Integer> {
}
