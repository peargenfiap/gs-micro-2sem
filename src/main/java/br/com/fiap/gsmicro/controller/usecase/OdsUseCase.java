package br.com.fiap.gsmicro.controller.usecase;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.gsmicro.domain.entity.Ods;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/ods")
public interface OdsUseCase {

	@Operation(summary = "Lista todos as ods.",
			description = "Vai retornar todas as Ods.",
			tags = { "Ods" })
	@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Operação realizada com sucesso", content = @Content(schema = @Schema(implementation = ResponseEntity.class)))})
	@PostMapping(value = "/", consumes = "multipart/form-data")
	@ResponseStatus(HttpStatus.OK)
	public abstract ResponseEntity<List<Ods>> obterListaOds();
	
	@Operation(summary = "Insere uma lista de ods.",
			description = "Insere uma lista de Ods.",
			tags = { "Ods" })
	@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Operação realizada com sucesso", content = @Content(schema = @Schema(implementation = ResponseEntity.class)))})
	@PostMapping(value = "/", consumes = "multipart/form-data")
	@ResponseStatus(HttpStatus.OK)
	public abstract ResponseEntity<List<Ods>> inserirOds(@Valid @RequestBody List<Ods> ods);
	
}
