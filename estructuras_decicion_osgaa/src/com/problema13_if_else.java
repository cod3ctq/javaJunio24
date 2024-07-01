package com;

import java.util.Scanner;

public class problema13_if_else {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Ingresa el numero total de horas");
	
	double horas = sc.nextDouble();
	double extras= 0;
	
	
	
	if(horas <= 40) {
		System.out.println("El pago es de: " + horas * 16);
	}else if(horas >= 40) {
		extras = horas - 40;
		System.out.println(40*16 + extras * 20);
	}
}
}
