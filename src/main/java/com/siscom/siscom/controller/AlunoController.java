package com.siscom.siscom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siscom.siscom.entity.AlunoEntity;
import com.siscom.siscom.repository.AlunoRepository;

@RestController
public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepository;
	
	@RequestMapping("/api/aluno")
	public List<AlunoEntity> getAll() {
		return alunoRepository.findAll();
	}
}
