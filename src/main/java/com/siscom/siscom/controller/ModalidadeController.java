package com.siscom.siscom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siscom.siscom.entity.ModalidadeEntity;
import com.siscom.siscom.repository.ModalidadeRepository;

@RestController
public class ModalidadeController {
	
	@Autowired
	ModalidadeRepository m;
	
	@RequestMapping("/api/modalidades")
	public List<ModalidadeEntity> getfirst() {
		return m.findAll();
	}

}
