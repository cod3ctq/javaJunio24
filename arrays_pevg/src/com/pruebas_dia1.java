package com;

import java.util.Scanner;

public class pruebas_dia1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new  Scanner(System.in);
		
		System.out.println("por favor escribe el primer numero");

		int numero = scanner.nextInt();
		System.out.println("por favor escribe el segundo numero");
		int numero2 = scanner.nextInt();
		
		int a = numero;
		int i = numero2;
		
		
		
		if (a > i) {
			
			System.out.println(a + " Es mayor que " + i);
		}else {
			System.out.println(i + " Es mayor que " + a);
		}
	}

}
