package ExTema5;

import java.util.Scanner;

public abstract class Vehiculo {
    int velocidad;
	int peso;

	public Vehiculo() {
		velocidad = 0;
		peso = 1000;
	}

	public int getvelocidad() {
		return velocidad;
	}

	public void setvelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getpeso() {
		return peso;
	}

	public void setpeso(int peso) {
		this.peso = peso;
	}

	public int limiteVelocidad() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una velocidad para el vehiculo");
		int velocidad=teclado.nextInt();
		int limitevel=0;
		if (velocidad > 100) {
			System.out.println("La velocidad es mayor a 100: ");
		 limitevel=1;
		}
		if (velocidad <= 100) {
			System.out.println("La velocidad es menor o igual a 100: ");
		limitevel=0;
		}
		return limitevel;

	} 

	public abstract int avisoVelocidad();

}
