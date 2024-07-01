package com;

public class ejercicio1 {

	public static void main(String[] args) {
		
//		String loza = "loza";
//		
//		int largo =  201;
//		int ancho = 220;
//		
//		if (largo == 200 && ancho == 200 ) {
//			System.out.println("Compralo");
//		}else if (largo == 200 && ancho == 210) {
//			System.out.println("Nos puede servir, pero se recorta");
//		}else if ( ancho >= 201 && ancho <= 209 && largo == 200 ) {
//			System.out.println("La " + loza + " esta demaciado grande");
//		}else{
//			System.out.println("Ve a otra tienda porque el " + loza + " No encaja" );
//		}
		
		String Perro = "Firulais";
		boolean Pelo = true;
		boolean Rabia = true;
		int Peso = 50;
		int patas = 4;
		double altura = 0.30;
		
		if ((Pelo && Rabia) == false  && Peso ==50 && patas == 4 && altura == .30) {
			System.out.println( Perro + " es perfecto");
			
		}else if (!Pelo) {
			System.out.println("Sin pelo no me gusta");
			
		}else if (Pelo && (altura >=.20 && altura <=.30) || (Pelo && Rabia == false && patas == 4) ) {
			System.out.println(Perro + " esta semi perfecto");
		}if (Rabia) {
			System.out.println("La Rabia me da miedo");
		}if (patas <4) {
			System.out.println("No me gustan los perros cojos");
		}if (altura >.30 || Peso >50){
			System.out.println("El perro esta muy alto y/o gordo");
		}else {
			System.out.println("Vamos a otra veterinaria");
		}
		
	}

}
