package com.coderhouse.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraysClase03 {
	public static void main(String[] args) {

		int[] numerosEnteros = new int[6];

		numerosEnteros[0] = 10; // Estoy guardando en la posicion 0, el Nro 10
		numerosEnteros[1] = 5;
		numerosEnteros[2] = 3;
		numerosEnteros[3] = 12;
		numerosEnteros[4] = 9;
		numerosEnteros[5] = 13;
		// numerosEnteros[6] = 0;

		// System.out.println("Posicion en Memoria: " + numerosEnteros);
//		System.out.println("El Array numerosEnteros tiene " 
//							+ numerosEnteros.length + " Elementos.!");
//		
//		System.out.println("El elemento con indice 0 es: " + numerosEnteros[0]);
//		System.out.println("El elemento con indice 1 es: " + numerosEnteros[1]);
//		System.out.println("El elemento con indice 2 es: " + numerosEnteros[2]);
//		System.out.println("El elemento con indice 3 es: " + numerosEnteros[3]);
//		System.out.println("El elemento con indice 4 es: " + numerosEnteros[4]);
//		System.out.println("El elemento con indice 5 es: " + numerosEnteros[5]);

		// System.out.println(Arrays.toString(numerosEnteros));

//		String[] palabras = {
//				"Hola",
//				"Mundo", 
//				"Coder",
//				"Java",
//				"Sara"
//				};
//		
//		System.out.println("El Array palabras tiene " 
//			+ palabras.length + " Elementos.!");
//		System.out.println(Arrays.toString(palabras));
//		

		// Listas

//		List<String> listaDeNombres = new ArrayList<>();
//		List<String> listaDeNombres2 = new ArrayList<>();
//
//		listaDeNombres.add("Alejandro"); //0
//		listaDeNombres.add("Roberto"); //1
//		listaDeNombres.add("Sara"); //2
//		listaDeNombres.add("Marcelo"); //3
//
//		listaDeNombres2.add("Rodrigo"); //0 > 4
//		listaDeNombres2.add("Gary"); // 1 > 5
//
//		listaDeNombres.addAll(listaDeNombres2);

//		System.out.println("La Lista listaDeNombres tiene " + listaDeNombres.size());
//
//		System.out.println(
//				"La Lista listaDeNombres contiene a listaDeNombres2 " + listaDeNombres.containsAll(listaDeNombres2));

//		System.out.println(listaDeNombres);
//
//		listaDeNombres.remove(4);
//		System.out.println(listaDeNombres);
//		System.out.println("La Lista listaDeNombres tiene " + listaDeNombres.size());
//
//		System.out.println(listaDeNombres);

//		listaDeNombres.removeAll(listaDeNombres2);
//		System.out.println("La Lista listaDeNombres tiene " 
//				+ listaDeNombres.size());
//
//		System.out.println("La Lista listaDeNombres contiene a listaDeNombres2 " +
//			listaDeNombres.containsAll(listaDeNombres2));

		// Ciclos por conteo
//		for (String nombre : listaDeNombres) {
//			System.out.println("Nombre : " + nombre);
//		}

//		for (int i = 0; i < listaDeNombres.size(); i++) {
//			System.out.println("Nombre : " + listaDeNombres.get(i));
//		}

//		System.out.println(listaDeNombres.isEmpty()); // false
//		System.out.println(listaDeNombres); 
		// listaDeNombres.removeAll(listaDeNombres);
		// listaDeNombres.clear(); // Vaciar la Lista

//		if (listaDeNombres.isEmpty() ) {
//			System.out.println("La lista esta vacia.!!");
//		} else {
//			System.out.println(listaDeNombres); 
//		}

//		System.out.println(listaDeNombres);
//		
//		int posicion = 4;
//		System.out.println("El elemento con la posicion Nro " + posicion + " es: " 
//				+ listaDeNombres.get(posicion)); 
//		
//		listaDeNombres.set(posicion, "Sara");
//		System.out.println(listaDeNombres);
//		System.out.println("El elemento con la posicion Nro " + posicion + " es: " 
//				+ listaDeNombres.get(posicion));
//		
//		String nombre = "Sara";
//		
//		System.out.println("El indice del nombre " + nombre + " es: " 
//							+ listaDeNombres.indexOf(nombre));

		List<String> listaDeNombres = new ArrayList<>();

		listaDeNombres.add("Alejandro"); // 0
		listaDeNombres.add("Roberto"); // 1
		listaDeNombres.add("Sara"); // 2
		listaDeNombres.add("Marcelo"); // 3
		listaDeNombres.add("Nicolas"); // 4

//		Iterator<String> iterator = listaDeNombres.iterator();
//		
//		// Ciclos por condicion
//		while(iterator.hasNext()){// Existe un elementos siguiente??
//			String nombre = iterator.next(); // Si exite lo asigna a la variable
//			System.out.println("Nombre : " + nombre);
//			iterator.remove();
//		}

//		do {
//			System.out.println("Al menos 1 vez");
//		} while (false);
		
		listaDeNombres.forEach(nombre -> {
			System.out.println("Nombre : " + nombre);
		});

	}
}
