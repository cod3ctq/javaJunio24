package com;

public class Principal {

	public static void main(String[] args) {
		// DECIONES BASICAS
		
		int dinero = 400;
		
		//System.out.println(dinero>4565);
		
		
		if (dinero>=1500) {
			System.out.println("Cine, parque, kfc, uber");
			if (dinero>100 && dinero<300) {
				System.out.println("tacos");
			}
		}else if(dinero>=1200){
			System.out.println("Cine, kfc, uber");
		}else if(dinero>= 800) {
			System.out.println("cine, uber");
		}else  if(dinero>500){
			System.out.println("Cine");
		}else {
			System.out.println("No salimos");
		}

	}

}
