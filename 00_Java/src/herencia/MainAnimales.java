package herencia;

import java.util.ArrayList;

public class MainAnimales {

	public static void main(String[] args) {
		//Las clases abstractas no son instanciables
		//Animal a1 = new Animal();
		
		Tiburon t1 = new Tiburon();
		t1.setNombre("Pinocho");
		t1.setEdad(3);
		t1.setNumeroAletas(6);
		
		Payaso payaso = new Payaso();
		payaso.setNombre("Nemo");
		payaso.setEdad(1);
		payaso.setNumeroAletas(1);
		
		TRex tRex = new TRex();
		tRex.setNombre("Rex");
		tRex.setEdad(5);
		
		
		ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
		listaAnimales.add(t1);
		listaAnimales.add(payaso);
		listaAnimales.add(tRex);
		
		Placton placton = new Placton();
		placton.setCalorias(150);
		
		for(Animal a : listaAnimales) {
			//Gracias al polimorfismo, el metodo comer que se
			//ejecutará sera el del animal concreto al que este
			//apuntando
			a.comer(placton);
		}
		
		for(Animal a : listaAnimales) {
			//Gracias al polimorfismo, el metodo comer que se
			//ejecutará sera el del animal concreto al que este
			//apuntando
			a.comer(tRex);
		}
	}

}
