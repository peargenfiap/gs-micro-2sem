package br.com.fiap.gsmicro.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.gsmicro.domain.entity.Indicator;

public interface IndicatorRestRepository extends JpaRepository<Indicator, String> {

	// Método para buscar Indicadores pelo OdsKey
	List<Indicator> findByOdsKey(String odsKey);

}
