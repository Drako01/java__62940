package com.coderhouse.sobrecarga;

public class Impresora {
	
	
	public void imprimir(int numero) {
		System.out.println("Imprimiendo el numero " + numero);
	}
	
	
	public void imprimir(int numeroA, int numeroB) {
		System.out.println("Imprimiendo el numero " + numeroA + " y el numero " + numeroB);
	}
	
	public void imprimir(String palabra) {
		System.out.println("Imprimiendo la palabra " + palabra);
	}
	
	public void imprimir(String palabraA, String palabraB) {
		System.out.println("Imprimiendo la palabra " + palabraA + " y la palabra " + palabraB);
	}
	
	public void imprimir(int[] numeros) {
		System.out.println("Imprimiendo el Array de Numeros");
		for(int numero : numeros) {
			System.out.println("Numero " + numero + "\n");
		}
	}
}
