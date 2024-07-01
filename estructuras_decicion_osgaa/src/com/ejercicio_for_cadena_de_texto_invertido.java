package com;

public class ejercicio_for_cadena_de_texto_invertido {
public static void main(String[] args) {
	
	
	String cadena = "hola java desde spring";
	
	String reverza = "";
	
	for(int i = cadena.length()-1; i>=0; i--) {
		reverza= reverza + Character.toString(cadena.charAt(i));
	}
	
	System.out.println(reverza);
}
}
