package com.fiap.stellantis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.stellantis.models.Localizacao;


@Repository
public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long> {

}
