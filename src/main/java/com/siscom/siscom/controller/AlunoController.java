package com.siscom.siscom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siscom.siscom.model.dto.AlunoDTO;
import com.siscom.siscom.service.AlunoService;

@RestController
public class AlunoController {

	@Autowired
	private AlunoService alunoService;
	
	@RequestMapping("/api/aluno")
	public List<AlunoDTO> getAll() {
		List<AlunoDTO> a = alunoService.listarAlunos();
		return a;
	}
	
	@RequestMapping(method = RequestMethod.POST, path="/api/aluno")
	public String inserir(@RequestBody AlunoDTO aluno) {
		return alunoService.inserirAluno(aluno);
	}

	@RequestMapping(method = RequestMethod.PUT, path="/api/aluno")
	public String alterar(@RequestBody AlunoDTO aluno) {
		return alunoService.alterarAluno(aluno);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, path="/api/aluno/{id}")
	public String deletar(@PathVariable int id) {
		return alunoService.deletarAluno(id);
	}
}
