package com;

public class ejercicio1 {
	public static void main(String[] args) {
		int tiempoLlamada = 4;

		if (tiempoLlamada == 5) {
			System.out.println("El costo de la llamda es $5 pesos");
		} else if (tiempoLlamada >= 6 && tiempoLlamada <= 8) {
			System.out.println("El costo de la llamda es de $10 pesos");
		} else if (tiempoLlamada <= 4) {
			System.out.println("El costo de la llamada es de $3.5 pesos");
		} else {
			System.out.println("Se extendio el limite de la llamada costo $35 pesos");
		}
	}
}
