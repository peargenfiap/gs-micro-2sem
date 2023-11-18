package br.com.fiap.gsmicro.domain.service.usecase;

import java.util.List;

import br.com.fiap.gsmicro.domain.model.ObjetivoGeral;

public interface ObjetivosServiceUseCase {

	public abstract List<ObjetivoGeral> obterObjetivos();
	
}
