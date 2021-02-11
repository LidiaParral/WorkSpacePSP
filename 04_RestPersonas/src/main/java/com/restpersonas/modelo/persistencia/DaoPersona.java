package com.restpersonas.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.restpersonas.modelo.entidad.Persona;

//El concepto de DAO representa una clase que sirve de conexion de nuestra
//app con el modelo de datos (bbdd, ficheros, si tenemos los objetos levantados
//en memoria

@Component
public class DaoPersona {
	private List<Persona> listaPersonas;
	
	public DaoPersona() {
		Persona p1 = new Persona();
		p1.setId(1);
		p1.setNombre("Harry Potter");
		p1.setEdad(18);
		
		Persona p2 = new Persona();
		p2.setId(2);
		p2.setEdad(19);
		p2.setNombre("Ernion Güesley");
		
		listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		
	}
	
	//Tendriamos que hacer los metodos de get, post, put, delete
	public List<Persona> listado(){
		return listaPersonas;
	}
}
