package com;

import java.util.Scanner;

public class prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int a , b , c ;
		
		
		System.out.println("Escribe el primero numero");
		a = scanner.nextInt();
		System.out.println("Escribe el segundo numero");
		b = scanner.nextInt();
		System.out.println("Escribe el tercer numero");
		c = scanner.nextInt();
		
		
		if (a > b && a > c) {
			if (c > b) {
				System.out.print(a + " " + c + " " + b);
			}else {
				System.out.print(a + " " + b + " " + c);
			}
		}
		if (b > a && b > c) {
			if (c > a) {
				System.out.print(b + " " + c + " " + a);
			}else {
				System.out.print(b + " " + a + " " + c);
			}
		}
		if (c > a && c > b) {
			if (b > a) {
				System.out.print(c + " " + b + " " + a);
			}else {
				System.out.print(c + " " + a + " " + b);
			}
		}
		
	}

}
