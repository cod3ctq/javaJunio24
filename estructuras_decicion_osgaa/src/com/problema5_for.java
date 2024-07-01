package com;

public class problema5_for {
public static void main(String[] args) {
	
	
	
	for(int h = 0; h<=23; h++) {
		for(int min = 0; min <=59; min++) {
			for(int seg = 0; seg<=60; seg++) {
				System.out.println(h + ":" + min + ":" + seg );
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		}
	}
}
}
