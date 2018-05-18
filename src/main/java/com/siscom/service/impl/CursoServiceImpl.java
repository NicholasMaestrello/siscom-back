package com.siscom.siscom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscom.siscom.model.adapter.CursoAdapter;
import com.siscom.siscom.model.dto.CursoDTO;
import com.siscom.siscom.repository.CursoRepository;
import com.siscom.siscom.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService {
	@Autowired
	CursoRepository cursoRepo;

	@Override
	public List<CursoDTO> listarCursos() {
		return CursoAdapter.adaptToDTO(cursoRepo.findAll());
	}

}
