package com.prueba.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "users")
public class Usuario implements Serializable {
 
    private static final long serialVersionUID = 1L;
     

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    
    @Column(name="id_rol")
    private int idRol;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="activo")
    private String activo;
 
 
    public Usuario() {
        super();
    }
     
    public Usuario(int idUsuario, int idRol, String nombre, String activo) {
        super();
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.nombre = nombre;
        this.activo = activo;
    }

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
 
    
 
}
