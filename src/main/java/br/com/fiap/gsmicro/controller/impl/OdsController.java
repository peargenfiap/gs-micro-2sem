package br.com.fiap.gsmicro.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.gsmicro.domain.entity.Ods;
import br.com.fiap.gsmicro.domain.repository.OdsRestRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/ods")
public class OdsController {

	@Autowired
	private OdsRestRepository odsRepository;

	@GetMapping("/")
	public ResponseEntity<List<Ods>> obterListaOds() {
		var ods = odsRepository.findAll();
		return ResponseEntity.ok(ods);
	}

	@PostMapping("/bulk")
	@Transactional
	public ResponseEntity<List<Ods>> inserirOds(@Valid @RequestBody List<Ods> ods) {
		List<Ods> savedOds = odsRepository.saveAll(ods);
		return ResponseEntity.ok(savedOds);
	}

	}
