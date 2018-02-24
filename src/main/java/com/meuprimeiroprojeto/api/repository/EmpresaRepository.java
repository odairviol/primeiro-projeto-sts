package com.meuprimeiroprojeto.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meuprimeiroprojeto.api.entities.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	Empresa findByCnpj(String cnpj);
}
