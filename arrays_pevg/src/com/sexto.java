package com;

import java.util.Scanner;

public class sexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Define el precio de la uva:");
		double precio = scanner.nextInt();
		scanner.nextLine();

		System.out.println("De que tipo te gustaria A o B");
		char tipo = scanner.nextLine().charAt(0);

		System.out.println("Que tamaño te gustaria 1 o 2");
		int tamano = scanner.nextInt();

		if ((tipo == 'A' || tipo == 'a') && tamano == 1) {
			precio += .20;
			System.out.println("El precio final de tu uva quedaria en: " + precio);
		} else if ((tipo == 'A' || tipo == 'a') && tamano == 2) {
			precio += .30;
			System.out.println("El precio final de tu uva quedaria en: " + precio);
		}
		
		
		
		else if ((tipo == 'B' || tipo == 'b') && tamano == 1) {
			precio = precio - .30;
			System.out.println("El precio final de tu uva quedaria en: " + precio);
		} else if ((tipo == 'B' || tipo == 'b') && tamano == 2) {
			precio = precio - .50;
			System.out.println("El precio final de tu uva quedaria en: " + precio);
		} else {
			System.out.println("No escogiste un tipo de uva adecuado o el tamañano no existe");
		}

	}

}
