package com.restpersonas.modelo.persistencia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.restpersonas.modelo.entidad.Persona;

//El concepto de DAO representa una clase que sirve de conexion de nuestra
//app con el modelo de datos (bbdd, ficheros, si tenemos los objetos levantados
//en memoria

@Component
public class DaoPersona {
	private List<Persona> listaPersonas;

	private int contador = 1;

	public DaoPersona() {
		Persona p1 = new Persona();
		p1.setId(contador++);
		p1.setNombre("Harry Potter");
		p1.setEdad(18);

		Persona p2 = new Persona();
		p2.setId(contador++);
		p2.setEdad(19);
		p2.setNombre("Ernion Güesley");

		listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(p1);
		listaPersonas.add(p2);

	}

	// Tendriamos que hacer los metodos de get, post, put, delete
	public List<Persona> listado() {
		return listaPersonas;
	}

	// JAVADOC
	/**
	 * Método para buscar la persona con ID en concreto, pasado por parámetro
	 * 
	 * @param id, representa el ID a buscar
	 * @return Persona con el ID a buscar o NULL en caso de que la persona no exista
	 */
	public Persona buscar(int id) {
		Persona persona = null;
		for (Persona p : listaPersonas) {
			// Si la persona con el método GET es igual a ID pasado como parámetro
			if (p.getId() == id) {
				// Entonces se ha encontrado a la persona buscada con ese ID
				persona = p;
				break;
			}

		}
		return persona;
	}

	public Persona alta(Persona p) {
		p.setId(contador++);
		listaPersonas.add(p);
		return p;

	}

	/**
	 * Método que modifica una persona a partir de un ID
	 * 
	 * @param pModif, persona que se quiere modificar, dentro del atributo ID
	 *                contendrá el ID que se quiere modificar
	 * @return Persona modificada o NULL en caso de que no encontraramos la persona
	 */
	public Persona modificar(Persona pModif) {
		// Búsqueda de la persona
		Persona p = buscar(pModif.getId());

		// Si la persona exise, se modifican los valores de dicha persona
		if (p != null) {
			p.setEdad(pModif.getEdad());
			p.setNombre(pModif.getNombre());
		}
		return p;
	}
	
	/**
	 * Método que borra una persona a partir de un ID
	 * @param id, representa el ID a buscar
	 * @return Persona borrada o NULL, en caso de que no encontraramos la persona
	 */
	public Persona borrar(int id) {
		Persona p = buscar(id);

		if (p != null) {
			listaPersonas.remove(id);

		}
		return p;

	}
}
