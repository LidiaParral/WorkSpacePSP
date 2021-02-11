package ejercicioCasa;

import java.util.ArrayList;

public class MainCasa {
	public static void main(String[] args) {
		
		//Crear objeto DIRECCION
		Direccion direccionCasa = new Direccion();
		direccionCasa.setNombreVia("Hogwarts");
		direccionCasa.setTipoVia("avenida flotante");
		direccionCasa.setCp("12345");
		direccionCasa.setNumero(13);
		
		//Crear objeto PROPIETARIO
		Persona propietario = new Persona();
		propietario.setNombre("Voldemort");
		propietario.setDni("12345698V");
		propietario.setEdad(125);
		propietario.setDireccion(direccionCasa);
		
		//Crear objetos HABITACIONES
		Habitacion salon = new Habitacion();
		salon.setM2(35);
		salon.setTipoHabitacion("Sal�n");
		
		Habitacion cocina = new Habitacion();
		cocina.setM2(15);
		cocina.setTipoHabitacion("Cocina");
		
		Habitacion banio = new Habitacion();
		banio.setM2(4);
		banio.setTipoHabitacion("Ba�o");
		
		Habitacion dormitorio = new Habitacion();
		dormitorio.setM2(20);
		dormitorio.setTipoHabitacion("Dormitorio");
		
		
		//Crear objetos INQUILINOS
		Persona inquilino1 = new Persona();
		inquilino1.setNombre("Harry Potter");
		inquilino1.setEdad(16);
		inquilino1.setDni("25669784H");
		inquilino1.setDireccion(direccionCasa);
		
		Persona inquilino2 = new Persona();
		inquilino2.setNombre("Hermione");
		inquilino2.setEdad(16);
		inquilino2.setDni("278944126H");
		inquilino2.setDireccion(direccionCasa);
		
		//Crear objeto CASA
		Casa casa = new Casa();
		casa.setDireccion(direccionCasa);
		casa.setPrecio(1000);
		casa.setPropietario(propietario);
		
		ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
		listaHabitaciones.add(salon);
		listaHabitaciones.add(cocina);
		listaHabitaciones.add(banio);
		listaHabitaciones.add(dormitorio);
		
		//A�adir la listaHabitaciones al objeto CASA
		casa.setListaHabitaciones(listaHabitaciones);
		
		
		ArrayList<Persona> listaInquilinos = new ArrayList<Persona>();
		listaInquilinos.add(inquilino1);
		listaInquilinos.add(inquilino2);
		
		casa.setListaInquilinos(listaInquilinos);
		
		System.out.println(casa);
		
		
	}
}
