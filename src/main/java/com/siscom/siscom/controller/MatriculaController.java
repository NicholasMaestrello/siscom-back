package com.siscom.siscom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siscom.siscom.entity.MatriculaEntity;
import com.siscom.siscom.repository.MatriculaRepository;

@RestController
public class MatriculaController {

	@Autowired
	private MatriculaRepository mariculaRepository;
	
	@RequestMapping("/api/matricula")
	public List<MatriculaEntity> getAll() {
		return mariculaRepository.findAll();
	}
}
