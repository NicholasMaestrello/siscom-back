package com.siscom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siscom.model.dto.CursoDTO;
import com.siscom.service.CursoService;

@RestController
public class CursoController {

	@Autowired
	CursoService cursoService;
	
	@RequestMapping("/api/curso")
	public List<CursoDTO> getAll() {
		return cursoService.listarCursos();
	}
}
