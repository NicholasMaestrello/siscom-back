package com.siscom.auth;

import java.time.LocalDate;

import com.siscom.model.dto.LoginDTO;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTUtil {

	private static String key = "plut4oMaior34";

	public static final String TOKEN_HEADER = "Authentication";

	public static String create(LoginDTO login) {
		return Jwts.builder()
				.setSubject("tokenUser")
				.claim("user", login.getId())
				.claim("dataLogin", LocalDate.now())
				.signWith(SignatureAlgorithm.HS256, key)
				.compact();
	}

	public static Jws<Claims> decode(String token) {
		return Jwts.parser().setSigningKey(key).parseClaimsJws(token);
	}

}
