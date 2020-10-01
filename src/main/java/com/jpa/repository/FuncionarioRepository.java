package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jpa.model.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
	
	/*
	 * ?numero = parametro do metodo
	 * 
	 * Esse número depois do ?, significa se é o primeiro parâmetro ou segundo, etc
	 */
	
	@Query("select f from Funcionario f where nome = ?1")
	public Funcionario buscarNome(String nome);
}

