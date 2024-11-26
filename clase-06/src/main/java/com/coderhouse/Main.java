package com.coderhouse;

import com.coderhouse.entidades.Auto;
import com.coderhouse.entidades.Ave;
import com.coderhouse.entidades.Gato;
import com.coderhouse.entidades.Perro;
import com.coderhouse.interfaces.SerVivoInterface;
import com.coderhouse.sobrecarga.Impresora;

public class Main {

	public static void main(String[] args) {

//		Perro miPerro = new Perro();
//		
//		miPerro.setNombre("Firulay");
//		miPerro.setEdad(5);
//		miPerro.setRaza("Caniche");
//		miPerro.setVivo(true);
//		
//		miPerro.comer();
//		miPerro.emitirSonido();
//		miPerro.estaVivo();
//		miPerro.comer();
//		miPerro.dormir();
//		miPerro.jugar();
//		miPerro.respirar();
//		
//		System.out.println("El perro " + miPerro.getNombre() + " esta vivo?: " + miPerro.estaVivo());
//		
//		System.out.println(miPerro);
//		
//		System.out.println("La ubicacion de " + miPerro.getNombre() + 
//		" es en " + SerVivoInterface.UBICACION);
		
		
		
//		Gato miGato = new Gato();
//		
//		miGato.setNombre("Michi");
//		
//		miGato.comer();
//		miGato.emitirSonido();
//		miGato.estaVivo();
//		miGato.comer();
//		miGato.dormir();
//		miGato.jugar();
//		
//		System.out.println(miGato);
//		
//		
//		Ave miAve = new Ave();
//		
//		
//		miAve.setNombre("Tweety");
//		miAve.comer();
//		miAve.emitirSonido();
//		miAve.estaVivo();
//		miAve.moverse();
		
//		Auto miAuto = new Auto();
//		
//		miAuto.setMarca("Ford");
//		miAuto.setModelo("Fiesta");
//		miAuto.setRuedas(4);
//		miAuto.setColor("Azul");
//		miAuto.mostrarCantidadDeRuedas();
//		System.out.println(miAuto);
		
		
		Impresora miImpresora = new Impresora();
		
		miImpresora.imprimir(3);
		miImpresora.imprimir(10, 20);
		miImpresora.imprimir("Palabra");
		miImpresora.imprimir("Primer String", "Segundo String");
		
		int[] enteros = {1, 2, 3 , 5 , 8 , 9 , 10 , 22};
		miImpresora.imprimir(enteros);
		
	}

}
