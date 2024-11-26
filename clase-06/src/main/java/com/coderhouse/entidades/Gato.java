package com.coderhouse.entidades;

public class Gato extends AnimalTerrestre {

	@Override
	public void emitirSonido() {
		System.out.println(getNombre() + " esta Maullando.!");
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
		System.out.println(getNombre() + " esta Respirando.!");
	};

	@Override
	public void jugar() {
		System.out.println(getNombre() + " esta Jugando con la Lana.!");
	};
}
