package com.ejercicioVideojuego.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicioVideojuego.modelo.entidad.Videojuego;



@RestController
public class ServicioMensajes {

	
	
	@Autowired
	private Videojuego v1;
	

	
	@GetMapping("videojuego")
	public Videojuego obtenerVideojuego() {
		v1.setId(1);
		v1.setNombre("Sony");
		v1.setCompania("Sega");
		v1.setPrecio(12.20);
		
		
		return v1;
	}
	
	
}

