package com;

public class Class02 {
	public static void main(String[] args) {
		
		
		Object[][] Array1 = {
            { "1", "2", "3", "4" },
            { "5", "6", "7", "8" },
            { "9", "10", "11", "12" },
            { "a", "14", "15", "16" }
        };

		Object[][] Array2 = {
                { "a", "2", "3", "4" },
                { "5", "f", "7", "8" },
                { "9", "10", "11", "12" },
                { "13", "14", "15", "16" }
        };
		Object[][] Array3 = new Object[Array1.length][Array2.length];
        
//**********************************************************************************************************
		// i= columnas?
		// j= filas?
		// 0= inicio
		
		
        for (int i = 0; i < Array1.length; ++i) {
            for (int j = 0; j < Array1[i].length; ++j) {
                System.out.print(" " + Array1[i][j] + " "); }
            		System.out.println();
        
} System.out.println();

        for (int i = 0; i < Array2.length; ++i) {
            for (int j = 0; j < Array2[i].length; ++j) {
                System.out.print(" " + Array2[i][j] + " "); }
            		System.out.println();
       
} System.out.println();


//***********************************************************************************
        
        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array1[i].length; j++) {
                try {
                    int value1 = Integer.parseInt((String) Array1[i][j]);
                    int value2 = Integer.parseInt((String) Array2[i][j]);
                    Array3[i][j] = value1 + value2;
                } catch (NumberFormatException e) {
                    Array3[i][j] = "0";
                }
            }
        }
       for (int i = 0; i < Array3.length; ++i) {
            for (int j = 0; j < Array3[i].length; ++j) {
                System.out.print(" " + Array3[i][j] + " ");
            }
            System.out.println();
        }
    }
}