package com;

import java.util.Scanner;

public class problema2_if_else {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingresa un número entero");
	
	int num = sc.nextInt();
	
	if(num % 2 == 0) {
		System.out.println("El numero es PAR");
	}else {
		System.out.println("El numero es IMPAR");
	}
}
}
