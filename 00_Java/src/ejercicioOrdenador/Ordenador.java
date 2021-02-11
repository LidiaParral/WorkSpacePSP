package ejercicioOrdenador;

import java.util.ArrayList;

public class Ordenador {
	
	private double precio;
	private Discoduros discoDuro;
	private PlacaBase placaBase;
	private ArrayList<RAMs> listaRams;
	private ArrayList<TarjetaGrafica> listaTarjetas;
	
	
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Discoduros getDiscoDuro() {
		return discoDuro;
	}
	public void setDiscoDuro(Discoduros discoDuro) {
		this.discoDuro = discoDuro;
	}
	public PlacaBase getPlacaBase() {
		return placaBase;
	}
	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}
	public ArrayList<RAMs> getListaRams() {
		return listaRams;
	}
	public void setListaRams(ArrayList<RAMs> listaRams) {
		this.listaRams = listaRams;
	}
	public ArrayList<TarjetaGrafica> getListaTarjetas() {
		return listaTarjetas;
	}
	public void setListaTarjetas(ArrayList<TarjetaGrafica> listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}
	@Override
	public String toString() {
		return "Ordenador - precio:" + precio + " euros, " + discoDuro + ", " + placaBase + ", Lista de RAM's:"
				+ listaRams + ", Lista de Tarjetas Gráficas:" + listaTarjetas;
	}
	
	
	
	
	

}
