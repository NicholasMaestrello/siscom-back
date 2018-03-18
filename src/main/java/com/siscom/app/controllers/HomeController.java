package com.siscom.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siscom.app.adapter.TesteAdapter;
import com.siscom.app.dto.TesteDto;
import com.siscom.app.repository.TestRepository;

@RestController
public class HomeController {

	@Autowired
	private TestRepository testeRepository;
	
	@RequestMapping("/teste")
	public List<TesteDto> teste() {
		return TesteAdapter.adapt(testeRepository.findAll());
	}
}
