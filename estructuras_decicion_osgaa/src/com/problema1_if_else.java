package com;

import java.util.Scanner;

public class problema1_if_else {
public static void main(String[] args) {
	Scanner num = new Scanner(System.in);

	
	System.out.println("ingresa 2 numeros: ");
	int num1 = num.nextInt();
	int num2 = num.nextInt();
	
	if(num1>num2) {
		System.out.println("El número mayor es: " + num1 );
	}else {
		System.out.println("El número mayor es: " + num2);
	}
	
}
}
