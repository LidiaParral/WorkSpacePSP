package herencia;

public class TRex extends Animal{

	@Override
	public void comer(Object comida) {
		if(comida == this) {
			System.out.println("No  me pienso comer a mi mismo");
			return;
		}
		if(comida instanceof Animal) {
			Animal a = (Animal)comida;
			System.out.println("Graaaauuuuu!!! Soy un TREX " + nombre + 
					" y me voy a comer al " + a.getClass().getSimpleName() + 
					" que se llama " + a.getNombre());
			
		}else {
			System.out.println("Solo como animales :(");
		}
		
	}

}
