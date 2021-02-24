package com.ejercicioUsuarios.controler;

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

import com.ejercicioUsuarios.modelo.entidad.Usuario;
import com.ejercicioUsuarios.persistencia.DaoUsuario;


@RestController
public class UsuariosController {
	
	@Autowired
	private DaoUsuario daoUsuario;
	

	@GetMapping("usuarios")
	public ResponseEntity<List<Usuario>> listar() {
		List<Usuario> lista = daoUsuario.listado();

		// Con un objeto de tipo RESPONSEENTITY se puede devolver datos y además códigos
		// de respuestas
		ResponseEntity<List<Usuario>> re = new ResponseEntity<List<Usuario>>(lista, HttpStatus.OK);

		return re;
	}

	// Cuando hay un parámetro variable se debe poner entre corchetes{}, y se
	// recoger con la anotación @PathVariable dentro
	// de los argumentos de entrada del método
	@GetMapping("usuarios/{id}")
	public ResponseEntity<Usuario> obtener(@PathVariable("id") int id_usuario) {
		System.out.println("El id a buscar es:" + id_usuario);
		
		Usuario u1 = daoUsuario.buscar(id_usuario);

		HttpStatus hs = null;

		// Si la persona existe
		if (u1 != null) {
			hs = HttpStatus.OK;
		} else {
			hs = HttpStatus.NOT_FOUND;
		}

		// Respuesta
		ResponseEntity<Usuario> re = new ResponseEntity<Usuario>(u1, hs);

		return re;
	}
	
	
	// Para dar de alta un OBJETO se usa POST
	@PostMapping("usuarios")
	public ResponseEntity<Usuario> alta(@RequestBody Usuario usu) {
		Usuario uAlta = daoUsuario.alta(usu);

		ResponseEntity<Usuario> re = new ResponseEntity<Usuario>(uAlta, HttpStatus.CREATED);

		return re;

	}
	
	// Para modificar un OBJETO se usa PUT
	@PutMapping("usuarios/{id}")
	public ResponseEntity<Usuario> modifica(@RequestBody Usuario usu, @PathVariable("id") int id_usuario) {
		// Va a venir el ID dado por el parámetro de la URL y el resto de la información
		// a cambiar por el BODY
		usu.setId(id_usuario);

		Usuario uModif = daoUsuario.modificar(usu);

		HttpStatus hs = null;

		if (uModif != null) {
			hs = HttpStatus.OK;
		} else {
			hs = HttpStatus.NOT_FOUND;
		}

		ResponseEntity<Usuario> re = new ResponseEntity<Usuario>(uModif, hs);

		return re;

	}
	
	// Para eliminar un OBJETO por su ID se usa DELETE
	@DeleteMapping("usuarios/{id}")
	public ResponseEntity<Usuario> borrar(@PathVariable("id") int id_usuario) {

		Usuario uDel = daoUsuario.borrar(id_usuario);

		ResponseEntity<Usuario> re = new ResponseEntity<Usuario>(uDel, HttpStatus.ACCEPTED);

		return re;

	}
	
	

}
