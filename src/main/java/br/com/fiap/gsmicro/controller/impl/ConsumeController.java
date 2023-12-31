package br.com.fiap.gsmicro.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.gsmicro.controller.usecase.ConsumeUseCase;
import br.com.fiap.gsmicro.domain.entity.Consume;
import br.com.fiap.gsmicro.domain.repository.ConsumeRestRepository;

@RestController
@RequestMapping("/v1/consume")
public class ConsumeController implements ConsumeUseCase {

	@Autowired
	private ConsumeRestRepository consumeRepository;
	
	@GetMapping("/")
	public ResponseEntity<List<Consume>> obterListaConsume() {
		var consumes = consumeRepository.findAll();
		return ResponseEntity.ok(consumes);
	}

	@GetMapping("/porindicador")
	public ResponseEntity<List<Consume>> obterListaConsumePorIdIndicator(@RequestParam(name = "indicatorKey", required = true) String indicatorKey) {
		var consumes = consumeRepository.findByIndicatorKey(indicatorKey);
		return ResponseEntity.ok(consumes);
	}
	
}
