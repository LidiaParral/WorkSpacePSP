package herencia;

//Cuando heredamos de una clase con metodos abstractos podemos hacer 2 cosas:
//1- Declarar la clase como abstracta
//2- Implementar los metodos abstractos
public abstract class Pez extends Animal{

	private int numeroAletas;

	//Cuando sobreescribimos un metodo le cambiamos el comportamiento
	//por defecto de la clase padre.
	//Para sobreescribir un metodo tenemos que hacer que tenga
	//la misma firma que el metodo padre
	//la firma es 1, el nombre, 2 el numero de parametros de entrada
	// y 3 el tipo de los parametros de entrada
	@Override
	public void comer(Object comida) {
		if(comida instanceof Placton) {
			Placton p = (Placton)comida;
			System.out.println("Ummm que bueno! 😋 " + "Me llamo "
					+ nombre + " y voy a comer placton que tiene " 
					+ p.getCalorias());
		}else {
			System.out.println("Puajjj que asco no me gusta el " 
					+ comida.getClass().getSimpleName());
		}
	}

	public int getNumeroAletas() {
		return numeroAletas;
	}

	public void setNumeroAletas(int numeroAletas) {
		this.numeroAletas = numeroAletas;
	}
	
}
