package com.meuprimeiroprojeto.api.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meuprimeiroprojeto.api.dto.EmpresaDto;
import com.meuprimeiroprojeto.api.utils.Response;

@RestController
@RequestMapping("/api/exemplo")
public class EmpresaController {

	@PostMapping
	public ResponseEntity<Response<EmpresaDto>> cadastrar(@Valid @RequestBody EmpresaDto empresaDto,
			BindingResult result) {
		Response<EmpresaDto> response = new Response<EmpresaDto>();
		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		empresaDto.setId(1L);
		response.setData(empresaDto);
		return ResponseEntity.ok(response);
	}
}
