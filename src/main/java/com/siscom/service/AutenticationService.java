package com.siscom.service;

import com.siscom.model.dto.DefaultResponseDTO;

public interface AutenticationService {

	DefaultResponseDTO<Boolean> tokenValido(String stringToken);
}
