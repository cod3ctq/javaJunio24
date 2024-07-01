package com;

import java.util.Scanner;

public class problema10_if_else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Compania de transporte ");

		System.out.println("Ingresa el número correspondiente segun a donde va a mandar el paquete");
		System.out.println("_____________________________________");
		System.out.println("1 America del Norte");
		System.out.println("2 America del Central");
		System.out.println("3 America del Sur");
		System.out.println("4 Europa");
		System.out.println("5 Asia");
		System.out.println("_____________________________________");

		int pais = sc.nextInt();

		System.out.println("Anota los kilogramos del paquete");
		int kl = sc.nextInt();

		switch (pais) {
		case 1:
			
			System.out.println("Seleccionaste el país America del Norte" + "Total de kilogramos " + kl + " Total a pagar " + (kl * 24.00));
			break;
		case 2:
			System.out.println("Seleccionaste el país America del Central" + "Total de kilogramos " + kl + " Total a pagar " + (kl * 20.00));
			break;
		case 3:
			System.out.println("Seleccionaste el país America del Sur" + "Total de kilogramos " + kl + " Total a pagar " + (kl * 21.00));
			break;
		case 4:
			System.out.println("Seleccionaste el país de Europa" + "Total de kilogramos " + kl + " Total a pagar " + (kl * 10.00));
			break;
		case 5:
			System.out.println("Seleccionaste el país Asia" + "Total de kilogramos " + kl + " Total a pagar " + (kl * 18.00));
			break;
		
		default:
			System.out.println("Error.. No hay un pais existente");
		}
		if(kl >= 5) {
			System.out.println("No se puede mandar por el peso reglamentario");
		}
	}
}