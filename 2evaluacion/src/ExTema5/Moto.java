package ExTema5;

import java.util.Scanner;

public class Moto extends Vehiculo {
	int cilindrada = 0;

	public int getcilindrada() {
		return cilindrada;
	}

	public void setcilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int limiteVelocidad() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una velocidad para la moto");
		int velocidad=teclado.nextInt();
		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Introduce una cilindrada para la moto");
		int cilindrada=teclado.nextInt();
		
		int limitevel = 0;
		if (cilindrada < 250 && velocidad > 120) {
			System.out.println("La velocidad es mayor a 120: ");
			limitevel = 1;
		}
		if (cilindrada < 250 && velocidad <= 120) {
			System.out.println("La velocidad es menor o igual a 120: ");
			limitevel = 0;
		}
		if (cilindrada > 250 && velocidad > 160) {
			System.out.println("La velocidad es mayor a 160: ");
			limitevel = 1;
		}
		if (cilindrada > 250 && velocidad <= 160) {
			System.out.println("La velocidad es menor o igual a 160: ");
			limitevel = 0;
		}
		return limitevel;

	}

	public int avisoVelocidad() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una velocidad para la moto");
		int velocidad=teclado.nextInt();
		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Introduce una cilindrada para la moto");
		int cilindrada=teclado.nextInt();
		
		if (cilindrada < 250 && velocidad > 120) {
			System.out.println("****Cuidado, ha superado la velocidad máxima****");
		}
		if (cilindrada > 250 && velocidad > 160) {
			System.out.println("****Cuidado, ha superado la velocidad máxima****");
		}
		return velocidad;
	}

}
