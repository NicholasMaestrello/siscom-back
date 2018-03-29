package com.siscom.siscom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.siscom.siscom.entity.MatriculaEntity;

public interface MatriculaRepository extends CrudRepository<MatriculaEntity, Integer> {

	List<MatriculaEntity> findAll();
}
