package ExTema5;

import java.util.Scanner;

public class Principal {
	
	public static void radar(Coche Jaguar, Moto Mt07, Camion Mercedes) {

		int limitecoche = Jaguar.limiteVelocidad();
		int limitemoto = Mt07.limiteVelocidad();
		int limitecamion = Mercedes.limiteVelocidad();
		
		System.out.println(limitecoche);
		System.out.println(limitemoto);
		System.out.println(limitecamion);
	}
	
	public static void main(String[] args) {

		Coche Jaguar = new Coche();
		final Moto Mt07 = new Moto();
		final Camion Mercedes = new Camion();
		
		Jaguar.limiteVelocidad();
		Mt07.limiteVelocidad();
		Mercedes.limiteVelocidad();
		
		Jaguar.avisoVelocidad();
		Mt07.avisoVelocidad();
		Mercedes.avisoVelocidad();
	}

}
