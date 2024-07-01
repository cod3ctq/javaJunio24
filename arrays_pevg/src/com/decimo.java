package com;

import java.util.*;

public class decimo {

	public static void main(String[] args) {

		Map<Integer, String> meses = new HashMap<>();

		meses.put(1, "Enero");
		meses.put(2, "Febrero");
		meses.put(3, "Marzo");
		meses.put(4, "Abril");
		meses.put(5, "Mayo");
		meses.put(6, "Junio");
		meses.put(7, "Julio");
		meses.put(8, "Agosto");
		meses.put(9, "Septiembre");
		meses.put(10, "Octubre");
		meses.put(11, "Noviembre");
		meses.put(12, "Diciembre");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe el día del mes en numero del 1 al 12");
		int numeroMes = scanner.nextInt();

		if (numeroMes >= 1 && numeroMes <= 12) { // Obtener el nombre del mes correspondiente al número ingresado
			String nombreMes = meses.get(numeroMes);

			// Imprimir el nombre del mes
			System.out.println("El mes correspondiente al número " + numeroMes + " es: " + nombreMes);
		} else {
			System.out.println("Número de mes inválido. Debe ser un número entre 1 y 12.");
		}

	}

}
