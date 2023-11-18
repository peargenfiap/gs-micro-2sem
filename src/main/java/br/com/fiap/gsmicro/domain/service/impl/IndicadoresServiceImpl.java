package br.com.fiap.gsmicro.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.gsmicro.domain.dao.IndicatorDAO;
import br.com.fiap.gsmicro.domain.model.IndicadorResponseDTO;
import br.com.fiap.gsmicro.domain.service.usecase.IndicadoresServiceUseCase;

@Service
public class IndicadoresServiceImpl implements IndicadoresServiceUseCase {

	@Autowired
	private IndicatorDAO indicadorDAO;
	
	@Override
	public List<IndicadorResponseDTO> obterIndicadores(String id) {
		List<IndicadorResponseDTO> indicadores = indicadorDAO.obterIndicadores(id);
		
		return indicadores;
	}

	
}
