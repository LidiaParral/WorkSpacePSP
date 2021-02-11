package javabean;

//Vamos a hacer esta clase JavaBean
//Un clase con estructura JavaBean es una clase
//que tiene sus atributos con visibilidad private
//y tiene metodos accesores y modificadores public

//Es una estructura ampliamente utilizada en frameworks java
//como puede ser Spring
public class Persona {
	private String nombre;
	private int edad;
	private double peso;
	
	public static int numeroPersonas;
	
	//Persona tiene una relacion de composion con Direccion
	//Si responde a la pregunta "has a" "tiene un" es esta relacion
	//este tipo de relacion va como atributo de clase
	private Direccion direccion;

	
	//que hace java con los constructores
	//si no creais constructor java crea el constructor
	//por defecto
	public Persona() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if(edad >= 0)
			this.edad = edad;
		else
			this.edad = 0;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	//En herencia para sobrescribir un metodo tiene que tener la misma
	//firma
	//La firma de un metodo consta de los siguiente:
	//1- El nombre del metodo
	//2- El numero de los parametros de un metodo
	//3- El tipo de los parametros de un metodo
	
	//No puede haber dos metodos con la misma firma en java dentro de
	//una clase.
	
	public void sumar(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	//la sobrecarga es dos metodos con el mismo nombre, pero distinta
	//firma
	public void sumar(int n1, int n2, int n3) {
		System.out.println(n1 + n2);
	}
	
	//nosotros sobreescribimos dos metodos cuando el metodo de la
	//clase hija tiene la misma firma que el metodo de la clase padre
	
	//La anotacion @override es una anotacion de seguridad, que confirma
	//al programador que efectivamente esta sobrescribiendo el metodo
	//y no esta creado un metodo nuevo
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", direccion=" + direccion + "]";
	}
	
	
}
