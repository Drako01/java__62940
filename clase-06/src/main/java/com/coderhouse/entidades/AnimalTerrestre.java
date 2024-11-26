package com.coderhouse.entidades;

import com.coderhouse.interfaces.AccionesInterface;
import com.coderhouse.interfaces.SerVivoInterface;

public class AnimalTerrestre implements SerVivoInterface, AccionesInterface {

	private boolean vivo;

	private String nombre;

	private String raza;

	private int edad;

	@Override
	public void emitirSonido() {};

	@Override
	public void moverse() {};

	@Override
	public void comer() {};

	@Override
	public boolean estaVivo() {		
		return true;
	};

	@Override
	public void dormir() {}

	@Override
	public void respirar() {}

	@Override
	public void jugar() {}

	// Constructor
	public AnimalTerrestre() {
		super();
	}
	

	public AnimalTerrestre(String nombre) {
		this();
		this.nombre = nombre;
	}

	
	public AnimalTerrestre(boolean vivo, String nombre, String raza, int edad) {
		this(nombre);
		this.vivo = vivo;
		this.raza = raza;
		this.edad = edad;
	}

	// Getters y Setters
	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Animal [vivo=" + vivo + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "]";
	}

	
}
