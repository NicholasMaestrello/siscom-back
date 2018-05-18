package com.siscom.service;

import com.siscom.model.dto.DefaultResponseDTO;
import com.siscom.model.dto.LoginDTO;

public interface LoginService {

	DefaultResponseDTO<String> login(LoginDTO login);
}
