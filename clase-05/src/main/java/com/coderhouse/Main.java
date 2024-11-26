package com.coderhouse;

import com.coderhouse.excepciones.PerroException;
import com.coderhouse.mascotas.Mascota;
import com.coderhouse.mascotas.Perro;

public class Main {

	public static void main(String[] args) throws PerroException {

		Perro unPerro = new Perro();

		unPerro.setNombre("Firulay");
		unPerro.setColor("Beige");
		unPerro.setTamanio("Pequeño");
		try {
			unPerro.setEdad(2);
		} catch (PerroException error) {
			System.err.println("Error, " + error.getMessage());
		} finally {
			System.out.println("Finalizo la Validacion de la PerroException.!");
		}

		unPerro.setRaza("Caniche");

//		unPerro.caminar();
//		unPerro.comer();
//		unPerro.ladrar();
//
//		System.out.println(unPerro);

		Mascota unaMascota = new Mascota();
////		unaMascota.setNombre("Rex");
////		unaMascota.setColor("Blanco");
////		unaMascota.setTamanio("Grande");
////		unaMascota.setEdad(6);
//		
		unaMascota.caminar();
		unaMascota.comer();
		
		Mascota nuevaMascota = new Mascota("Godshilla", "Negro", "Mediano", 6);
		
		
		nuevaMascota.caminar();
		nuevaMascota.comer();
		System.out.println(nuevaMascota);
		
		
		Mascota nuevaNuevaMascota = new Mascota("Rodrigo", 10);
		System.out.println(nuevaNuevaMascota);

	}

}
