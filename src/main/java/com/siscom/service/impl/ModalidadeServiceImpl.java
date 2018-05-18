package com.siscom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscom.model.adapter.ModalidadeAdapter;
import com.siscom.model.dto.ModalidadeDTO;
import com.siscom.repository.ModalidadeRepository;
import com.siscom.service.ModalidadeService;

@Service
public class ModalidadeServiceImpl implements ModalidadeService{
	
	@Autowired
	ModalidadeRepository modalidadeRepo;

	@Override
	public List<ModalidadeDTO> listarModalidades() {
		return ModalidadeAdapter.adaptToDTO(modalidadeRepo.findAll());
	}

}
