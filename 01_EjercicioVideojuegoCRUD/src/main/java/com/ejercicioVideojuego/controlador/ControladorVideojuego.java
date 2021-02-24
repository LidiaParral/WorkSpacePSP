package com.ejercicioVideojuego.controlador;

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

import com.ejercicioVideojuego.modelo.entidad.Videojuego;
import com.ejercicioVideojuego.persistencia.DaoVideojuego;

@RestController
public class ControladorVideojuego {
	
	@Autowired
	private DaoVideojuego daoVideojuego;
	

	@GetMapping("videojuegos")
	public ResponseEntity<List<Videojuego>> listar() {
		List<Videojuego> lista = daoVideojuego.listado();

		// Con un objeto de tipo RESPONSEENTITY se puede devolver datos y además códigos
		// de respuestas
		ResponseEntity<List<Videojuego>> re = new ResponseEntity<List<Videojuego>>(lista, HttpStatus.OK);

		return re;
	}

	// Cuando hay un parámetro variable se debe poner entre corchetes{}, y se
	// recoger con la anotación @PathVariable dentro
	// de los argumentos de entrada del método
	@GetMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> obtener(@PathVariable("id") int id_videojuego) {
		System.out.println("El id a buscar es:" + id_videojuego);
		
		Videojuego v1 = daoVideojuego.buscar(id_videojuego);

		HttpStatus hs = null;

		// Si la persona existe
		if (v1 != null) {
			hs = HttpStatus.OK;
		} else {
			hs = HttpStatus.NOT_FOUND;
		}

		// Respuesta
		ResponseEntity<Videojuego> re = new ResponseEntity<Videojuego>(v1, hs);

		return re;
	}
	
	
	// Para dar de alta un OBJETO se usa POST
	@PostMapping("videojuegos")
	public ResponseEntity<Videojuego> alta(@RequestBody Videojuego v) {
		Videojuego vAlta = daoVideojuego.alta(v);

		ResponseEntity<Videojuego> re = new ResponseEntity<Videojuego>(vAlta, HttpStatus.CREATED);

		return re;

	}
	
	// Para modificar un OBJETO se usa PUT
	@PutMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> modifica(@RequestBody Videojuego v, @PathVariable("id") int id_videojuego) {
		// Va a venir el ID dado por el parámetro de la URL y el resto de la información
		// a cambiar por el BODY
		v.setId(id_videojuego);

		Videojuego vModif = daoVideojuego.modificar(v);

		HttpStatus hs = null;

		if (vModif != null) {
			hs = HttpStatus.OK;
		} else {
			hs = HttpStatus.NOT_FOUND;
		}

		ResponseEntity<Videojuego> re = new ResponseEntity<Videojuego>(vModif, hs);

		return re;

	}
	
	// Para eliminar un OBJETO se usa DELETE
	@DeleteMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> borrar(@PathVariable("id") int id_videojuego) {

		Videojuego vDel = daoVideojuego.borrar(id_videojuego);

		ResponseEntity<Videojuego> re = new ResponseEntity<Videojuego>(vDel, HttpStatus.ACCEPTED);

		return re;

	}
	
}

