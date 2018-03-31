package com.siscom.siscom.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.siscom.siscom.model.entity.AlunoEntity;
import com.siscom.siscom.model.entity.MatriculaEntity;

public interface MatriculaRepository extends CrudRepository<MatriculaEntity, Integer> {

	List<MatriculaEntity> findAll();
	
	@Modifying
    @Transactional
	void deleteByAluno(@Param("aluno") AlunoEntity aluno);
}
