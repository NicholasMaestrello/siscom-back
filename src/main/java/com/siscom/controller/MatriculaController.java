package com.siscom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siscom.model.dto.MatriculaDTO;
import com.siscom.service.MatriculaService;

@RestController
public class MatriculaController {

	@Autowired
	private MatriculaService matriculaService;
	
	@RequestMapping("/api/matricula")
	public List<MatriculaDTO> getAll() {
		return matriculaService.listarMatriculas();
	}
}
