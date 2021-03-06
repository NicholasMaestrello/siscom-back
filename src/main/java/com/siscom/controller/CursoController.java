package com.siscom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siscom.model.dto.CursoDTO;
import com.siscom.service.CursoService;

@RestController
@RequestMapping("/api/curso")
public class CursoController {

	@Autowired
	CursoService cursoService;
	
	@RequestMapping(method= RequestMethod.GET)
	public List<CursoDTO> getAll() {
		return cursoService.listarCursos();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public CursoDTO inserir(@RequestBody CursoDTO curso) {
		return cursoService.incluirCurso(curso);
	}
	
	@RequestMapping(method= RequestMethod.PUT)
	public CursoDTO alterarCurso(@RequestBody CursoDTO curso) {
		return cursoService.alterarCurso(curso);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/{id}")
	public void excluirCurso(@PathVariable("id") int id) {
		cursoService.excluirCurso(id);
	}
}
