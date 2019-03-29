package Ej.navidad;

import java.util.Scanner;

public class sustituirletra {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un texto");
		String texto=teclado.nextLine();
		System.out.println("Introduce una letra del texto anterior");
		String letra=teclado.nextLine();
		System.out.println("Introduce otra letra");
		String otraletra=teclado.nextLine();
		texto=texto.replace(letra,otraletra);
		System.out.println("Texto con letra sustituida: " + texto);
		

}
}