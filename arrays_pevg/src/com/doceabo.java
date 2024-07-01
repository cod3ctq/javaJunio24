package com;

import java.util.*;

public class doceabo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce tu peso ");
		double peso = scanner.nextDouble();
		System.out.println("Introduce tu altura en cm");
		double alturaCM = scanner.nextDouble();
		double alturaM = alturaCM / 100.0;
		double imc = peso / (alturaM * alturaM);
		if (imc < 16) {
			System.out.println("Tu IMC es de " + imc + " Por lo que debes ir al hospital");
		} else {
			System.out.println("Tu IMC es de " + imc + " Estas bien de salud");
		}

	}

}
