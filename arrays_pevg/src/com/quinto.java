package com;

import java.util.Scanner;

public class quinto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe tu edad:");
		int edad = scanner.nextInt();

		System.out.println("Escribe tu nota:");
		int nota = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Escribe tu sexo M/F:");
		char sexo = scanner.nextLine().charAt(0);

		if (edad >= 18 && nota >= 5 && (sexo == 'M' || sexo == 'm')) {
			System.out.println("POSIBLE");
		} else if (edad <= 17 && nota <= 5 && (sexo == 'F' || sexo == 'f')) {
			System.out.println("ACEPTADA");
		} else {
			System.out.println("No aceptada");
		}
	}

}
