package Ej.navidad;

import java.util.Scanner;

public class contrase�a {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		String clave="2560";
		int intento=3, volver=0;
		do {
			System.out.println("Introduce la contrase�a");
			String contrase�a=teclado.next();
			if(clave.equals(contrase�a)){
				System.out.println(" ENHORABUENA la contrase�a es correcta");
				volver=0;
			}
			else {
				System.out.println( " Contrase�a incorrecta ");
				intento--;			
				volver=1;
			}
		}while(volver==1 && intento>0); 
		if (intento==0){
			System.out.println( " Bloqueado ");
		}

}
}