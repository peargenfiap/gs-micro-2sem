package br.com.fiap.gsmicro.domain.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.com.fiap.gsmicro.domain.model.IndicadorResponseDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class IndicatorDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<IndicadorResponseDTO> obterIndicadores(String id) {
		String sql = "SELECT  CONSUME.CONSUME_YEAR as ano, "
				+ "           CONSUME.CONSUME_QUANTITY as consumo"
				+ " FROM CONSUME CONSUME "
				+ " 	INNER JOIN INDICATOR INDICATOR "
				+ " 	ON CONSUME.INDICATOR_KEY = INDICATOR.INDICATOR_KEY "
				+ " WHERE INDICATOR.INDICATOR_KEY = :id "
				+ " 	ORDER BY 1 ASC";

		@SuppressWarnings("unchecked")
		List<Object[]> results = entityManager
					.createNativeQuery(sql)
					.setParameter("id", id)
					.getResultList();

		List<IndicadorResponseDTO> indicadores = results.stream()
				.map(IndicadorResponseDTO::from)
				.collect(Collectors.toList());

		return indicadores;
	}
	
}
