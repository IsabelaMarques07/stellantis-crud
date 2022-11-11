package com.fiap.stellantis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.stellantis.models.Ambiente;

@Repository
public interface AmbienteRepository extends JpaRepository<Ambiente, Long> {

}
