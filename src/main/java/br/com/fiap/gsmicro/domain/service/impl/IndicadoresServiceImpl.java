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
	
	/**
	 * Recupera uma lista de indicadores com base no ID fornecido.
	 * 
	 * Este método consulta o DAO para obter indicadores correspondentes ao ID especificado.
	 * Ele retorna uma lista de objetos {@link IndicadorResponseDTO}, que contém informações como o ano e o consumo.
	 * 
	 * @param id O ID do indicador a ser buscado. Este ID é usado para filtrar os indicadores na consulta ao banco de dados.
	 * @return Uma lista de {@link IndicadorResponseDTO} representando os indicadores encontrados. Se nenhum indicador for encontrado, retorna uma lista vazia.
	 * @throws DataAccessException Se ocorrer um erro durante a comunicação com o banco de dados. (Nota: dependendo do framework ou biblioteca que você está usando, você pode querer detalhar os tipos específicos de exceções que podem ser lançadas).
	 */
	@Override
	public List<IndicadorResponseDTO> obterIndicadores(String id) {
		List<IndicadorResponseDTO> indicadores = indicadorDAO.obterIndicadores(id);
		
		return indicadores;
	}

}
