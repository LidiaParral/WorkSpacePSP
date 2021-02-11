package ejercicioOrdenador;

public class TarjetaGrafica {
	
	private String marca;
	private String modelo;
	private double potencia;
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	@Override
	public String toString() {
		return "Tarjeta gráfica - marca:" + marca + ", modelo:" + modelo + ", potencia:" + potencia;
	}
	
	
	

}
