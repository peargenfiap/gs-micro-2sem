package br.com.fiap.gsmicro.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.fiap.gsmicro.domain.entity.Consume;

@RepositoryRestResource(
		path = "consume",
		collectionResourceRel = "consume"
)
public interface ConsumeRestRepository extends CrudRepository<Consume, String> {

}
