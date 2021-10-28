package com.cinema.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuarios") //CREACION DE LA TABLA
public class Usuarios implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id") 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="correo")
	private String correo;
	@Column(name="password")
	private String password;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="documento")
	private int documento;
	@Column(name="tipo_documento")
	private String tipo_documento;
	@Column(name="tipoUsuario")
	private TipoUsuarios tipoUsuario;//TODO - CONSULTAR oauth2
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getTipo_documento() {
		return tipo_documento;
	}
	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

}
