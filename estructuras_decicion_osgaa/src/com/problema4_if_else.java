package com;

import java.util.Scanner;

public class problema4_if_else {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	
	System.out.println("Programa de aceptacion");
	
	System.out.println("Ingresa tu nota: ");
	int nota = sc.nextInt();
	
	System.out.println("ingresa tu edad: ");
	int edad = sc.nextInt();
	
	System.out.println("Ingrsa (M)para hombre o (F)para mujer");
	char sexo = sc.next().charAt(0);
	
	
	
		if (nota >= 5 && edad >= 18) {
        if (sexo == 'M') {
            System.out.println("POSIBLE");
        } else if (sexo == 'F') {
            System.out.println("ACEPTADA");
        } else {
            System.out.println("NO ASEPTADA");
        }
    } else {
        System.out.println("NO ASEPTADA");
    }
}
}
