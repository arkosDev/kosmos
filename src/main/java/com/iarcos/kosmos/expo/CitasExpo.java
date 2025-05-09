package com.iarcos.kosmos.expo;

import org.springframework.security.core.AuthenticationException;

public class CitasExpo extends AuthenticationException  {

	private static final long serialVersionUID = 5072843152404931183L;

	public CitasExpo(String message) {
		super(message);
	}
}
