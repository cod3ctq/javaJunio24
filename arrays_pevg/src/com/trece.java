package com;

import java.util.*;

public class trece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe la cantidad de donación ");
		int donacion = scanner.nextInt();
		int dona1 = 0;
		String institucion = "Centro de salud";
		String institucion2 = "Comedor de Niños";
		String institucion3 = "La bolsa";

		if (donacion >= 10000) {
			double destino = donacion * .30;
			System.out.println("Se destinara al " + institucion + " La cantidad de " + destino);
			double destino2 = donacion * .50;
			System.out.println("Se destinara al " + institucion2 + " La cantidad de " + destino2);
			double destino3 = donacion * .20;
			System.out.println("Se destinara al " + institucion3 + " La cantidad de " + destino3);
		}
		if (donacion < 10000) {
			double destino = donacion * .25;
			System.out.println("Se destinara al " + institucion + " La cantidad de " + destino);
			double destino2 = donacion * .60;
			System.out.println("Se destinara al " + institucion2 + " La cantidad de " + destino2);
			double destino3 = donacion * .15;
			System.out.println("Se destinara al " + institucion3 + " La cantidad de " + destino3);
		} else {
			System.out.println("Error: No ingresaste una cantida valida");
		}

	}

}
