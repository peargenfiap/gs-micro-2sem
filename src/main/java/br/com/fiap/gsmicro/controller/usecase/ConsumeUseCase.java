package br.com.fiap.gsmicro.controller.usecase;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.gsmicro.domain.entity.Consume;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/consume")
public interface ConsumeUseCase {

	@Operation(summary = "Lista todos os consumes.",
			description = "Vai retornar todos os consumes.",
			tags = { "Consumes" })
	@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Operação realizada com sucesso", content = @Content(schema = @Schema(implementation = ResponseEntity.class)))})
	@PostMapping(value = "/", consumes = "multipart/form-data")
	@ResponseStatus(HttpStatus.OK)
	public abstract ResponseEntity<List<Consume>> obterListaConsume();
	
	@Operation(summary = "Lista todos os consumes a partir da chave do indicadotr.",
			description = "Vai retornar todos os consumes a partir da chave do indicadotr.",
			tags = { "Consumes" })
	@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Operação realizada com sucesso", content = @Content(schema = @Schema(implementation = ResponseEntity.class)))})
	@PostMapping(value = "/", consumes = "multipart/form-data")
	@ResponseStatus(HttpStatus.OK)
	public abstract ResponseEntity<List<Consume>> obterListaConsumePorIdIndicator(String indicatorKey);
	
}
