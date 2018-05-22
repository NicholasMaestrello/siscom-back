package com.siscom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siscom.model.dto.AlunoDTO;
import com.siscom.model.dto.DefaultResponseDTO;
import com.siscom.service.AlunoService;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;
	
	@RequestMapping(method= RequestMethod.GET)
	public List<AlunoDTO> getAll() {
		List<AlunoDTO> a = alunoService.listarAlunos();
		return a;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public DefaultResponseDTO<AlunoDTO> inserir(@RequestBody AlunoDTO aluno) {
		return alunoService.inserirAluno(aluno);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public String alterar(@RequestBody AlunoDTO aluno) {
		return alunoService.alterarAluno(aluno);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/{id}")
	public String deletar(@PathVariable("id") int id) {
		return alunoService.deletarAluno(id);
	}
}
