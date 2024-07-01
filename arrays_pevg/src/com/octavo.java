package com;

import java.util.Scanner;

public class octavo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce un numero del 1 al 6 de acuerdo a las caras de un dado");
		int cara = scanner.nextInt();

		switch (cara) {
		case 1: {

			System.out.println("La cara contraria seria seis");
		}
			break;
		case 2: {
			System.out.println("La cara contraria seria cinco");
		}
			break;
		case 3: {
			System.out.println("La cara contraria seria cuatro");
		}
			break;
		case 4: {
			System.out.println("La cara contraria seria tres");
		}
			break;
		case 5: {
			System.out.println("La cara contraria seria dos");
		}
			break;
		case 6: {
			System.out.println("La cara contraria seria uno");
		}
			break;
		default:
			System.out.println("El numero no coincide con las caras de los dados: ");
		}

//		int num1 = 1;
//		int num2 = 2;
//		int num3 = 3;
//		int num4 = 4;
//		int num5 = 5;
//		int num6 = 6;
//
//		if (cara == 1) {
//			System.out.println("Escogiste el numero " + cara + " Su opuesta cara es: " + num6);
//		} else if (cara == 2) {
//			System.out.println("Escogiste el numero " + cara + " Su opuesta cara es: " + num5);
//		} else if (cara == 3) {
//			System.out.println("Escogiste el numero " + cara + " Su opuesta cara es: " + num4);
//		} else if (cara == 4) {
//			System.out.println("Escogiste el numero " + cara + " Su opuesta cara es: " + num3);
//		} else if (cara == 5) {
//			System.out.println("Escogiste el numero " + cara + " Su opuesta cara es: " + num2);
//		} else if (cara == 6) {
//			System.out.println("Escogiste el numero " + cara + " Su opuesta cara es: " + num1);
//		} else {
//			System.out.println("ERROR: número incorrecto");
//		}

	}

}
