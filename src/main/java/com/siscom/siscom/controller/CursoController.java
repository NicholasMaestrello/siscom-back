package com.siscom.siscom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siscom.siscom.entity.CursoEntity;
import com.siscom.siscom.repository.CursoRepository;

@RestController
public class CursoController {

	@Autowired
	private CursoRepository cursoRepository;
	
	@RequestMapping("/api/curso")
	public List<CursoEntity> getAll() {
		return cursoRepository.findAll();
	}
}
