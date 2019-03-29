package Ej.navidad;

import java.util.Scanner;

public class contraseña {
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		String clave="2560";
		int intento=3, volver=0;
		do {
			System.out.println("Introduce la contraseña");
			String contraseña=teclado.next();
			if(clave.equals(contraseña)){
				System.out.println(" ENHORABUENA la contraseña es correcta");
				volver=0;
			}
			else {
				System.out.println( " Contraseña incorrecta ");
				intento--;			
				volver=1;
			}
		}while(volver==1 && intento>0); 
		if (intento==0){
			System.out.println( " Bloqueado ");
		}

}
}