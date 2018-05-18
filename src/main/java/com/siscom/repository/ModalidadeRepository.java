package com.siscom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.siscom.model.entity.ModalidadeEntity;

public interface ModalidadeRepository extends CrudRepository<ModalidadeEntity, Integer> {

	List<ModalidadeEntity> findAll();
}
