package com.siscom.model.adapter;

import java.util.List;
import java.util.stream.Collectors;

import com.siscom.model.dto.CursoDTO;
import com.siscom.model.entity.CursoEntity;

public class CursoAdapter {

	public static CursoDTO adaptToDTO(CursoEntity c) {
		if (c == null)
			return null;
		CursoDTO cn = new CursoDTO();
		cn.setId(c.getId());
		cn.setModalidade(ModalidadeAdapter.adaptToDto(c.getModalidade()));
		cn.setNivel(c.getNivel());
		cn.setResponsavel(c.getResponsavel());
		cn.setQuantidadeAlunos(c.getAlunos() != null ? c.getAlunos().size() : 0);
		return cn;
	}
	
	public static List<CursoDTO> adaptToDTO(List<CursoEntity> c){
		return c.stream().map(n -> adaptToDTO(n)).collect(Collectors.toList());
	}
	
	public static CursoEntity adaptToEntity(CursoDTO c) {
		if (c == null)
			return null;
		CursoEntity cn = new CursoEntity();
		cn.setId(c.getId());
		cn.setModalidade(ModalidadeAdapter.adaptToEntity(c.getModalidade()));
		cn.setNivel(c.getNivel());
		cn.setQuantidadeAlunos(c.getQuantidadeAlunos());
		cn.setResponsavel(c.getResponsavel());
		return cn;
	}
	
	public static List<CursoEntity> adaptToEntity(List<CursoDTO> c){
		return c.stream().map(n -> adaptToEntity(n)).collect(Collectors.toList());
	}
	
}
