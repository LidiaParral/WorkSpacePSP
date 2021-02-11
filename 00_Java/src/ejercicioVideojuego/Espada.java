package ejercicioVideojuego;

public class Espada extends Arma{
	
	public Espada(String tipo) {
		super();
		setTipo(tipo);
	}

	public void usar() {
		System.out.println("Clink!");
	}

}
