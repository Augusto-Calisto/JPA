package com.jpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jpa.model.Funcionario;
import com.jpa.repository.FuncionarioRepository;
import com.jpa.services.FuncionarioService;

@Controller
@RequestMapping("api")
public class FuncionarioController {

	@Autowired // Injeção de dependencia (IOC e DI)
	private FuncionarioRepository funcionarioRespository;
	
	@Autowired // Injeção de dependencia (IOC e DI)
	private FuncionarioService funcionarioService;
	

	@GetMapping("salvar")
	public void salvar(String nome) {
		funcionarioRespository.save(new Funcionario(nome));
	}
	
	@GetMapping("buscar")
	@ResponseBody
	public Funcionario buscar(int id) {
		System.out.println("entrei");
		
		Optional<Funcionario> funcionario = funcionarioRespository.findById(id);
		
		return funcionario.get();
	}
	
	@GetMapping("nome")
	@ResponseBody
	public Funcionario buscarNome(String nome) {
		
		Funcionario funcionario = funcionarioService.buscarNome(nome);
		
		return funcionario;
	}
}
