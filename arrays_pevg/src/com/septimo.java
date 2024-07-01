package com;

import java.util.Scanner;

public class septimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Cuantos alumnos vas a ir (Aclarando que si son menos de 30 se cobra la renta completa)?");
		int alumnos = scanner.nextInt();
		int precio;
		String valor = "Euros";
		if (alumnos >= 100) {
			precio = 65;
			System.out.println("El precio por alumno queria en: " + precio);
		}
		if (alumnos >= 50 && alumnos <= 99) {
			precio = 70;
			System.out.println("El precio por alumno queria en: " + precio);
		}
		if (alumnos >= 30 && alumnos <= 49) {
			precio = 95;
			System.out.println("El precio por alumno queria en: " + precio);
		}
		if (alumnos < 30) {
			precio = 4000;
			System.out.println("Como son pocos estudiantes el precio por camion seria de " + precio);
		}
	}

}
