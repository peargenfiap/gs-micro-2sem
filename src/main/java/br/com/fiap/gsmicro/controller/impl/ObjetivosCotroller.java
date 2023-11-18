package br.com.fiap.gsmicro.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.gsmicro.controller.usecase.ObjetivosUseCase;
import br.com.fiap.gsmicro.domain.model.ObjetivoGeral;
import br.com.fiap.gsmicro.domain.service.impl.ObjetivosServiceImpl;

@RestController
@RequestMapping("/v1/objetivos")
public class ObjetivosCotroller implements ObjetivosUseCase {

	@Autowired
	private ObjetivosServiceImpl objetivosServices;
	
	@GetMapping("/")
	public ResponseEntity<List<ObjetivoGeral>> obterObjetivos() {
		List<ObjetivoGeral> result = objetivosServices.obterObjetivos();
		
		return ResponseEntity.ok(result);
	}
	
}
