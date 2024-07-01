package com;

public class Principal {

	public static void main(String[] args) {
		String caracteres = "b4e5vn59m0j98nb363¡()/#¡¡#$b5u4/(6v5y79Ñ%24v565823440¿204245JO/23t*&/M(O/c234";

		String numeros = "0123456789";
		int[] conteo = new int[10];
		StringBuilder residuo = new StringBuilder();

		for (int i = 0; i < caracteres.length(); i++) {
			char c = caracteres.charAt(i);

			if (numeros.indexOf(c) >= 0) {
				conteo[numeros.indexOf(c)]++;
			} else {
				residuo.append(c);
			}
		}

		// Imprimir el conteo de dígitos y el residuo
		System.out.println("Conteo de dígitos:");
		for (int i = 0; i < conteo.length; i++) {
			System.out.println("Dígito " + i + ": " + conteo[i]);
		}

		System.out.println("Residuo: " + residuo.toString());
	}
}
