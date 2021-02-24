package com.ejercicioVideojuego.modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Videojuego {
	
	
	private int id;
	private String nombre;
	private String compania;
	private double precio;
	
	//**OTRA FORMA**
	//Si se incluyen los valores en el CONSTRUCTOR, se ejecuta OK = 200 el método PUT y se modifica el precio
	/*public Videojuego() {
		id= 1;
		nombre = "Fortnite";
		compania = "Epic Games";
		precio = 22.70;
		
	}*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Videojuego - id:" + id + ", nombre:" + nombre + ", compañía:" + compania + ", precio:" + precio + " euros.";
	}
	
	
	
	

}
