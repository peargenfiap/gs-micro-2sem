package br.com.fiap.gsmicro.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.gsmicro.domain.entity.Consume;

public interface ConsumeRestRepository extends JpaRepository<Consume, String> {
	
	List<Consume> findByIndicatorKey(String indicatorKey);

}
 