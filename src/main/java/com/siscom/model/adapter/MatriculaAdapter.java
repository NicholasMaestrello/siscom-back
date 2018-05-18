package com.siscom.model.adapter;

import java.util.List;
import java.util.stream.Collectors;

import com.siscom.model.dto.MatriculaDTO;
import com.siscom.model.entity.MatriculaEntity;

public class MatriculaAdapter {

	public static MatriculaDTO adaptToDTO(MatriculaEntity m) {
		if(m == null)
			return null;
		MatriculaDTO mn = new MatriculaDTO();
		mn.setAluno(AlunoAdapter.adaptToDTO(m.getAluno()));
		mn.setCurso(CursoAdapter.adaptToDTO(m.getCurso()));
		mn.setId(m.getId());
		return mn;
	}

	public static List<MatriculaDTO> adaptToDTO(List<MatriculaEntity> m) {
		return m.stream().map(u -> adaptToDTO(u)).collect(Collectors.toList());
	}
	
	public static MatriculaEntity adaptToEntity(MatriculaDTO m) {
		if(m == null)
			return null;
		MatriculaEntity mn = new MatriculaEntity();
		mn.setAluno(AlunoAdapter.adaptToEntity(m.getAluno()));
		mn.setCurso(CursoAdapter.adaptToEntity(m.getCurso()));
		mn.setId(m.getId());
		return mn;
	}

	public static List<MatriculaEntity> adaptToEntity(List<MatriculaDTO> m) {
		return m.stream().map(u -> adaptToEntity(u)).collect(Collectors.toList());
	}
}
