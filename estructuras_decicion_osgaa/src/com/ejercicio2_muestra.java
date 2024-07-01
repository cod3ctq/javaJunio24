package com;

import java.util.Scanner;

public class ejercicio2_muestra {
public static void main(String[] args) {
	Scanner numero = new Scanner(System.in);
	
	
	System.out.println("Digita 3 numero");
	
	int a = numero.nextInt();
	int b = numero.nextInt();
	int c = numero.nextInt();
	
	if (a>b && b>c && c<a ) {
		System.out.println("Los numeros de mayor a menor1: " + a + b + c);
}else if(a<b && b<c && c>a && a<b){
	System.out.println("Los numeros de mayor a menor2: " + c + b + a);
}else if(b>a && a>c ) {
	System.out.println("Los numeros mayores son3: " + b + a + c);
}else if(a>b && c>b ) {
	System.out.println("Los numeros mayores son4: " + a + c + b);
}else if(a<b && c<b ) {
	System.out.println("Los numeros mayores son5: " + b + c + a);
}
	
	}
}
