package Practica2array;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class run {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Exception E1 = new Exception("datos no encajan");
		Exception E2 = new Exception(
				"introduzca un numero positivo o mayor que cero");
		int c;
		int a;
		String al;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca el numero de clases\n");
		c = sc.nextInt();
		if (!positiva(c))
			throw E2;
		colegio cole = new colegio(null, c);
		System.out.print("Introduzca el numero de alumnos por clase\n");
		a = sc.nextInt();
		if (!positiva(a))
			throw E2;

		for (int i = 0; i < c; i++) {

			Clase clase = new Clase(null, a);
			cole.clase[i] = clase;

			for (int j = 0; j < a; j++) {

				System.out
						.println("Introduzca los  nombres de alumnos de la clase "
								+ (i+1) + "\n");
				Scanner texto = new Scanner(System.in);
				al = texto.nextLine();
				StringTokenizer palabras = new StringTokenizer(al);
				if (palabras.countTokens() < 3)
					throw E1;

				cole.clase[i].al[j] = Alumparser(al);

			}

		}

		Scanner men = new Scanner(System.in);
		int menu;
		do {

			System.out.println(" -----------------MENU----------------\n");
			System.out
					.println("0.Salir de la aplicacion\n"
							+ "1.Sacar por pantalla los alumnos de una clase\n"
							+ "2.Sacar por pantalla que clase pertenece un alumno\n"
							+ "3.Sacar por pantalla cuantos alumnos hay con el mismo primer apellido\n"
							+ "4.Sacar por pantalla cuantos alumnos hay en total\n"
							+ "5.Sacar por pantalla todos los alumnos del centro ordenados alfabeticamente por primer apellido\n");
			menu = men.nextInt();
			Scanner aux = new Scanner(System.in);
			int a1;
			String alum;

			switch (menu) {

			case 1:
				System.out.println(" indique la clase deseada\n");
				a1 = aux.nextInt();
				cole.alumnosDeUnaClase(a1);
				break; // te saca los alumnos que hay en una clase pedida
			case 2:
				System.out.println(" indique el alumno deseado\n");
				alum = aux.nextLine();
				int f = cole.claseAlumno(alum);
				if (f == -1)
					System.out.println(" alumno no encontrado\n");
				System.out.println(f);
				break; // te dice en que clase esta un alumno pedido
			case 3:
				System.out.println(" escriba el apellido\n");
				alum = aux.nextLine();
				cole.primerApellido(alum);
				break; // te saca cuantos los alumnos con apellidos iguales
			case 4:
				int t=0;
				for (int i=0; i<cole.clase.length; i++) {
					 cole.alumnosDeUnaClase(i);
					 t++;
				}	
				System.out.println(" Los alumnos totales en el colegio son: "
						 + t);
				break; // te saca el total de alumnos en el colegio
			case 5:
				String [] array = new String [cole.totalAlumnos()];
				for (int i=0; i<cole.clase.length; i++) {
				
				
				}
				Arrays.sort(array);
				for (String i : array) {
					System.out.println(i + " ");
				}
				
				break;

			}

		} while (menu != 0);

	}

	public static boolean positiva(int n) {
		if (n > 0)
			return true;
		return false;

	}

	public static Alumno Alumparser(String al) {
		String[] total = al.split(" ");
		return new Alumno(total[0], total[1], total[2]);

	}

}