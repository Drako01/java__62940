package com.coderhouse.entidades;

import com.coderhouse.abstractas.Vehiculo;

public class Auto extends Vehiculo {
	
	

	@Override
	protected void encender() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void apagar() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void mover() {
		// TODO Auto-generated method stub

	}
	@Override
	public void mostrarCantidadDeRuedas() {
		System.out.println("Mi Auto, marca " + getMarca() + " tiene " 
							+ getRuedas() + " Ruedas.!");
	}
	
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", ruedas=" + ruedas + "]";

	}
	
}
