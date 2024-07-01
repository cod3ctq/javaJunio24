package com;

import java.util.Scanner;

public class problema6_if_else {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingresa los alumnos");
	int numalumnos = sc.nextInt();
	
	double costoalum;
	double pagocom;
	
	if(numalumnos >= 100) {
		costoalum=65;
		pagocom = numalumnos * costoalum;
		System.out.println("El pago es " + pagocom);
	}else if(numalumnos >= 50 && numalumnos <=99) {
		costoalum = 70;
		pagocom = numalumnos * costoalum;
		System.out.println("El pago es " + pagocom);
	}else if(numalumnos >= 30 && numalumnos <= 49) {
		costoalum = 95;
		pagocom = numalumnos * costoalum;
		System.out.println("El pago es " + pagocom);
	}else if(numalumnos <=29) {
		pagocom=4000;
		System.out.println("El pago es " + pagocom);
	}
}
}
