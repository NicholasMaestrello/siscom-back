package com.siscom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siscom.auth.JWTUtil;
import com.siscom.model.dto.LoginDTO;
import com.siscom.model.entity.LoginEntity;
import com.siscom.repository.LoginRepository;
import com.siscom.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public String login(LoginDTO login) {
		LoginEntity l = loginRepository.findByIdAndPassword(login.getId(), login.getPassword());
		if(l != null)
			return JWTUtil.create(login);
		return null;
	}

}
