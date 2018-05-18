package com.siscom.controller;

import java.io.IOException;

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
//				response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
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

	private boolean logado(HttpServletRequest request) {
		try {
			String jsonRequestToken = request.getHeader("token");
			Object user = JWTUtil.decode(jsonRequestToken).getBody().get("user");
			if (user != null)
				return true;
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	private void throwUnauthorized(ServletResponse res) throws IOException {

        HttpServletResponse response = (HttpServletResponse) res;

        response.reset();
        response.setHeader("Content-Type", "application/json;charset=UTF-8");
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED);

    }

}
