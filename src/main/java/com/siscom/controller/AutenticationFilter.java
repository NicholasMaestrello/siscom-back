package com.siscom.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.siscom.auth.JWTUtil;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;

@Component
public class AutenticationFilter implements Filter {
	public static final String X_CLACKS_OVERHEAD = "X-Clacks-Overhead";

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;

		String requestURI = request.getRequestURI();

		if (requestURI.startsWith("/api/")) {
			if (!logado(request)) {
				throwUnauthorized(response);
				return;
			} else
				chain.doFilter(req, res);
		} else {
			chain.doFilter(req, res);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	// TODO mudar para filtrar de verdad quem sabe usando bean
	private boolean logado(HttpServletRequest request) {
//		try {
//			String stringToken = request.getHeader("access-control-request-headers");
//			System.out.println(stringToken);
//			Claims token = JWTUtil.decode(stringToken).getBody();
//			Object user = token.get("user");
//			if (user != null)
//				return true;
//			return false;
//		} catch (Exception e) {
//			return false;
//		}
		return true;
	}

	private void throwUnauthorized(ServletResponse res) throws IOException {

		HttpServletResponse response = (HttpServletResponse) res;

		response.reset();
		response.setHeader("Content-Type", "application/json;charset=UTF-8");
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED);

	}

}
