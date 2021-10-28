package com.cinema.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cinema.model.Usuarios;
import com.cinema.utilitario.*;
import com.cinema.repository.*;

@Service
public class CinemaService {
	
	@Autowired
	private CinemaDao cinemaDao;
	
	public String crearUsuario(@RequestBody Usuarios usuario) {
		if(cinemaDao.findByCorreo(usuario.getCorreo())!= null){
			return "El usuario ya existe";
			
		}else if(ValidarCorreo.validarCorreoUsuario(usuario.getCorreo()) == false){
			return "El correo no es válido, por favor intenta de nuevo";
			
		}else if (ValidarContraseña.comprobarPassword(usuario.getPassword()) == false) {
			return "Contraseña no es válida";
		}
		cinemaDao.save(usuario);
		return "El usuario fue guardado exitosamente";
	}
	
	

}
