package ejercicioPersona;

public class MainJava {
	public static void main(String[] args) {
		//Un objeto en java se crea con la palabra reservada
		//"new"
		new Persona();
		Persona p1 = new Persona();
		p1.nombre = "Harry";
		//un objeto muere en java cuando llega el recolector
		//de basura y lo borra "Garbage collector"
		//El GC es un programa que recorre eventualmente
		//la memoria virtual de java (HEAP) buscando objetos
		//que no estan referenciados para borrarlos
		
		//podemos tener varias referencias sobre un mismo objeto
		Persona p2 = new Persona();
		p2.nombre = "Hernion Galway";
		
		p1 = p2;
		p1.nombre = "Ron";
		System.out.println(p2.nombre);
		System.out.println(p1.nombre);
		p1.nombre = "Oliver Atom";
		System.out.println(p2.nombre);
		
		//El ciclo de vida de una referencia es desde donde
		//se declare hasta el final del bloque al que este
		
		{//esto es un bloque en java
			Persona p3 = new Persona();
			p3.nombre = "Jagly";
		}//aqui muere p3
		
		//error en tiempo de compilacion
		//System.out.println(p3.nombre);
		
	}
}
