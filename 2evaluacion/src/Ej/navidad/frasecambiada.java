package Ej.navidad;

import java.util.Scanner;

public class frasecambiada {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase=teclado.nextLine();
		String fraseinvertida="";
		for(int x=frase.length()-1; x>=0 ; x--) {
			char car=frase.charAt(x);
			fraseinvertida+=car;
		}
		System.out.print("La frase invertida es: " + fraseinvertida);

}
}
