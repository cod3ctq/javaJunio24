package com;

import java.util.Scanner;

public class problema5_if_else {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Asociacion de vinicultores");
	
	
	
	System.out.println("Ingresa el precio inicial: ");
	
	double presio = sc.nextDouble();
	
	System.out.println("Anota la clasificacion  A/B ");
	String clasi = sc.next();
	
	System.out.println("Ingresa el tamaño 1 o 2");
	int tamaño = sc.nextInt();
	
	if(clasi.equalsIgnoreCase("A")  && tamaño == 1) {
		System.out.println("El presio es " + (presio + .20 ));
	}else if(clasi.equalsIgnoreCase("A")  && tamaño == 2) {
		System.out.println("El presio es " + (presio + .30 ));
	}else if(clasi.equalsIgnoreCase("B")  && tamaño == 1) {
		System.out.println("El presio es " + (presio - .30 ));
	}else if (clasi.equalsIgnoreCase("B")  && tamaño == 2) {
		System.out.println("El presio es " + (presio - .50 ));
	}
	sc.close();
}
}
