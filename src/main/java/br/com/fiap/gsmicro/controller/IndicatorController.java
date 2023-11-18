package br.com.fiap.gsmicro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.gsmicro.domain.entity.Indicator;
import br.com.fiap.gsmicro.domain.model.IndicadorResponseDTO;
import br.com.fiap.gsmicro.domain.repository.IndicatorRestRepository;
import br.com.fiap.gsmicro.domain.service.impl.IndicadoresServiceImpl;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/indicator")
public class IndicatorController {

	@Autowired
	private IndicatorRestRepository indicatorRepository;
	
	@Autowired
	private IndicadoresServiceImpl indicadorService;
	
	@GetMapping("/")
	public ResponseEntity<List<Indicator>> obterListaIndicator() {
		var indicators = indicatorRepository.findAll();
		return ResponseEntity.ok(indicators);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<List<IndicadorResponseDTO>> obterIndicadores(@PathVariable String id) {
		List<IndicadorResponseDTO> indicators = indicadorService.obterIndicadores(id);
		return ResponseEntity.ok(indicators);
	}
	
	@PostMapping("/bulk")
	@Transactional
	public ResponseEntity<List<Indicator>> inserirOds(@Valid @RequestBody List<Indicator> ods) {
		List<Indicator> savedIndicators = indicatorRepository.saveAll(ods);
		return ResponseEntity.ok(savedIndicators);
	}
	
}
