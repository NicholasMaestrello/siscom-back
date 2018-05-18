package com.siscom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siscom.model.dto.ModalidadeDTO;
import com.siscom.service.ModalidadeService;

@RestController
public class ModalidadeController {
	
	@Autowired
	ModalidadeService modalidadeService;
	
	@RequestMapping("/api/modalidades")
	public List<ModalidadeDTO> getfirst() {
		return modalidadeService.listarModalidades();
	}

}
