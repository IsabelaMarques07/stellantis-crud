package com.fiap.stellantis.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	
	@GetMapping("/entrar")
	@PreAuthorize("hasRole('usuario')")
	public ResponseEntity getOpen() {
		return ResponseEntity.ok().build();
	}
}