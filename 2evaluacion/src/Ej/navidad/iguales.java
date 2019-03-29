package Ej.navidad;

import java.util.Scanner;

public class iguales {
	public static void main (String[] args) {
		
	 Scanner teclado = new Scanner(System.in);
	 int intento=3, volver=0;
	 System.out.println("Introduce la palabra1");
		String palabra1=teclado.next();
	 String palabra=palabra1;
		do {
			System.out.println("Introduce la palabra2");
			String palabra2=teclado.next();
			
			System.out.println("Comparamos las palabras");		
			
			if(palabra.equalsIgnoreCase(palabra2)) {
				System.out.println(" Si son iguales ");
				System.out.println(" ");
				System.out.println("Si quieres seguir comparando pulsa 1");
				System.out.println("Terminar pulsa 2");
				volver=teclado.nextInt();
			}
			else {
				System.out.println( " No son iguales, vuelve a escribir ");
				volver=1;
			}
		}while(volver==1); 
	 
}
}