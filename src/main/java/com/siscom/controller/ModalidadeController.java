package com.siscom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siscom.model.dto.ModalidadeDTO;
import com.siscom.service.ModalidadeService;

@RestController
@RequestMapping("/api/modalidades")
public class ModalidadeController {
	
	@Autowired
	ModalidadeService modalidadeService;
	
	@RequestMapping(method= RequestMethod.GET)
	public List<ModalidadeDTO> listarModalidades() {
		return modalidadeService.listarModalidades();
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public ModalidadeDTO incluirModalidade(@RequestBody ModalidadeDTO modalidade) {
		return modalidadeService.incluirModalidade(modalidade);
	}
	
	@RequestMapping(method= RequestMethod.PUT)
	public ModalidadeDTO alterarModalidade(@RequestBody ModalidadeDTO modalidade) {
		return modalidadeService.alterarModalidade(modalidade);
	}

	@RequestMapping(method= RequestMethod.DELETE, value="/{id}")
	public void excluirModalidade(@PathVariable("id") int id) {
		modalidadeService.excluirModalidade(id);;
	}
}
