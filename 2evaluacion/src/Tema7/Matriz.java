package Tema7;

import java.util.Scanner;

public class Matriz {
	 private static int[][] matriz;

	public static void main (String[] args) {
		Scanner entradaDatosMatriz = new Scanner(System.in);
        int[][] nombres = new int[3][3];
        System.out.println("Ingrese datos de la matriz de 3x3");
        for (int h = 0; h < nombres.length; h++) {
            for (int j = 0; j < nombres.length; j++) {
                System.out.print("nombres[" + h + "][" + j + "]: ");
                nombres[h][j] = entradaDatosMatriz.nextInt();
            }
        }
        entradaDatosMatriz.close();
        System.out.println("\nMatriz ForEach");
        for (int [] num : nombres) {
            for (int elem : num) {
                System.out.print(elem + "\t"); // Tabulador
            }
            System.out.print("\n"); // Salto de Línea
		
	}
          
}
	}
