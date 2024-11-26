package com.coderhouse;

public class Clase02 {

	public static void main(String[] args) {
		/*
		int numeroA = 1;
		int numeroB = 2;

		if (numeroA > numeroB) { // (Condicion) puede ser true o false
			System.out.println("El numero " + numeroA + " es Mayor que " + numeroB);
		} else {
			System.out.println("El numero " + numeroA + " es Menor que " + numeroB);
		}

		System.out.println("Si llegamos hasta aca, es porque se ejecuto el If");
		 */
		
		//Calculadora
		/*
		float numeroA = 1.5f;
		float numeroB = 5.0f;
		
		float resultado = numeroA / numeroB;
		
		if (numeroB != 0) {			
			System.out.println("El resultado es: " + resultado);
		} else {
			System.err.println("Error, No se puede dividir por Cero.!");
		}
		*/
		/*
		int ingreseUnNumero = 0;
		
		if( ingreseUnNumero > 0 ) {
			System.out.println("El Numero ingresado es Positivo");
		} else if(ingreseUnNumero < 0 ){
			System.out.println("El Numero ingresado es Negativo");
		} else if (ingreseUnNumero == 0 ){
			System.out.println("El numero ingresado es Cero");
		} else {
			System.err.println("El dato ingresado no es un numero");
		}
		*/
		/*
		int diaDeLaSemana = -1;
		
		if (diaDeLaSemana == 1) {
			System.out.println("El dia Actual es Lunes");
		} else if (diaDeLaSemana == 2) {
			System.out.println("El dia Actual es Martes");
		} else if (diaDeLaSemana == 3) {
			System.out.println("El dia Actual es Miercoles");
		} else if (diaDeLaSemana == 4) {
			System.out.println("El dia Actual es Jueves");
		} else if (diaDeLaSemana == 5) {
			System.out.println("El dia Actual es Viernes");
		} else if (diaDeLaSemana == 6) {
			System.out.println("El dia Actual es Sabado");
		} else if (diaDeLaSemana == 7) {
			System.out.println("El dia Actual es Domingo");
		} else {
			System.err.println("El dia ingresado es Incorrecto.!");
		}
		*/
		/*
		int ingreseSuEdad = 18;
		
		if (ingreseSuEdad >= 18 && ingreseSuEdad <= 100) {
			System.out.println("Usted puede ingresar.!!");
		} else if (ingreseSuEdad > 0 && ingreseSuEdad < 18){
			System.err.println("Ud. Es menor de Edad y no puede ingresar");
		} else {
			System.err.println("Ud. Ingreso una Edad Incorrecta. O es muy viejo para tomar Alcohol");
		}
		*/
		/*
		int diaDeLaSemana = 12;
		String nombreDelDiaDeLaSemana = null;
		
		switch(diaDeLaSemana) {		
			case 1:
				nombreDelDiaDeLaSemana = "Lunes";
				break;
			case 2:
				nombreDelDiaDeLaSemana = "Martes";
				break;
			case 3:
				nombreDelDiaDeLaSemana = "Miercoles";
				break;
			case 4:
				nombreDelDiaDeLaSemana = "Jueves";
				break;
			case 5:
				nombreDelDiaDeLaSemana = "Viernes";
				break;
			case 6:
				nombreDelDiaDeLaSemana = "Sabado";
				break;
			case 7:
				nombreDelDiaDeLaSemana = "Domingo";
				break;
			default:
				nombreDelDiaDeLaSemana = "Dia Incorrecto";
				break;
		}
		
		System.out.println("El dia de la semana correspondiente al Numero " 
				+ diaDeLaSemana + " es el " + nombreDelDiaDeLaSemana);
		*/
		/*
		String dia = "Luneds";
		
		switch(dia.toLowerCase()) { // Lo convierte en minuscula
		case "lunes":
			System.out.println("Hoy es " + dia);
			break;
		case "martes":
			System.out.println("Hoy es " + dia);
			break;
		case "miercoles":
			System.out.println("Hoy es " + dia);
			break;
		case "jueves":
			System.out.println("Hoy es " + dia);
			break;
		case "viernes":
			System.out.println("Hoy es " + dia);
			break;
		case "sabado":
			System.out.println("Hoy es " + dia);
			break;
		case "domingo":
			System.out.println("Hoy es " + dia);
			break;
		default:
			System.err.println("El dia Ingresado fue: " + dia + " y es Incorrecto.!");
			break;
		}
		
		System.out.println("Fin del Switch.!!");
		*/
		
		// Operador Ternario
		/*
		int numeroA = 10;
		int numeroB = 2;
		
		boolean condicion = numeroA > numeroB; // Esto puede ser o true o false
		
		String resultado = condicion 
				? "El numero " + numeroA + " es Mayor que " + numeroB 
				: "El numero " + numeroA + " es Menor que " + numeroB; 
				// El valor de verdad de condicion es false
		
		System.out.println(resultado);
		*/
		
		// Datos Aleatoreos
		
		//double randon = 0.0d;
		int randon = 0;
		//randon = Math.random();
		//System.out.println(randon);
		
		int minimo = 1;
		int maximo = 6;
		
		int rango = maximo - minimo + 1; // de 1 a 100
		
		randon = ( int ) (Math.random() * rango ) + minimo;
		System.out.println(randon);
	
//		final double PI = Math.PI;
//		
//		System.out.println(String.format("%.2f", PI));
	}

}
