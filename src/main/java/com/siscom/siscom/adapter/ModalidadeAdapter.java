package com.siscom.siscom.adapter;

import com.siscom.siscom.dto.ModalidadeDTO;
import com.siscom.siscom.entity.ModalidadeEntity;

public class ModalidadeAdapter {
	
	public static ModalidadeDTO adaptToDto(ModalidadeEntity m) {
		ModalidadeDTO modalidade = new ModalidadeDTO();
		modalidade.setId(m.getId());
		modalidade.setNome(m.getNome());
		return modalidade;
	}

}
