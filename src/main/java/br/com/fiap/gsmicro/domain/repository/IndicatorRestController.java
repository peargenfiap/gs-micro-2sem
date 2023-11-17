package br.com.fiap.gsmicro.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.fiap.gsmicro.domain.entity.Indicator;

@RepositoryRestResource(
		path = "indicator",
		collectionResourceRel = "indicator"
)
public interface IndicatorRestController extends CrudRepository<Indicator, String>{

}
