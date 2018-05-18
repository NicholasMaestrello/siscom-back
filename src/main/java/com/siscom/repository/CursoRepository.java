package com.siscom.siscom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.siscom.siscom.model.entity.CursoEntity;

public interface CursoRepository extends CrudRepository<CursoEntity, Integer> {

	List<CursoEntity> findAll();
}
