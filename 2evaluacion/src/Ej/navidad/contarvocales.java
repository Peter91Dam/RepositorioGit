package Ej.navidad;

import java.util.Scanner;

public class contarvocales {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase=teclado.nextLine();
		int a=0,e=0,i=0,o=0,u=0;
		for(int x=0; x<frase.length(); x++) {
		
			if(frase.charAt(x)=='a' || frase.charAt(x)=='A'){
				a++;
			}
			if(frase.charAt(x)=='e' || frase.charAt(x)=='E'){
				e++;
			}
			if(frase.charAt(x)=='o' || frase.charAt(x)=='O'){
				o++;
			}
			if(frase.charAt(x)=='i' || frase.charAt(x)=='I'){
				i++;
			}
			if(frase.charAt(x)=='u' || frase.charAt(x)=='U'){
				u++;
			}
			
		}
		System.out.println("cantidad de a "+a);
		System.out.println("cantidad de e "+e);
		System.out.println("cantidad de i "+i);
		System.out.println("cantidad de o "+o);
		System.out.println("cantidad de u "+u);
	}

}
