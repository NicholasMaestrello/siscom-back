package com.siscom.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.siscom.app.entity.TesteEntity;

public interface TestRepository extends CrudRepository<TesteEntity, String> {

	List<TesteEntity> findAll();
}
