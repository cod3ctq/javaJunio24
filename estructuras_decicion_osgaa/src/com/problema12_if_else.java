package com;

import java.util.Scanner;

public class problema12_if_else {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	
	double centro = 0;
	double comedor = 0;
	double bolsa = 0;
	
	System.out.println("Escribe el monto de la donación");
	double donacion = sc.nextInt();
	
	 if (donacion >= 10000) {
         
         centro = 0.3 * donacion;
         comedor = 0.5 * donacion;
         bolsa = donacion - centro - comedor;
     } else {
         
         centro = 0.25 * donacion;
         comedor = 0.6 * donacion;
         bolsa = donacion - centro - comedor;
     }
	 
	 System.out.println("Monto centro de salud: " + centro +","+ " monto de niños: " + comedor+"," + " Monto de Bolsa: " + bolsa);
}
}
