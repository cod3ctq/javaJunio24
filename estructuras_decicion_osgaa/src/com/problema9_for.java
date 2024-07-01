package com;

import java.util.Scanner;

public class problema9_for {
public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	
	System.out.println("Ingresa el primer numero");
	int num1 = sc.nextInt();
	System.out.println("Ingresa el segundo numero");
	int num2 = sc.nextInt();
	int contador= 0;
	
	for (int i = num1; i < num2; i++) {
		contador= i;
		if(contador % 2 == 0) {
			System.out.println(contador);
		}
	}
}
}
