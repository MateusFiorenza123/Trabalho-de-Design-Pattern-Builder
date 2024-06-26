package com.finan.orcamento.repositories;

import com.finan.orcamento.builderPattern.CasaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasaRepository extends JpaRepository<CasaModel, Long> {
}