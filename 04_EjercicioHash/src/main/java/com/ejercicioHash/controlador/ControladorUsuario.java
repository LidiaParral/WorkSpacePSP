package com.ejercicioHash.controlador;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ejercicioHash.modelo.entidad.Usuario;
import com.ejercicioHash.modelo.negocio.GestorUsuario;

@Controller
public class ControladorUsuario {
	
	@Autowired
	private GestorUsuario gestorUsuario;

	@GetMapping("registro")
	private String registrarUsuario() {
		return "signup";
	}

	@GetMapping("loggin")
	private String login() {
		return "login";
	}

	@PostMapping("signup")
	private String registrar(@RequestParam("usuario") String nombreUsuario, @RequestParam("password") String password,
			Model model) throws NoSuchAlgorithmException {

		String psswdHash = hashPassword(password);
		
		Usuario u = new Usuario();
		u.setNombre(nombreUsuario);
		u.setPassword(psswdHash);

		
		gestorUsuario.add(u);
		
		model.addAttribute("usuario", nombreUsuario);

		System.out.println(u);

		return "inicio";
	}

	@PostMapping("login")
	private String loginUsuario(@RequestParam("usuario") String nombreUsuario, @RequestParam("password") String password,
			Model model) throws NoSuchAlgorithmException {

		String psswdHash = hashPassword(password);
		
		Usuario u = new Usuario();
		u.setNombre(nombreUsuario);
		u.setPassword(psswdHash);
		
		boolean validado = gestorUsuario.validarUsuario(u);

		if (validado) {
			
			model.addAttribute("usuario", nombreUsuario);
			
			return "inicio";

		} else {
			return "error";
		}
	}

	@GetMapping("salida")
	private String cerrarSesion() {
		return "../static/main";
	}
	
	@GetMapping("retornoLogin")
	private String volverLogin() {
		return "login";
	}

	private String hashPassword(String password) throws NoSuchAlgorithmException {
		byte[] passwd = password.getBytes();

		MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
		messageDigest.update(passwd);

		byte[] resumen = messageDigest.digest();
		String mensaje = new String(resumen);
		return mensaje;
	}


}
