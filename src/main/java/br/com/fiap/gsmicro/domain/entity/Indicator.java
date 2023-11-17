package br.com.fiap.gsmicro.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "Indicator")
@Table(name = "Indicator")
public class Indicator {

	@Id
	private String indicatorKey;
	private String odsKey;
	private String indicatorDescription;
	private String indicatorName;

}
