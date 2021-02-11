package ejercicioOrdenador;

public class Discoduros {
	
	private int capacidad;
	private String tipo;
	private String marca;
	
	
	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	@Override
	public String toString() {
		return "Discoduros - capacidad:" + capacidad + ", tipo:" + tipo + ", marca:" + marca;
	}
	
	
	
}
