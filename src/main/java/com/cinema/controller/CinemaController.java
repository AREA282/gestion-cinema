package com.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.model.Usuarios;
import com.cinema.model.TipoUsuarios;
import com.cinema.service.CinemaService;

@RestController
@RequestMapping("api/cinema/")
public class CinemaController {

	@Autowired
	private CinemaService usuarioService;
	
	@PostMapping("crear")
	public String crearUsuario(@RequestBody Usuarios usuario) {
		return usuarioService.crearUsuario(usuario);
	}
	
	//TODO @GetMapping("Loguearse")
	 
	
}
