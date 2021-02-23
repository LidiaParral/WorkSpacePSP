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
		return v1;
	}
	
	
	//Método MODIFICAR
	@PutMapping("videojuego")
	public Videojuego modificar() {
		System.out.println("Modificar precio:");
		v1.setPrecio(v1.getPrecio() + 10);
		System.out.println("Modificación exitosa");
		return v1;
	}
	
	
	//@Autowired para injectarlo en el controlador
}
