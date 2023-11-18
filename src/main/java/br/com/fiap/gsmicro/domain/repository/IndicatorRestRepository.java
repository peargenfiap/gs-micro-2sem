package br.com.fiap.gsmicro.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.gsmicro.domain.entity.Indicator;

public interface IndicatorRestRepository extends JpaRepository<Indicator, String>{

}
