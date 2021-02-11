package ejercicioPersona;

//Clase sirve como molde para crear objetos
//todos los objetos que se creen seran a imagen
//y semejanza de la clase

//Una clase se compone principalemnte
//1 - Atributos
//2 - Constructores
//3 - Metodos
public class Persona {
	//Java es un lenguaje tipado, es decir, las variables
	//hay que declararlas con el tipo de dato que va a contaener
	
	//estos son atributos
	// Visibilidades
	// 1) private -> solo desde esta clase
	// 2) (default - no poner nada) - > visibilidad desde esta clase y 
	// desde clases dentro del mismo paquete
	// 3) protected -> desde esta clase, desde clases dentro del mismo 
	// paquete y desde clases que hereden de esta
	// 4) public -> desde cualquier sitio
	String nombre;
	int edad;
	
	public Persona() {
		nombre = "Jagris";
	}
}
