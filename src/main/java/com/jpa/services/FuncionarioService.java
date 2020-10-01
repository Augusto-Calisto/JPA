package com.jpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.model.Funcionario;
import com.jpa.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	
	public Funcionario buscarNome(String nome) {
		String name = nome.toUpperCase();
		
		System.out.println(name);

		Funcionario funcionario = funcionarioRepository.buscarNome(name);

		return funcionario;
	}
}
