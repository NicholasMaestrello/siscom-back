package com.siscom.siscom.model.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.siscom.siscom.model.dto.AlunoDTO;
import com.siscom.siscom.model.dto.CursoDTO;
import com.siscom.siscom.model.entity.AlunoEntity;
import com.siscom.siscom.model.entity.MatriculaEntity;

public class AlunoAdapter {

	public static AlunoDTO adaptToDTO(AlunoEntity a) {
		if(a == null)
			return new AlunoDTO();
		AlunoDTO alu = new AlunoDTO();
		alu.setId(a.getId());
		alu.setBairro(a.getBairro());
		alu.setCel(a.getCel());
		alu.setCpf(a.getCpf());
		alu.setDataEnt(a.getDataEnt());
		alu.setDataVenc(a.getDataVenc());
		alu.setEndereco(a.getEndereco());
		alu.setNome(a.getNome());
		alu.setPaga(a.getPaga());
		alu.setTel(a.getTel());
		
		if(a.getMatriculas() != null)
			alu.setCursos(transformMatriculaCurso(a.getMatriculas()));
		return alu;
	}
	
	public static List<AlunoDTO> adaptToDTO(List<AlunoEntity> a) {
		return a.stream().map(p -> adaptToDTO(p)).collect(Collectors.toList());
	}
	
	public static AlunoEntity adaptToEntity(AlunoDTO a) {
		if(a == null)
			return new AlunoEntity();
		AlunoEntity alu = new AlunoEntity();
		alu.setId(a.getId());
		alu.setBairro(a.getBairro());
		alu.setCel(a.getCel());
		alu.setCpf(a.getCpf());
		alu.setDataEnt(a.getDataEnt());
		alu.setDataVenc(a.getDataVenc());
		alu.setEndereco(a.getEndereco());
		alu.setNome(a.getNome());
		alu.setPaga(a.getPaga());
		alu.setTel(a.getTel());
		return alu;
	}
	
	public static List<AlunoEntity> adaptToEntity(List<AlunoDTO> a) {
		return a.stream().map(p -> adaptToEntity(p)).collect(Collectors.toList());
	}
	
	private static List<CursoDTO > transformMatriculaCurso(List<MatriculaEntity> matriculas){
		List<CursoDTO> cursos = new ArrayList<>();
		for (MatriculaEntity matricula : matriculas) {
			cursos.add(CursoAdapter.adaptToDTO(matricula.getCurso()));
		}
		return cursos;
	}
}
