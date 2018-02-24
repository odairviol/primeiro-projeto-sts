package com.meuprimeiroprojeto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meuprimeiroprojeto.api.service.ExemploCacheService;

@RestController
@RequestMapping("/api/exemplo")
public class ExemploController {
	
	@Autowired
	private ExemploCacheService exemploEhCacheService;

	@GetMapping(value = "/{nome}")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public String exemplo(@PathVariable("nome") String nome) {
		return " Olá " + nome;
	}
	
	@GetMapping(value = "/ehcache")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public String exemploEhCache() {
		return exemploEhCacheService.exemploCache();
	}
}