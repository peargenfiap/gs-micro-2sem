package br.com.fiap.gsmicro.domain.entity;

import jakarta.persistence.Column;
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
	@Column(name = "IndicatorKey")
	private String indicatorKey;
	@Column(name = "OdsKey")
	private String odsKey;
	@Column(name = "IndicatorDescription")
	private String indicatorDescription;
	@Column(name = "IndicatorName")
	private String indicatorName;

}
