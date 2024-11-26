package com.coderhouse.entidades;

import com.coderhouse.interfaces.SerVivoInterface;

public class Ave implements SerVivoInterface{
	
	private String nombre;
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void emitirSonido() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverse() {
		System.out.println(getNombre() + " se esta Moviendo.!");
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}

}
