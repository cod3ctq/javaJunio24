package com;

import java.util.Scanner;

public class Problema3_if_else {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Digita dos numeros");
	
	int num1= sc.nextInt();
	int num2 = sc.nextInt();
	
	if(num1 / num2 == 0) {
		System.out.println("ERROR AL DIVIDIR");
	}else {
		System.out.println("La divicion es " + (num1/num2));
	}
}
}
