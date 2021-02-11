package herencia;

import javabean.Persona;

public class Tiburon extends Pez{

	@Override
	public void comer(Object comida) {
		if(comida instanceof Persona) {
			Persona p = (Persona)comida;
			System.out.println("Soy el Tiburon " + nombre + " y me voy "
					+ "a comer a la persona " + p.getNombre());
		}else {
			System.out.println("Eso no me gusta 😑");
		}
	}

}
