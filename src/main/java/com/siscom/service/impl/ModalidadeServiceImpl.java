package com.siscom.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscom.exception.type.InvalidArgumentException;
import com.siscom.model.adapter.ModalidadeAdapter;
import com.siscom.model.dto.ModalidadeDTO;
import com.siscom.model.entity.CursoEntity;
import com.siscom.model.entity.ModalidadeEntity;
import com.siscom.repository.ModalidadeRepository;
import com.siscom.service.CursoService;
import com.siscom.service.ModalidadeService;

@Service
public class ModalidadeServiceImpl implements ModalidadeService{
	
	@Autowired
	ModalidadeRepository modalidadeRepo;
	
	@Autowired
	CursoService cursoService;

	@Override
	public List<ModalidadeDTO> listarModalidades() {
		return ModalidadeAdapter.adaptToDTO(modalidadeRepo.findAll());
	}

	@Override
	public ModalidadeDTO incluirModalidade(ModalidadeDTO modalidade) {
		if(modalidade == null)
			throw new InvalidArgumentException("Modalidade informado para alteração com erros");
		ModalidadeEntity mEntity = ModalidadeAdapter.adaptToEntity(modalidade);
		mEntity = modalidadeRepo.save(mEntity);
		modalidade = ModalidadeAdapter.adaptToDto(mEntity);
		return modalidade;
	}

	@Override
	public ModalidadeDTO alterarModalidade(ModalidadeDTO modalidade) {
		if(modalidade == null || modalidade.getId() == 0)
			throw new InvalidArgumentException("Modalidade informado para alteração com erros");
		ModalidadeEntity mEntity = ModalidadeAdapter.adaptToEntity(modalidade);
		mEntity = modalidadeRepo.save(mEntity);
		modalidade = ModalidadeAdapter.adaptToDto(mEntity);
		return modalidade;
	}

	@Override
	@Transactional
	public void excluirModalidade(int id) {
		if(id == 0)
			throw new InvalidArgumentException("Informe um id valido");
		ModalidadeEntity m = modalidadeRepo.findOne(id);
		excluirCursos(m);
		modalidadeRepo.deleteById(m.getId());
	}
	
	private void excluirCursos(ModalidadeEntity m) {
		for (CursoEntity c: m.getCursos()) {
			cursoService.excluirCurso(c.getId());
		}
	}

}
