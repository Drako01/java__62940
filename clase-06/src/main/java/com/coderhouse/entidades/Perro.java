package com.coderhouse.entidades;

public class Perro extends AnimalTerrestre {

	@Override
	public void emitirSonido() {
		System.out.println(getNombre() + " esta Ladrando.!");
	};

	@Override
	public void moverse() {
		System.out.println(getNombre() + " se esta Moviendo.!");
	};

	@Override
	public void comer() {
		System.out.println(getNombre() + " esta Comiendo.!");
	};

	@Override
	public boolean estaVivo() {		
		return true;
	};
	
	@Override
	public void dormir() {
		System.out.println(getNombre() + " esta Durmiendo.!");
	};

	@Override
	public void respirar() {
		System.err.println(getNombre() + " esta Respirando.!");
	};

	@Override
	public void jugar() {
		System.out.println(getNombre() + " esta Jugando.!");
	};
}
