package com;

import java.util.Scanner;

public class problema11_if_else {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
   

   
    System.out.print("Ingrese su peso en kilogramos (kg): ");
    double peso = sc.nextDouble();


    System.out.print("Ingrese su altura en metros (m): ");
    double altura = sc.nextDouble();

   
    double imc = peso / (altura * altura);



    if (imc < 18.5) {
        System.out.println("Bajo peso");
    } else if (imc >= 18.5 && imc < 24.9) {
        System.out.println("Peso normal");
    } else if (imc >= 24.9 && imc < 29.9) {
        System.out.println("Sobrepeso");
    } else {
        System.out.println("Obesidad");
    }


    System.out.println("IMC: " + imc);
   
}
}
