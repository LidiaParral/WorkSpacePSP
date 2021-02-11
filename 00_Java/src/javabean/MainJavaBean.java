package javabean;

import java.util.ArrayList;

public class MainJavaBean {
	

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("Son Goku");
		System.out.println(p1.getEdad());
		
		p1.setEdad(-45);
		//p1.edad = -23;
		//String direccion = "Calle diamente 58 Madrid 28051";
		int cp = 02345;// estan en base octal
		System.out.println(cp);
		int hex = 0xFF34EA; // estan en base hexadecimal
		int bin = 0b101;//esta en base binaria
		
		Persona p2 = null;
		//siempre que intenteis acceder a algun metodo de un puntero
		//o referencia a null, dara un null pointer exception
		//p1.getDireccion().setCp("28051");
		//los objetos cuando se crean sus primitivos tienen valor
		//de 0, y sus referencias tienen valor de "null"
		Direccion d1 = new Direccion();
		p1.setDireccion(d1);
		d1.setCp("28224");
		System.out.println(p1.getDireccion().getCp());
		
		d1 = new Direccion();
		d1.setCp("23567");
		System.out.println(p1.getDireccion().getCp());
		p1.getDireccion().setCp("12345");
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		Persona p3 = new Persona();
		listaPersonas.add(p3);
		p3.setNombre("Krilin");
		
		System.out.println(listaPersonas.get(0).getNombre());
		
		String s1 = "Felix";
		String s2 = "Felix";
		String s3 = new String("Felix");
		
		if(s1 == s2) {
			System.out.println("Son iguales");
		}
		
		//
		if(s1.equals(s3)) {
			
		}
		
		s2 = "Ana";
		s1 = "Ana";
		
		Persona p4 = new Persona();
		p4.setNombre("Roberto");
		
		Persona p5 = new Persona();
		p5.setNombre("Roberto");
		
		System.out.println(p4 == p5);
		//el .equal por defecto funciona exactamente igual
		//que el ==
		//podemos sobreescribir el .equal en la clase Persona
		//y siempre tambien hay que sobrescribir el hashcode
		System.out.println(p4.equals(p5));
		
		listaPersonas.add(p4);
		
		//este metodo te dice si un objeto esta dentro de otro
				//pero ojo, utiliza el metodo equals
		System.out.println("Esta en la lista? " +listaPersonas.contains(p5));
		
		p4 = p5;
		System.out.println(p4 == p5);
		
		System.out.println(p5);	
		
		//A una variable statica accedemos a traves de la clase
		Persona.numeroPersonas = 3;
		
		//para acceder a un metodo dinamico desde un contexto statico
		//debemos de crear siempre el objeto
		MainJavaBean mjb = new MainJavaBean();
		mjb.sumar(12,23);
	}
	
	public void sumar(int n1, int n2) {
		System.out.println(n1+n2);
	}
	

}
