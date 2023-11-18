package br.com.fiap.gsmicro.domain.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.gsmicro.domain.entity.Ods;
import br.com.fiap.gsmicro.domain.model.IndicadorDTO;
import br.com.fiap.gsmicro.domain.model.Objetivo;
import br.com.fiap.gsmicro.domain.model.ObjetivoGeral;
import br.com.fiap.gsmicro.domain.repository.IndicatorRestRepository;
import br.com.fiap.gsmicro.domain.repository.OdsRestRepository;
import br.com.fiap.gsmicro.domain.service.usecase.ObjetivosServiceUseCase;

@Service
public class ObjetivosServiceImpl implements ObjetivosServiceUseCase {

	@Autowired
	private OdsRestRepository odsRepository;

	@Autowired
	private IndicatorRestRepository indicatorRepository;

	/**
	 * Obtém uma lista de Objetivos Gerais. Recupera todos os objetos ODS do
	 * repositório, converte cada um em um Objetivo Geral e retorna a lista.
	 *
	 * @return Lista de Objetivos Gerais.
	 */
	public List<ObjetivoGeral> obterObjetivos() {
		return odsRepository
				.findAll()
				.stream()
				.map(this::buildGeneralObjective)
				.collect(Collectors.toList());
	}

	/**
	 * Constrói um Objetivo Geral a partir de um objeto ODS. Cria um novo Objetivo
	 * Geral, define suas propriedades com base nos dados do ODS e retorna o
	 * objetivo montado.
	 *
	 * @param ods Objeto ODS do qual o Objetivo Geral será construído.
	 * @return Objetivo Geral construído a partir do ODS.
	 */
	private ObjetivoGeral buildGeneralObjective(Ods ods) {
		ObjetivoGeral generalObjective = new ObjetivoGeral();
		generalObjective.setId(ods.getOdsKey());
		generalObjective.setObjetivos(constructObjective(ods));
		generalObjective.setIndicadores(findIndicators(ods.getOdsKey()));
		return generalObjective;
	}

	/**
	 * Constrói um Objetivo a partir de um objeto ODS. Cria e retorna um novo
	 * Objetivo usando os objetivos brasileiro e global do ODS fornecido.
	 *
	 * @param ods Objeto ODS do qual o Objetivo será construído.
	 * @return Objetivo criado com base nos objetivos do ODS.
	 */
	private Objetivo constructObjective(Ods ods) {
		return new Objetivo(ods.getBrazilObjective(), ods.getGlobalObjective());
	}

	/**
	 * Encontra indicadores para uma chave ODS específica. Consulta o
	 * repositório de indicadores para encontrar todos os indicadores associados à
	 * chave ODS fornecida e retorna uma lista.
	 *
	 * @param odsKey A chave ODS para a qual os indicadores serão buscados.
	 * @return Lista de IndicadoresDTO correspondentes à chave ODS fornecida.
	 */
	private List<IndicadorDTO> findIndicators(String odsKey) {
		return indicatorRepository
				.findByOdsKey(odsKey).stream()
				.map(ind -> new IndicadorDTO(ind.getIndicatorKey(), ind.getIndicatorDescription()))
				.collect(Collectors.toList());
	}

}
