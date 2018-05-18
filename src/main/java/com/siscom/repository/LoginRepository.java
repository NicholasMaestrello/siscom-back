package com.siscom.repository;

import org.springframework.data.repository.CrudRepository;

import com.siscom.model.entity.LoginEntity;

public interface LoginRepository extends CrudRepository<LoginEntity, String> {

	LoginEntity findByIdAndPassword(String id, String password);
}
