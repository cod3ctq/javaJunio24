package COM;

public class Trasponer {
public static  void main(String[] args) {
	int[][] vieja = {{3,4,2},{3,2,5}};
	
	int[][] nueva ;  
	
	 for (int i = 0; i < vieja.length; i++) {
         for (int j = 0; j < vieja[0].length; j++) {
             vieja[j][i] = nueva[i][j];
         }
     }

	 System.out.println("\nMatriz Transpuesta:");
     for (int i = 0; i < vieja.length; i++) {
         for (int j = 0; j < vieja[0].length; j++) {
             System.out.print(nueva[j][i] + " ");
         }
         System.out.println();
     }

    
}

}