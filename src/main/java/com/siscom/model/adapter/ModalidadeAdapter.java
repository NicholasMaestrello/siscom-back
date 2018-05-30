package com.siscom.model.adapter;

import java.util.List;
import java.util.stream.Collectors;

import com.siscom.model.dto.ModalidadeDTO;
import com.siscom.model.entity.ModalidadeEntity;

public class ModalidadeAdapter {
	
	public static ModalidadeDTO adaptToDto(ModalidadeEntity m) {
		if(m == null)
			return null;
		ModalidadeDTO modalidade = new ModalidadeDTO();
		modalidade.setId(m.getId());
		modalidade.setNome(m.getNome());
//		modalidade.setCursos(CursoAdapter.adaptToDTO(m.getCursos()));
		return modalidade;
	}
	
	public static List<ModalidadeDTO> adaptToDTO(List<ModalidadeEntity> m){
		return m.stream().map(u -> adaptToDto(u)).collect(Collectors.toList());
	}
	
	public static ModalidadeEntity adaptToEntity(ModalidadeDTO m) {
		if(m == null)
			return null;
		ModalidadeEntity modalidade = new ModalidadeEntity();
		modalidade.setId(m.getId());
		modalidade.setNome(m.getNome());
		return modalidade;
	}
	
	public static List<ModalidadeEntity> adaptToEntity(List<ModalidadeDTO> m){
		return m.stream().map(u -> adaptToEntity(u)).collect(Collectors.toList());
	}

}
