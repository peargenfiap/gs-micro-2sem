package br.com.fiap.gsmicro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.gsmicro.domain.entity.Indicator;
import br.com.fiap.gsmicro.domain.repository.IndicatorRestRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/indicator")
public class IndicatorController {

	@Autowired
	private IndicatorRestRepository indicatorRepository;
	
	@GetMapping("/")
	public ResponseEntity<List<Indicator>> obterListaIndicator() {
		var indicators = indicatorRepository.findAll();
		return ResponseEntity.ok(indicators);
	}
	
	@PostMapping("/bulk")
	@Transactional
	public ResponseEntity<List<Indicator>> inserirOds(@Valid @RequestBody List<Indicator> ods) {
		List<Indicator> savedIndicators = indicatorRepository.saveAll(ods);
		return ResponseEntity.ok(savedIndicators);
	}
	
}
