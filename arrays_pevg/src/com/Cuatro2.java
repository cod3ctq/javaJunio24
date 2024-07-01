package com;

import java.util.Scanner;

public class Cuatro2 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
			String palabra;
			char caracter;

			System.out.println("escribe la palabra o frase");
			palabra = scanner.nextLine();
			
			System.out.println("escribe el caracter");
			caracter = scanner.next().charAt(0);
			
			int contador = 0;
			
			for (int i = 0; i < palabra.length(); i++) {
				
				if (palabra.charAt(i) == caracter) {
					contador++;
					
					System.out.println(contador);
				}
			}
		}

	}
}