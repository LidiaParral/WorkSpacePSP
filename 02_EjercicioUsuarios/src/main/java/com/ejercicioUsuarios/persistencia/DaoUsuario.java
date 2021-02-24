package com.ejercicioUsuarios.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ejercicioUsuarios.modelo.entidad.Usuario;

@Component
public class DaoUsuario {
	
	public List<Usuario> listaBancoUsuarios;

	private int contador = 1;
	
	public DaoUsuario() {
		Usuario u1 = new Usuario();
		u1.setId(contador++);
		u1.setName("Lidia");
		u1.setPassword("123456");
		u1.setAddres("lidia@gmail.com");
		u1.setAge(25);
		u1.setBank("Bankia");
		u1.setMoney(3000);
		
		
		Usuario u2 = new Usuario();
		u2.setId(contador++);
		u2.setName("Miguel");
		u2.setPassword("987654");
		u2.setAddres("miguel@gmail.com");
		u2.setAge(63);
		u2.setBank("Santander");
		u2.setMoney(25000);
		
		listaBancoUsuarios = new ArrayList<Usuario>();
		listaBancoUsuarios.add(u1);
		listaBancoUsuarios.add(u2);
		
		
	}

	
	


	// Tendriamos que hacer los metodos de get, post, put, delete
	public List<Usuario> listado() {
		return listaBancoUsuarios;
	}
	
	
	// JAVADOC
	/**
	 * Método para buscar el USUARIO con ID en concreto, pasado por parámetro
	 * 
	 * @param id, representa el ID a buscar
	 * @return Usuario con el ID a buscar o NULL en caso de que el usuario no exista
	 */
	public Usuario buscar(int id) {
		Usuario usu = null;
		for (Usuario usuario : listaBancoUsuarios) {
			if(usuario.getId() == id) {
				usu = usuario;
				break;
				//*BREAK¿?
			}
		}
	
		return usu;
	}
	
	/**
	 * Método para insertar un usuario
	 * 
	 * @param v, parámetro de un objeto de tipo USUARIO 
	 * @return USUARIO insertado
	 */
	public Usuario alta(Usuario usu) {
		usu.setId(contador++);
		listaBancoUsuarios.add(usu);
		return usu;

	}

	
	/**
	 * Método que modifica un usuario a partir de un ID
	 * 
	 * @param uModif, usuario que se quiere modificar, dentro del atributo ID
	 *                contendrá el ID que se quiere modificar
	 * @return USUARIO modificada o NULL en caso de que no encontraramos el usuario
	 */
	public Usuario modificar(Usuario uModif) {
		// Búsqueda del videojuego
		Usuario usu = buscar(uModif.getId());

		// Si el VIDEOJUEGO exise, se modifican los valores de dicho videojuego
		if (usu != null) {
			usu.setName(uModif.getName());
			usu.setPassword(uModif.getPassword());
			usu.setAddres(uModif.getAddres());
			usu.setAge(uModif.getAge());
			usu.setBank(uModif.getBank());
			usu.setMoney(uModif.getMoney());
			
		}
		return usu;
	}
	
	
	/**
	 * Método que borra un usuario a partir de un ID
	 * @param id, representa el ID a buscar
	 * @return USUARIO borrado o NULL, en caso de que no encontraramos el videojuego
	 */
	public Usuario borrar(int id) {
		Usuario usu = buscar(id);
		 
		listaBancoUsuarios.remove(usu);
		
		
		
		return usu;

	}

}
