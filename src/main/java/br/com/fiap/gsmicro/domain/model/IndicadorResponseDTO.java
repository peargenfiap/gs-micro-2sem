package br.com.fiap.gsmicro.domain.model;

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
public class IndicadorResponseDTO {

	private String ano;
	private String consumo;

	public static IndicadorResponseDTO from(Object[] result) {
		String ano = String.valueOf(result[0]);
		String consumo = String.valueOf(result[1]);
		return new IndicadorResponseDTO(ano, consumo);
	}

}
