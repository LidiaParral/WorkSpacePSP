package com.ejercicioVideojuego.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicioVideojuego.modelo.entidad.Videojuego;


@RestController
public class ServicioMensaje {
	
	@Autowired
	private Videojuego v1;
	
	@GetMapping("videojuego")
	public Videojuego obtenerVideojuego() {
		
		v1.setNombre("Fortnite");
		v1.setCompania("Epic Games");
		v1.setPrecio(22.70);
		
		return v1;
	}
	
	
	//*Método MODIFICAR
	@PutMapping("videojuego")
	public Videojuego modificar() {
		v1.setPrecio(v1.getPrecio() + 10);
		return v1;
	}

}
