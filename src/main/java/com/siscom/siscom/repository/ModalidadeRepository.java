package com.siscom.siscom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.siscom.siscom.entity.ModalidadeEntity;

public interface ModalidadeRepository extends CrudRepository<ModalidadeEntity, Integer> {

	List<ModalidadeEntity> findAll();
}
