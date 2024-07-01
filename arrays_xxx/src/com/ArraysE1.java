package com;

public class ArraysE1 {
	
	public static void main(String[] args) {
		
		String caracteres="b4e5vn59m0j98nb363¡()/#¡¡#$b5u4/(6v5y79Ñ%24v565823440¿204245JO/23t*&/M(O/c234";
		
		//0123456789
		String c="";
		String numeros="0123456789";  //-1
		int[] conteo = new int[10]; 
		String residuo ="";
		for (int i = 0; i < caracteres.length()-1; i++) {
			c = Character.toString(caracteres.charAt(i));		
			if(numeros.indexOf(c)>=0) {		//si el valor de c es un numero ....		
				//incremento el contador ....
				conteo[numeros.indexOf(c)]++;				
			}else {
				residuo = residuo + c;
			}			
		}
		
	}

}
