package com;

import java.util.Scanner;

public class problema7_if_else {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingresa el numero del dado");
	int numdado = sc.nextInt();
	
	String lop= "";
	
	if(numdado == 1) {
		lop = "seis";
		System.out.println("El numero opuesto de " + numdado + " es: " + lop);
	}else if (numdado == 2){
		lop = "cinco";
		System.out.println("El numero opuesto de " + numdado + " es: " + lop);
	}else if(numdado == 3) {
		lop = "cuatro";
		System.out.println("El numero opuesto de " + numdado + " es: " + lop);
	}else if(numdado == 4) {
		lop = "tres";
		System.out.println("El numero opuesto de " + numdado + " es: " + lop);
	}else if(numdado == 5) {
		lop = "dos";
		System.out.println("El numero opuesto de " + numdado + " es: " + lop);
	}else if(numdado == 6) {
		lop = "uno";
		System.out.println("El numero opuesto de " + numdado + " es: " + lop);
	}else if(numdado <= 0 || numdado >= 7){
		System.out.println("ERROR... numero incorrecto");
	}
	
}
}
