package ExTema5;

import java.util.Scanner;

public class Camion extends Vehiculo {
	int carga = 0;

	public int getcarga() {
		return carga;
	}

	public void setcarga(int carga) {
		this.carga = carga;
	}

	public int getpeso() {
		return peso + carga;
	}

	public int limiteVelocidad() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una velocidad para el camion");
		int velocidad=teclado.nextInt();
		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Introduce una carga para el camion");
		int carga=teclado.nextInt();
		
		int limitevel = 0;
		if (getpeso() > 3500 && velocidad > 80) {
			System.out.println("El peso es mayor de 3500kg y la velocidad es mayor a 80: ");
			limitevel = 1;
		}
		if (getpeso() > 3500 && velocidad <= 80) {
			System.out.println("El peso es mayor de 3500kg y la velocidad es menor o igual a 80: ");
			limitevel = 0;
		}
		if (getpeso() <= 3500 && velocidad > 100) {
			System.out.println("El peso es menor o igual de 3500kg y la velocidad es mayor a 100: ");
			limitevel = 1;
		}
		if (getpeso() <= 3500 && velocidad <= 100) {
			System.out.println("El peso es menor o igual de 3500kg y la velocidad es menor o igual a 100: ");
			limitevel = 0;
		}
		return limitevel;

	}

	public int avisoVelocidad() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una velocidad para el camion");
		int velocidad=teclado.nextInt();
		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Introduce una carga para el camion");
		int carga=teclado.nextInt();
		
		if (getpeso() <= 3500 && velocidad > 100) {
			System.out.println("****Cuidado, ha superado la velocidad máxima****");
		}
		if (getpeso() > 3500 && velocidad > 80) {
			System.out.println("****Cuidado, ha superado la velocidad máxima****");
		}
		return velocidad;
	}
}
