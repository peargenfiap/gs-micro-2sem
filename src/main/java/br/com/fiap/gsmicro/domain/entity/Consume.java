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
@Entity(name = "Consume")
@Table(name = "Consume")
public class Consume {

	@Id
	@Column(name = "ConsumeKey")
	private String consumeKey;
	@Column(name = "IndicatorKey")
    private String indicatorKey;
	@Column(name = "ConsumeYear")
    private Integer consumeYear;
	@Column(name = "ConsumeQuantity")
    private Integer consumeQuantity;
	
}
