package examenEEDD;

public class Main {
	
	/*
	 * Pre:
	 * Post: Inicializa el código Java que se encarga de visualizar una matriz de 5x5
	 * 		 y mostrar su diagonal principal y secundaria.
	 */
	public static void main (String[] args) {
	    int[][] matriz = new int[5][5];
	    OperacionesArrays.Inicializar(matriz);
	    OperacionesArrays.visualizarmatriz(matriz);
	    int[] diagoprincipal = new int[matriz.length];
	    int[] diagosecundaria = new int[matriz.length];
	    for(int i=0;i<matriz.length;i++) { // Rellenamos la matriz de 5x5
	        for(int j=0;j<matriz[i].length;j++) {
	            if(i==j) {
	            	diagoprincipal[i] = matriz[i][j];
	            }	                
	            if(i+j == matriz.length-1) {
	            	diagosecundaria[i] = matriz[i][j];
	            }
	        }
	    }
	    System.out.println("\nDiagonal Principal"); // Mostramos la diagonal principal y secundaria de la matriz 5x5
	    OperacionesArrays.visualizararray(diagoprincipal); 
	    System.out.println("\n\nDiagonal Secundaria");
	    OperacionesArrays.visualizararray(diagosecundaria);
	    System.out.println("\n\n");
	}
}
