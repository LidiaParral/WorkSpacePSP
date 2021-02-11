package ejercicioOrdenador;

import java.util.ArrayList;



public class MainOrdenador {

	public static void main(String[] args) {
		
		PlacaBase pb1 = new PlacaBase();
		pb1.setMarca("Gigabyte");
		pb1.setModelo("GAB45MSH2-00-G");
		pb1.setPrecio(72.99);
		
		
		Discoduros d1 = new Discoduros();
		d1.setMarca("Maxtor");
		d1.setTipo("HX-M201TCB/GM");
		d1.setCapacidad(2);
		
		
		TarjetaGrafica tg1 = new TarjetaGrafica();
		tg1.setModelo("Gigabyte");
		tg1.setModelo("Geforce GTX 1660");
		tg1.setPotencia(5.44);
		
		TarjetaGrafica tg2 = new TarjetaGrafica();
		tg2.setModelo("MSI RADEON");
		tg2.setModelo("Rx 570");
		tg2.setPotencia(5.1);
		
		RAMs ram1 = new RAMs();
		ram1.setMarca("HyperX Fury DDR4");
		ram1.setCapacidad(16);
		ram1.setVelocidad(2400);
		
		RAMs ram2 = new RAMs();
		ram2.setMarca("Kinston ValueRam");
		ram2.setCapacidad(8);
		ram2.setVelocidad(2666);
		
		
		Ordenador ordenador = new Ordenador();
		ordenador.setDiscoDuro(d1);
		ordenador.setPlacaBase(pb1);
		ordenador.setPrecio(1850);
		
		ArrayList<TarjetaGrafica> listaTarjetas = new ArrayList<TarjetaGrafica>();
		listaTarjetas.add(tg1);
		listaTarjetas.add(tg2);
		
		ordenador.setListaTarjetas(listaTarjetas);
		
		
		ArrayList<RAMs> listaRAMs = new ArrayList<RAMs>();
		listaRAMs.add(ram1);
		listaRAMs.add(ram2);
		
		ordenador.setListaRams(listaRAMs);
		
		
		System.out.println(ordenador);
		

	}

}
