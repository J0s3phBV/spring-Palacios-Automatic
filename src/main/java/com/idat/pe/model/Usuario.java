package com.idat.pe.model;

public class Usuario {
	private Integer id;
	private String nombre;
	private String userna;
	private String email;
	private String direc;
	private String telef;
	private String tipo;
	private String passw;	
	
	public Usuario() {
	}
	public Usuario(Integer id, String nombre, String userna, String email, String direc, String telef, String tipo,
			String passw) {
		this.id = id;
		this.nombre = nombre;
		this.userna = userna;
		this.email = email;
		this.direc = direc;
		this.telef = telef;
		this.tipo = tipo;
		this.passw = passw;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUserna() {
		return userna;
	}
	public void setUserna(String userna) {
		this.userna = userna;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDirec() {
		return direc;
	}
	public void setDirec(String direc) {
		this.direc = direc;
	}
	public String getTelef() {
		return telef;
	}
	public void setTelef(String telef) {
		this.telef = telef;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPassw() {
		return passw;
	}
	public void setPassw(String passw) {
		this.passw = passw;
	}
	
	

	
}
