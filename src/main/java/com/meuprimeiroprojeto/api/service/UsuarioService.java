package com.meuprimeiroprojeto.api.service;

import java.util.Optional;

import com.meuprimeiroprojeto.api.entities.Usuario;

public interface UsuarioService {

	/**
	 * Busca e retorna um usuário dado um email.
	 *
	 * @param email
	 * @return Optional<Usuario>
	 */
	Optional<Usuario> buscarPorEmail(String email);
}
