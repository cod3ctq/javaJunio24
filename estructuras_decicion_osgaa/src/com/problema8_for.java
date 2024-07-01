package com;

import java.util.Iterator;
import java.util.Scanner;

public class problema8_for {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 int res;
	
	System.out.println("Ingresa el primer numero");
	int num1 = sc.nextInt();
	System.out.println("Ingresa el segundo numero");
	int num2 = sc.nextInt();
	 int contador = 0;
	 
	 
	

	 if(num1 <= num2) {
		 for (int i = num1; i <= num2; i++) {
				contador = (i);
				System.out.println(contador);
	 }
	
	}	else if(num2 <= num1) {
		 for (int i = num2; i <= num1; i++) {
				contador = (i);
				System.out.println(contador);			
	 }
	}
}}