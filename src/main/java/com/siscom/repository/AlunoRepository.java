package com.siscom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.siscom.model.entity.AlunoEntity;

public interface AlunoRepository extends CrudRepository<AlunoEntity, Integer> {

	List<AlunoEntity> findAll();
	void deleteById(int id);
}
