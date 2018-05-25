package com.siscom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscom.auth.JWTUtil;
import com.siscom.model.dto.DefaultResponseDTO;
import com.siscom.model.dto.LoginDTO;
import com.siscom.model.entity.LoginEntity;
import com.siscom.model.type.Status;
import com.siscom.repository.LoginRepository;
import com.siscom.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public DefaultResponseDTO<String> login(LoginDTO login) {
		DefaultResponseDTO<String> resposta = new DefaultResponseDTO<>();
		LoginEntity l = loginRepository.findByIdAndPassword(login.getId(), login.getPassword());
		if(l != null) {
			resposta.setStatus(Status.OK);
			resposta.setData(JWTUtil.create(login));
		}else
			throw new IllegalArgumentException("Usuario ou Senha Invalidos");
		return resposta;
	}

}
