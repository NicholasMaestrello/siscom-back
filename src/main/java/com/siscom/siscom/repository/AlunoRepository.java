package com.siscom.siscom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.siscom.siscom.entity.AlunoEntity;

public interface AlunoRepository extends CrudRepository<AlunoEntity, Integer> {

	List<AlunoEntity> findAll();
}
