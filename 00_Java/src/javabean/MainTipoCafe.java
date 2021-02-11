package javabean;

import java.util.Scanner;

public class MainTipoCafe {
	public static void main(String[] args) {
		//Ejemplo de como usar un enumerado
		TipoCafe tipoCafe = TipoCafe.CORTADO;
		System.out.println(tipoCafe);
		
		System.out.println("Mostrando los cafes: ");
		
		//values devuelve un array con los elementos
		for(int i=0; i < TipoCafe.values().length;i++) {
			TipoCafe tc = TipoCafe.values()[i];
			System.out.println(i+"-"+tc+" precio:"+tc.getPrecio());
		}
		
		System.out.println("Escoja uno:");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		System.out.println("Ha elegido usted el cafe " +
				TipoCafe.values()[opcion]);
		
		System.out.println("Por favor introduzca: " +
				TipoCafe.values()[opcion].getPrecio());
	}
}
