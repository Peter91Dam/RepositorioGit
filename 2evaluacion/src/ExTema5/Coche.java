package ExTema5;

import java.util.Scanner;

public class Coche extends Vehiculo {
	 int antiguedad=0;
	
	
	public int getantiguedad() {
		return antiguedad;
	}

	public void setvelocidad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int limiteVelocidad() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una velocidad para el coche");
		int velocidad=teclado.nextInt();
		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Introduce una antiguedad para el coche");
		int antiguedad=teclado.nextInt();
		int limitevel=0;
		if (antiguedad<10 && velocidad>120) {
			System.out.println("La velocidad es mayor a 120: " + 1);
			limitevel = 1;
		}
		if (antiguedad<10 && velocidad<=120) {
			System.out.println("La velocidad es menor o igual a 120: " + 0);
			limitevel = 0;
		}
		if (antiguedad>=10 && velocidad>130) {
			System.out.println("La velocidad es mayor a 130: " + 1);
			limitevel = 1;
		}
		if (antiguedad>=10 && velocidad<=130) {
			System.out.println("La velocidad es menor o igual a 130: " + 0);
			limitevel = 0;
		}
		return limitevel;
		
	}

	public int avisoVelocidad() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce una velocidad para el coche");
		int velocidad=teclado.nextInt();
		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Introduce una antiguedad para el coche");
		int antiguedad=teclado.nextInt();
		
		if (antiguedad < 10 && velocidad > 120) {
			System.out.println("****Cuidado, ha superado la velocidad máxima****");
		}
		if (antiguedad >= 10 && velocidad > 130) {
			System.out.println("****Cuidado, ha superado la velocidad máxima****");
		}
		return velocidad;
	}
}