package com;

import java.util.Scanner;

public class ejercicio6_while_1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int numero = scanner.nextInt();
	
	while(numero<= 50)
	{
		System.out.println("ingrese sus numeros");
		numero=scanner.nextInt();
	}
}
}
