package com;

import java.util.Scanner;

public class ejercicio_muestra {
public static void main(String[] args) {
	Scanner numero = new Scanner(System.in);
	

	System.out.println("Digita 2 numeros");
	int a  = numero.nextInt();
	int b = numero.nextInt();
	
	if (a>b) {
		System.out.println("El numero mayor es: " + a);
	}else {
		System.out.println("El numero mayor es: " + b);
	}
	
	
}
}
