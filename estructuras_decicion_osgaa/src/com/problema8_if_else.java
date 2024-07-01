package com;

import java.util.Scanner;

public class problema8_if_else {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Dias de la semana");
	
	
	System.out.println("Digita un numero del 1 al 7 para que te diga el día");
	int dia = sc.nextInt();
	
	

    
    switch (dia) {
        case 1:
            System.out.println("El día " + dia + " es Lunes.");
            break;
        case 2:
            System.out.println("El día " + dia + " es Martes.");
            break;
        case 3:
            System.out.println("El día " + dia + " es Miércoles.");
            break;
        case 4:
            System.out.println("El día " + dia + " es Jueves.");
            break;
        case 5:
            System.out.println("El día " + dia + " es Viernes.");
            break;
        case 6:
            System.out.println("El día " + dia + " es Sábado.");
            break;
        case 7:
            System.out.println("El día " + dia + " es Domingo.");
            break;
        default:
            System.out.println("Error.. No existe el día");
    }

    
}

	
	
}

