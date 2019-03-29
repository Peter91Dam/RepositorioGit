package Ej.navidad;

import java.util.Scanner;

public class Nombre {

static Scanner sc = new Scanner(System.in); // El Scanner

/**
 * Separa la frase en palabras.
 * @param s La cadena a separar.
 * @return Cadena en partes.
 */
public static String[] separarFrase(String s) {
    int cp = 0; // Cantidad de palabras
     
    // Recorremos en busca de espacios
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == ' ') { // Si es un espacio
            cp++; // Aumentamos en uno la cantidad de palabras
        }
    }
     
    String[] partes = new String[cp + 1];
    for (int i = 0; i < partes.length; i++) {
        partes[i] = ""; // Se inicializa en "" en lugar de null (defecto)
    }
     
    int ind = 0; // Creamos un índice para las palabras
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == ' ') { // Si hay un espacio
            ind++; // Pasamos a la siguiente palabra
            continue; // Próximo i
        }
        partes[ind] += s.charAt(i); // Sino, agregamos el carácter a la palabra actual
    }
    return partes; // Devolvemos las partes
}
 
public static void main(String[] args) {
     
    System.out.print("Ingrese nombre y apellidos: ");
    String frase = sc.nextLine(); // Guardamos la frase o texto
    int i=0;
    
    String[] p = separarFrase(frase); // Separamos palabras
    String nuevacadena = "";
       
    for (i = 0; i < p.length; i++) {
    	nuevacadena += p[i].substring(0, 1).toUpperCase() + p[i].substring(1, p[i].length()).toLowerCase() + " ";    	
    	if (i==0) {System.out.println("Apellido 1: " + p[i+1]);
    	}
    	if (i==1) {System.out.println("Apellido 2: " + p[i+1]);
    	}
    	if (i==2) {System.out.println("Nombre: " + p[i-2]);
    	}
    }   
    System.out.println("");
    if (i==3) { System.out.println(nuevacadena);}    
}   
}
