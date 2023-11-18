package br.com.fiap.gsmicro.domain.service.usecase;

import java.util.List;

import br.com.fiap.gsmicro.domain.model.IndicadorResponseDTO;

public interface IndicadoresServiceUseCase {

	public abstract List<IndicadorResponseDTO> obterIndicadores(String id);
	
}
