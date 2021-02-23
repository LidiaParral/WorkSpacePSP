package com.restpersonas.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restpersonas.modelo.entidad.Persona;
import com.restpersonas.modelo.persistencia.DaoPersona;

//El objetivo de esta app es hacer un CRUD sencillo contra la entidad persona
//Un CRUD hablamos de las 4 operaciones básicas que podemos hacer contra
//una entidad
//C -> Create
//R -> Read
//U -> Update
//D -> Delete

@RestController
public class ControladorPersona {

	@Autowired
	private DaoPersona daoPersona;

	@GetMapping("personas")
	public ResponseEntity<List<Persona>> listar() {
		List<Persona> lista = daoPersona.listado();

		// Con un objeto de tipo RESPONSEENTITY se puede devolver datos y además códigos
		// de respuestas
		ResponseEntity<List<Persona>> re = new ResponseEntity<List<Persona>>(lista, HttpStatus.OK);

		// *Si no existe la respuesta sería NOT_FOUND
		// ResponseEntity<List<Persona>> re =
		// new ResponseEntity<List<Persona>>(lista, HttpStatus.NOT_FOUND);
		return re;
	}

	// Cuando hay un parámetro variable se debe poner entre corchetes{}, y se
	// recoger con la anotación @PathVariable dentro
	// de los argumentos de entrada del método
	@GetMapping("personas/{id}")
	public ResponseEntity<Persona> obtener(@PathVariable("id") int id_persona) {
		System.out.println("El id a buscar es:" + id_persona);

		Persona p1 = daoPersona.buscar(id_persona);

		HttpStatus hs = null;

		// Si la persona existe
		if (p1 != null) {
			hs = HttpStatus.OK;
		} else {
			hs = HttpStatus.NOT_FOUND;
		}

		// Respuesta
		ResponseEntity<Persona> re = new ResponseEntity<Persona>(p1, hs);

		return re;
	}

	// Con la anotación @RequesBody Spring va a intentar coger información que
	// le ponga el cliente en el BODY del HTTp y convertirlo a un objeto de tipo
	// PERSONAJE
	// Para dar de alta un OBJETO se usa POST
	@PostMapping("personas")
	public ResponseEntity<Persona> alta(@RequestBody Persona p) {
		Persona pAlta = daoPersona.alta(p);

		ResponseEntity<Persona> re = new ResponseEntity<Persona>(pAlta, HttpStatus.CREATED);

		return re;

	}

	// Para modificar un OBJETO se usa PUT
	@PutMapping("personas/{id}")
	public ResponseEntity<Persona> modifica(@RequestBody Persona p, @PathVariable("id") int id_persona) {
		// Va a venir el ID dado por el parámetro de la URL y el resto de la información
		// a cambiar por el BODY
		p.setId(id_persona);

		Persona pModificar = daoPersona.modificar(p);

		HttpStatus hs = null;

		// Si la persona existe
		if (pModificar != null) {
			hs = HttpStatus.OK;
		} else {
			hs = HttpStatus.NOT_FOUND;
		}

		ResponseEntity<Persona> re = new ResponseEntity<Persona>(pModificar, hs);

		return re;

	}

	// Para eliminar un OBJETO se usa DELETE
	@DeleteMapping("personas/{id}")
	public ResponseEntity<Persona> borrar(@PathVariable("id") int id_persona) {
		//
		Persona pBorrar = daoPersona.borrar(id_persona);

		HttpStatus hs = null;

		// Si la persona existe
		if (pBorrar != null) {
			hs = HttpStatus.OK;
		} else {
			hs = HttpStatus.NOT_FOUND;
		}

		ResponseEntity<Persona> re = new ResponseEntity<Persona>(pBorrar, hs);

		return re;

	}
}
