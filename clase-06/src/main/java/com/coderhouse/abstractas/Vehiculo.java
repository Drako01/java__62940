package com.coderhouse.abstractas;

public abstract class Vehiculo {
	
	protected String marca;
	protected String modelo;
	protected String color;
	protected Integer ruedas;
	
	protected abstract void encender();
	
	protected abstract void apagar();
	
	protected abstract void mover();
	
	public void mostrarCantidadDeRuedas() {
		System.out.println("Mi vehiculo marca " + getMarca() + " tiene " 
							+ getRuedas() + " Ruedas.!");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getRuedas() {
		return ruedas;
	}

	public void setRuedas(Integer ruedas) {
		this.ruedas = ruedas;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", ruedas=" + ruedas + "]";
	}
	
	

}
