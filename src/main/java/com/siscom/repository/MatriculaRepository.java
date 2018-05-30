package com.siscom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

import com.siscom.model.entity.AlunoEntity;
import com.siscom.model.entity.MatriculaEntity;

public interface MatriculaRepository extends CrudRepository<MatriculaEntity, Integer> {

	List<MatriculaEntity> findAll();
	List<MatriculaEntity> findByAluno(AlunoEntity aluno);
	
	@Modifying
	void deleteByAlunoId(int id);
	
	@Modifying
	void deleteByCursoId(int id);

	@Modifying
	void deleteById(int id);
}
