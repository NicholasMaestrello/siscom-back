package com.siscom.siscom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscom.siscom.model.adapter.ModalidadeAdapter;
import com.siscom.siscom.model.dto.ModalidadeDTO;
import com.siscom.siscom.repository.ModalidadeRepository;
import com.siscom.siscom.service.ModalidadeService;

@Service
public class ModalidadeServiceImpl implements ModalidadeService{
	
	@Autowired
	ModalidadeRepository modalidadeRepo;

	@Override
	public List<ModalidadeDTO> listarModalidades() {
		return ModalidadeAdapter.adaptToDTO(modalidadeRepo.findAll());
	}

}
