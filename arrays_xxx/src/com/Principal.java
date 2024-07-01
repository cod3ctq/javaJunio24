package com;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		//Arrays - estructuras de datos estáticas
		
		//1
		Integer[] nums = new Integer[10];
		System.out.println(Arrays.toString(nums));
		
		
		//añadirle valores
		nums[0] = 400;
		nums[1] = 4532;
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < nums.length-1; i++) {
			System.out.println("Añade un numero");
			nums[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(nums));
		
		Object[] varios = new Object[10];
		
		varios[0] = 30;
		varios[1] = "hola";
		varios[2] = false;
		varios[3] = 234.4;
		varios[5] = ';';
		varios[6] = new Integer("678");
		varios[7] = 495892387592834l;
		
		
		
		
		String caracteres="b4e5vn59m0j98nb363¡()/#¡¡#$b5u4/(6v5y79Ñ%24v565823440¿204245JO/23t*&/M(O/c234";
		
		//2
		
		
		
		
		
		
	}

}
