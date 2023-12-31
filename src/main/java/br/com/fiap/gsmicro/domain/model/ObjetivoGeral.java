package br.com.fiap.gsmicro.domain.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ObjetivoGeral {
	private String id;
	private Objetivo objetivos;
	private List<IndicadorDTO> indicadores;
}
