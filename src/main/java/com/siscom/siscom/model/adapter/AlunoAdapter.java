package com.siscom.siscom.model.adapter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.stream.Collectors;

import com.siscom.siscom.model.dto.AlunoDTO;
import com.siscom.siscom.model.dto.CursoDTO;
import com.siscom.siscom.model.entity.AlunoEntity;
import com.siscom.siscom.model.entity.MatriculaEntity;

public class AlunoAdapter {
	private static final Locale local = new Locale("pt", "BR");
	private static final DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", local);
	private static final Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));	

	public static AlunoDTO adaptToDTO(AlunoEntity a) {
		if(a == null)
			return new AlunoDTO();
		AlunoDTO alu = new AlunoDTO();
		alu.setId(a.getId());
		alu.setBairro(a.getBairro());
		alu.setCel(a.getCel());
		alu.setCpf(a.getCpf());
		/*if(a.getDataEnt() != null)
			try {
				alu.setDataEnt(formatter.parse(a.getDataEnt()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(a.getDataVenc() != null)
			try {
				alu.setDataVenc(formatter.parse(a.getDataVenc()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		alu.setDataEnt(a.getDataEnt());
		alu.setDataVenc(a.getDataVenc());
		alu.setEndereco(a.getEndereco());
		alu.setNome(a.getNome());
		alu.setPaga(a.getPaga());
		alu.setTel(a.getTel());
		
		if(a.getMatriculas() != null)
			alu.setCursos(transformMatriculaCurso(a.getMatriculas()));
		return alu;
	}
	
	public static List<AlunoDTO> adaptToDTO(List<AlunoEntity> a) {
		return a.stream().map(p -> adaptToDTO(p)).collect(Collectors.toList());
	}
	
	public static AlunoEntity adaptToEntity(AlunoDTO a) {
		if(a == null)
			return new AlunoEntity();
		AlunoEntity alu = new AlunoEntity();
		alu.setId(a.getId());
		alu.setBairro(a.getBairro());
		alu.setCel(a.getCel());
		alu.setCpf(a.getCpf());
		/*if(a.getDataEnt() != null) {
			cal.setTime(a.getDataEnt());
			cal.set(Calendar.HOUR_OF_DAY, 0);
	        cal.set(Calendar.MINUTE, 0);
	        cal.set(Calendar.SECOND, 0);
	        cal.set(Calendar.MILLISECOND, 0);
	        cal.add(Calendar.DATE, 1);
	        
			alu.setDataEnt(formatter.format(cal.getTime()));
			}
		if(a.getDataVenc() != null) {
			cal.setTime(a.getDataVenc());
			cal.set(Calendar.HOUR_OF_DAY, 0);
	        cal.set(Calendar.MINUTE, 0);
	        cal.set(Calendar.SECOND, 0);
	        cal.set(Calendar.MILLISECOND, 0);
	        cal.add(Calendar.DATE, 1);
			alu.setDataVenc(formatter.format(new Date(a.getDataVenc().getTime())));
		}*/
		alu.setDataEnt(a.getDataEnt());
		alu.setDataVenc(a.getDataVenc());
		alu.setEndereco(a.getEndereco());
		alu.setNome(a.getNome());
		alu.setPaga(a.getPaga());
		alu.setTel(a.getTel());
		return alu;
	}
	
	public static List<AlunoEntity> adaptToEntity(List<AlunoDTO> a) {
		return a.stream().map(p -> adaptToEntity(p)).collect(Collectors.toList());
	}
	
	private static List<CursoDTO > transformMatriculaCurso(List<MatriculaEntity> matriculas){
		List<CursoDTO> cursos = new ArrayList<>();
		for (MatriculaEntity matricula : matriculas) {
			cursos.add(CursoAdapter.adaptToDTO(matricula.getCurso()));
		}
		return cursos;
	}
}
