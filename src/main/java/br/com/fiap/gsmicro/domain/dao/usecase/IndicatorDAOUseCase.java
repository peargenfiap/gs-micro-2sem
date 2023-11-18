package br.com.fiap.gsmicro.domain.dao.usecase;

import java.util.List;

public interface IndicatorDAOUseCase {
	
	public abstract List<Object[]> obterIndicadores(String id);

}
