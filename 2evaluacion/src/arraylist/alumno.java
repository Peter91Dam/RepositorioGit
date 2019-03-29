package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class alumno {
	String nombre;
	String apellido1;
	String apellido2;
	int numclase;
	static ArrayList<alumno> array = new ArrayList<alumno>();
	static Scanner sc = new Scanner(System.in);

	public alumno(String nom, String ap1, String ap2, int numclase) {

		this.nombre = nom;
		this.apellido1 = ap1;
		this.apellido2 = ap2;
		this.numclase = numclase;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getNumclase() {
		return numclase;
	}

	public void setNumclase(int numclase) {
		this.numclase = numclase;
	}

	public static void main() {
		int c;
		int a;
		String nombre, apellido1, apellido2;

		

		System.out.print("Introduzca el numero de clases\n");
		c = sc.nextInt();

		System.out.print("Introduzca el numero de alumnos por clase\n");
		a = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < c; i++) {

			for (int j = 0; j < a; j++) {
				System.out.println("Introduce el nombre del alumno" + (j+1)+ "\n");
				nombre = sc.nextLine();
				System.out.println("Introduce el apellido 1 del alumno:" + (j+1)+ "\n");
				apellido1 = sc.nextLine();
				System.out.println("Introduce el apellido 2 del alumno:" + (j+1)+ "\n");
				apellido2 = sc.nextLine();

				array.add(new alumno(nombre, apellido1, apellido2, i));
			}
		}
		menu();
	}

	public static void menu() {

		Scanner men = new Scanner(System.in);
		int menu;

		System.out.println(" -----------------MENU----------------\n");
		System.out
				.println("0.Salir de la aplicacion\n"
						+ "1.Sacar por pantalla los alumnos de una clase\n"
						+ "2.Sacar por pantalla que clase pertenece un alumno\n"
						+ "3.Sacar por pantalla cuantos alumnos hay con el mismo primer apellido\n"
						+ "4.Sacar por pantalla cuantos alumnos hay en total\n"
						+ "5.Sacar por pantalla todos los alumnos del centro ordenados alfabeticamente por primer apellido\n");
		menu = men.nextInt();

		switch (menu) {

		case 1:
			alumnosclase();
			break; // te saca los alumnos que hay en una clase pedida
		case 2:
			clase();
			break; // te dice en que clase esta un alumno pedido
		case 3:
			apellidoigual();
			break; // te saca cuantos los alumnos con apellidos iguales
		case 4:

			break; // te saca el total de alumnos en el colegio
		case 5:

			break;
		default:
			System.out.println("Introduce numeros del 1 al 5");
			break;

		}

	}

	public static void alumnosclase() {
		int d;
		System.out.println("Introduce la clase para ver los alumnos que tiene: \n");
		d= sc.nextInt();
		for(int i=0;i<array.size();i++) {
			if(array.get(i).getNumclase()==d-1) {
				System.out.println(array.get(i).getNombre()+" "+ array.get(i).getApellido1()+" "+array.get(i).getApellido2());
			}
		
		}
	}
		
	public static void clase() {
		String nombre;
		String apellido1;
		String apellido2;
		System.out.println("Introduce el nombre del alumno: \n");
		nombre = sc.nextLine();
		System.out.println("Introduce el apellido 1: \n");
		apellido1 = sc.nextLine();
		System.out.println("Introduce el apellido 2: \n");
		apellido2 = sc.nextLine();
		for(int i=0;i<array.size();i++) {
			if(array.get(i).getNombre().equals(nombre) && array.get(i).getApellido1().equals(apellido1) && array.get(i).getApellido2().equals(apellido2)) {
				System.out.println(array.get(i).getNumclase()+1);
			}
		
		}
			
	}
	
	public static void apellidoigual() {
		String apellido1;
		int cont=0;
		System.out.println("Introduce el apellido 1: \n");
		apellido1 = sc.nextLine();
		for(int i=0;i<array.size();i++) {
				if(apellido1.equalsIgnoreCase(array.get(i).getApellido1())){
					cont++;
				}
			
			}
		System.out.println("Hay en total " + cont + " alumnos con el mismo primer apellido");
	}
			

	}

