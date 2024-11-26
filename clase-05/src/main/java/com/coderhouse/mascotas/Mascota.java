package com.coderhouse.mascotas;

import com.coderhouse.excepciones.PerroException;

public class Mascota {

	private static final int EDAD_MAXIMA = 15;

	String mensajeDeError = "La Mascota no vive más de " + EDAD_MAXIMA + " años de edad.!";

	private String nombre;
	private String color;
	private String tamanio;
	protected Integer edad;

	// Constructor
	public Mascota() {
		super();
	}
	
	// Sobrecarga de Constructores	
	public Mascota(String nombre, Integer edad) {
		this();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Mascota(String nombre, String color, String tamanio, Integer edad) {
		this(nombre, edad);
		this.color = color;
		this.tamanio = tamanio;
	}



	public void caminar() {
		System.out.println("La Mascota " + getNombre() + " esta Caminando.!");
	}

	public void comer() {
		System.out.println("La Mascota " + getNombre() + " esta Comiendo.!");
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamanio() {
		return this.tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) throws PerroException {
		if (edad > EDAD_MAXIMA) {
			throw new PerroException(mensajeDeError);
		}
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", color=" + color + ", tamanio=" + tamanio + ", edad=" + edad + "]";
	}

}
