package com.ejercicioVideojuego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ejercicioVideojuego.modelo.entidad.Videojuego;

@SpringBootApplication
public class EjercicioVideojuego {

	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = SpringApplication.run(EjercicioVideojuego.class, args);
		
		//Crear el objeto VIDEOJUEGO
		Videojuego v1 = context.getBean("videojuego",Videojuego.class);
		//Introducir los valores del objeto VIDEOJUEGO
		v1.setId(1);
		v1.setNombre("Mario Bros");
		v1.setCompania("Nintendo");
		v1.setPrecio(49.99);
		System.out.println(v1);
		
		
		
		
	}

}
