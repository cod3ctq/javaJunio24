package com;

import java.util.*;

public class noveno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe el día de la semana en numero del 1 al 7");
		int semana = scanner.nextInt();

		switch (semana) {
		case 1: {

			System.out.println("Lunes");
		}
			break;
		case 2: {

			System.out.println("Martes");
		}
			break;
		case 3: {

			System.out.println("Miercoles");
		}
			break;
		case 4: {

			System.out.println("Jueves");
		}
			break;
		case 5: {

			System.out.println("Viernes");
		}
			break;
		case 6: {

			System.out.println("Sabado");
		}
			break;
		case 7: {

			System.out.println("Domingo");
		}
			break;

		default:
			System.out.println("Error: no existe ese dia de la semana");
		}

	}

}
