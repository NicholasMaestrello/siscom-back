package com.siscom.service;

import java.util.List;

import com.siscom.model.dto.ModalidadeDTO;

public interface ModalidadeService {

	List<ModalidadeDTO> listarModalidades();
	ModalidadeDTO incluirModalidade(ModalidadeDTO modalidade);
	ModalidadeDTO alterarModalidade(ModalidadeDTO modalidade);
	void excluirModalidade(int id);
}
