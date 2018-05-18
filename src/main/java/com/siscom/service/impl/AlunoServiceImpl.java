package com.siscom.siscom.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscom.siscom.model.adapter.AlunoAdapter;
import com.siscom.siscom.model.dto.AlunoDTO;
import com.siscom.siscom.model.dto.CursoDTO;
import com.siscom.siscom.model.dto.MatriculaDTO;
import com.siscom.siscom.model.entity.AlunoEntity;
import com.siscom.siscom.repository.AlunoRepository;
import com.siscom.siscom.service.AlunoService;
import com.siscom.siscom.service.MatriculaService;

@Service
public class AlunoServiceImpl implements AlunoService {

	@Autowired
	AlunoRepository alunoRepository;

	@Autowired
	MatriculaService matriculaService;

	@Override
	public List<AlunoDTO> listarAlunos() {
		return AlunoAdapter.adaptToDTO(alunoRepository.findAll());
	}

	@Override
	public String inserirAluno(AlunoDTO aluno) {
		if (aluno == null)
			return "Erro";
		fixDateAluno(aluno);
		AlunoEntity a = alunoRepository.save(AlunoAdapter.adaptToEntity(aluno));
		if (aluno.getCursos() != null)
			saveMatriuculas(AlunoAdapter.adaptToDTO(a), aluno.getCursos());
		return "Sucesso";
	}

	@Override
	@Transactional
	public String alterarAluno(AlunoDTO aluno) {

		if (aluno == null)
			return "Erro";
		fixDateAluno(aluno);
		matriculaService.deletarPorAluno(aluno.getId());
		AlunoEntity a = alunoRepository.save(AlunoAdapter.adaptToEntity(aluno));
		if (aluno.getCursos() != null)
			saveMatriuculas(AlunoAdapter.adaptToDTO(a), aluno.getCursos());
		return "Sucesso";
	}
	
	@Override
	public String deletarAluno(int id) {
		if(id <= 0)
			return "Erro";
		matriculaService.deletarPorAluno(id);
		alunoRepository.delete(id);
		return "sucesso";
	}

	private void saveMatriuculas(AlunoDTO aluno, List<CursoDTO> cursos) {
		List<MatriculaDTO> matriculas = new ArrayList<>();
		for (CursoDTO c : cursos) {
			MatriculaDTO m = new MatriculaDTO();
			m.setAluno(aluno);
			m.setCurso(c);
			matriculas.add(m);
		}
		matriculaService.inserirMatriculas(matriculas);
	}

	private void fixDateAluno(AlunoDTO aluno) {
		Calendar cal = Calendar.getInstance();
		if (aluno.getDataEnt() != null) {
			cal.setTime(aluno.getDataEnt());
			cal.add(Calendar.HOUR_OF_DAY, 3);
			aluno.setDataEnt(cal.getTime());
		}
		if (aluno.getDataVenc() != null) {
			cal.setTime(aluno.getDataVenc());
			cal.add(Calendar.HOUR_OF_DAY, 3);
			aluno.setDataVenc(cal.getTime());
		}
	}
}
