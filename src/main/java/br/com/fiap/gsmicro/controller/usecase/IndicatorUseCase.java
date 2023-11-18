package br.com.fiap.gsmicro.controller.usecase;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.gsmicro.domain.entity.Indicator;
import br.com.fiap.gsmicro.domain.model.IndicadorResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/indicator")
public interface IndicatorUseCase {

	@Operation(summary = "Lista todos os indicadores.",
			description = "Vai retornar todos os indicadores.",
			tags = { "Indicadores" })
	@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Operação realizada com sucesso", content = @Content(schema = @Schema(implementation = ResponseEntity.class)))})
	@PostMapping(value = "/", consumes = "multipart/form-data")
	@ResponseStatus(HttpStatus.OK)
	public abstract ResponseEntity<List<Indicator>> obterListaIndicator();
	
	@Operation(summary = "Lista todos os indicadores a partir de um ID informado.",
			description = "Vai retornar todos os indicadores respectivos aquele ID.",
			tags = { "Indicadores" })
	@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Operação realizada com sucesso", content = @Content(schema = @Schema(implementation = ResponseEntity.class)))})
	@PostMapping(value = "/", consumes = "multipart/form-data")
	@ResponseStatus(HttpStatus.OK)
	public abstract ResponseEntity<List<IndicadorResponseDTO>> obterIndicadores(@PathVariable String id);
	
	@Operation(summary = "Insere uma lista de indicadores.",
			description = "Vai inserir uma lista de indicadores de uma vez só.",
			tags = { "Indicadores" })
	@ApiResponses(value = {
	@ApiResponse(responseCode = "200", description = "Operação realizada com sucesso", content = @Content(schema = @Schema(implementation = ResponseEntity.class)))})
	@PostMapping(value = "/", consumes = "multipart/form-data")
	@ResponseStatus(HttpStatus.OK)
	public abstract ResponseEntity<List<Indicator>> inserirOds(@Valid @RequestBody List<Indicator> ods);
	
}
