package com.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cinema.model.Usuarios;

@Repository
public interface CinemaDao extends JpaRepository<Usuarios, Integer>{

	@Query(value = "select * from usuarios where correo = ?", nativeQuery = true)
	public Usuarios findByCorreo(String correo);
	
}