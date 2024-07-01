package com;

public class problema6_for {
public static void main(String[] args) {
	
	
	int res =0;
	
	for( int i = 0; i<= 1000; i++) {
		if( i == 1000*2/100 ) {
			res= (i*12)+1000;
		}
	}
	System.out.println(res);
}
}