package ejercicioVideojuego;

public class MainVideojuego {
	public static void main(String[] args) {
		Guerrero g1 = new Guerrero();
		g1.setNombre("Conan");
		Arma arma = new Espada("Bastarda");
		g1.setArma(arma);
		g1.atacar();
		
		Guerrero g2 = new Guerrero();
		g2.setNombre("Cupido");
		arma = new Arco();
		arma.setTipo("largo");
		g2.setArma(arma);
		g2.atacar();
	}
}
