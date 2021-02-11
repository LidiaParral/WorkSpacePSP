package javabean;

//Los enumerados son clases cuyos objetos no se pueden crear
//en tiempo de ejecucion y estan predefindos en tiempo de compilacion

//Los objetos estan ordenador en un array
public enum TipoCafe {
	SOLO(1),CON_LECHE(1.2),AVELLENAS(2),CORTADO(1.1),
	PREMIUM(5),IRLANDES(6),CAPPUCCINO(3),MOCCA(2.5);
	
	private double precio;

	private TipoCafe(double precio) {
		this.precio = precio;
	}
	
	
	public double getPrecio() {
		return precio;
	}
	
	
}
