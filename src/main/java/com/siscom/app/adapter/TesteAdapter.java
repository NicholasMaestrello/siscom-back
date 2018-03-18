package com.siscom.app.adapter;

import java.util.List;
import java.util.stream.Collectors;

import com.siscom.app.dto.TesteDto;
import com.siscom.app.entity.TesteEntity;

public class TesteAdapter {

	public static List<TesteDto> adapt(List<TesteEntity> t){
		return t.stream().map(e -> adapt(e)).collect(Collectors.toList());
	}
	
	public static TesteDto adapt(TesteEntity t) {
		TesteDto d = new TesteDto();
		d.setNome(t.getNome());
		return d;
	}
}
