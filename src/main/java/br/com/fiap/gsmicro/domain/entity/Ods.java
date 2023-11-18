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
@Entity(name = "Ods")
@Table(name = "Ods")
public class Ods {

	@Id
	@Column(name = "OdsKey")
	private String odsKey;
	@Column(name = "GlobalObjective")
	private String globalObjective;
	@Column(name = "BrazilObjective")
	private String brazilObjective;
	
}
