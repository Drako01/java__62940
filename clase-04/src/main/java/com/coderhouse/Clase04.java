package com.coderhouse;

import com.coderhouse.objetos.Perro;

public class Clase04 {

	public static void main(String[] args) throws Exception {
		

		Perro primerPerro = new Perro();
		
		primerPerro.setNombre("Firulay");
		primerPerro.setColor("Gris");
		primerPerro.setRaza("Caniche");
		primerPerro.setTamanio("Chico");
		primerPerro.setEdad(3);
		
		primerPerro.setNombre("Gabriel");
		
		System.out.println(primerPerro.getNombre());
		System.out.println(primerPerro.getRaza());
		System.out.println(primerPerro.getColor());
		System.out.println(primerPerro.getTamanio());
		System.out.println(primerPerro.getEdad());
		
		System.out.println(primerPerro);
		
		primerPerro.caminar();
		primerPerro.comer();
		primerPerro.ladrar();	
		
		String[] nombres = new String[] {
			"Gabriel",
			"Oclivar",
			"Sara",
			"Matias",
			"Marcelo",
			"Alejandro"
		};
		int radio = 3; // Variable Local dentro del Main
		
		imprimirListaDeNombres(nombres);
		System.out.println("El Area del circulo con radio " + radio 
				+ " cm, es de " + calcularAreaDelCirculo(radio) + " cm");
		
		
	}

	private static void imprimirListaDeNombres(String[] nombreDePersonas) {
		for(String nombre : nombreDePersonas) {
			System.out.println("Nombre: " + nombre);
		}
	}
	
	static final double PI;
	
	static {
		PI = 3.141592653589793;
	}
	
	private static double calcularAreaDelCirculo(int radio) {
		return PI * Math.pow(radio, 2);
	}
	
	
}
