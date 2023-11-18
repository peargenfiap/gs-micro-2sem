package br.com.fiap.gsmicro.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.gsmicro.domain.entity.Ods;

public interface OdsRestRepository extends JpaRepository<Ods, String> {

}
