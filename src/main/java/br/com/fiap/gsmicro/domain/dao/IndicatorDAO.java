package br.com.fiap.gsmicro.domain.dao;

import java.util.List;

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
				+ " INNER JOIN INDICATOR INDICATOR "
				+ " ON CONSUME.INDICATOR_KEY = INDICATOR.INDICATOR_KEY "
				+ " WHERE INDICATOR.INDICATOR_KEY = :id";

		@SuppressWarnings("unchecked")
		List<IndicadorResponseDTO> indicadores = entityManager
				.createNativeQuery(sql)
				.setParameter("id", id)
				.getResultList();

		return indicadores;
	}
	
	
}
