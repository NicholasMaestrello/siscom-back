package com.siscom.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.siscom.auth.JWTUtil;
import com.siscom.model.dto.DefaultResponseDTO;
import com.siscom.model.type.Status;
import com.siscom.service.AutenticationService;

import io.jsonwebtoken.Claims;

@Service
public class AutenticationServiceImpl implements AutenticationService {

	@Override
	public DefaultResponseDTO<Boolean> tokenValido(String stringToken) {
		DefaultResponseDTO<Boolean> resposta = new DefaultResponseDTO<>();
		Claims token = JWTUtil.decode(stringToken).getBody();
		if (token.getExpiration().getTime() >= new Date().getTime() && token.get("user") == null) {
			resposta.setStatus(Status.ERRO);
			resposta.setData(false);
			return resposta;
		}
		resposta.setStatus(Status.OK);
		resposta.setData(true);
		return resposta;
	}

}
