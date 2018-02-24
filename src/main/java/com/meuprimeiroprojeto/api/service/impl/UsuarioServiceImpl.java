package com.meuprimeiroprojeto.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuprimeiroprojeto.api.entities.Usuario;
import com.meuprimeiroprojeto.api.repository.UsuarioRepository;
import com.meuprimeiroprojeto.api.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Optional<Usuario> buscarPorEmail(String email) {
		return Optional.ofNullable(this.usuarioRepository.findByEmail(email));
	}
}
