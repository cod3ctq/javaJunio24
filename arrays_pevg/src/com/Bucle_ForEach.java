package com;
import java.util.*;

public class Bucle_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] palabras = {"hola", "pedro", "bocina","bocinas"};
//		
//		for (String palabra : palabras) {
//			
//			System.out.println(palabra);
//			
//		}
		
//		Double[] numeros = {1.157,2.49,3.2,4.58,5.598};
//		
//		double suma = 0;
//		
//		for(double numero : numeros) {
//			
//			suma += numero;
//			
//			System.out.println("El numero siguiente: " + numero );
//			System.out.println("La suma acumulada es: " + suma);
//		}
		
//		List<Integer> numeros = new ArrayList<>();
//		
//		numeros.add(2);
//		numeros.add(4);
//		numeros.add(5);
//		
//		List<Integer> dobleNumeros = new ArrayList<>();
//		
//		for(int numero : numeros) {
//			
//			dobleNumeros.add(numero * 2 );
//			
//			System.out.println(dobleNumeros);
//		}
		
		
		Map<String, Integer> cosas = new HashMap<>();
		
		cosas.put("palo", 6);
		cosas.put("bocina", 8);
		cosas.put("galletas", 23);
		cosas.put("plumon", 79);
		
		for(Map.Entry<String, Integer> entry : cosas.entrySet() ) {
			if (entry.getValue()>18) {
				System.out.println(entry.getKey());
			}
		}
		
		
	}

}
