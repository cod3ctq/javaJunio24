package com;

import java.util.Scanner;

public class tercero {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe el primer numero:");
		double a = scanner.nextInt();

		System.out.println("Escribe el segundo numero:");
		double b = scanner.nextInt();

		double divicion = 0;
		//System.out.println(divicion);
		if (b == 0) {
			System.out.println("Error 404 - NotFound");
		} else {
			double c = a / b;
			System.out.println(c);
		}

	}

}
