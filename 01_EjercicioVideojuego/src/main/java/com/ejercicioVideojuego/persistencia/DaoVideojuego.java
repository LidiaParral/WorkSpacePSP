package com.ejercicioVideojuego.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ejercicioVideojuego.modelo.entidad.Videojuego;

@Component
public class DaoVideojuego {
	
	private List<Videojuego> listaVideojuegos;

	private int contador = 1;

	public DaoVideojuego() {
		//Añadir los objetos VIDEOJUEGOS a la LIST de LISTAVIDEOJUEGOS
		Videojuego v1 = new Videojuego();
		v1.setId(contador++);
		v1.setNombre("Sony");
		v1.setCompania("Sega");
		v1.setPrecio(15.50);
		
		Videojuego v2 = new Videojuego();
		v2.setId(contador++);
		v2.setNombre("Fortnite");
		v2.setCompania("Epic Games");
		v2.setPrecio(49.50);
		

		listaVideojuegos = new ArrayList<Videojuego>();
		listaVideojuegos.add(v1);
		listaVideojuegos.add(v2);
	} 
	


	// Tendriamos que hacer los metodos de get, post, put, delete
	public List<Videojuego> listado() {
		return listaVideojuegos;
	}
	
	
	// JAVADOC
	/**
	 * Método para buscar el VIDEOJUEGO con ID en concreto, pasado por parámetro
	 * 
	 * @param id, representa el ID a buscar
	 * @return Videojuego con el ID a buscar o NULL en caso de que el videojuego no exista
	 */
	public Videojuego buscar(int id) {
		Videojuego v = null;
		for (Videojuego videojuego : listaVideojuegos) {
			if(videojuego.getId() == id) {
				v = videojuego;
				break;
				//*BREAK¿?
			}
		}
	
		return v;
	}
	
	
	/**
	 * Método que modifica una persona a partir de un ID
	 * 
	 * @param pModif, persona que se quiere modificar, dentro del atributo ID
	 *                contendrá el ID que se quiere modificar
	 * @return Persona modificada o NULL en caso de que no encontraramos la persona
	 */
	public Videojuego modificar(Videojuego vModif) {
		// Búsqueda del videojuego
		Videojuego v = buscar(vModif.getId());

		// Si el VIDEOJUEGO exise, se modifican los valores de dicho videojuego
		if (v != null) {
			v.setPrecio(vModif.getPrecio());
		}
		return v;
	}
	
}


