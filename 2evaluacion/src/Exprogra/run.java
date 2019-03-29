package Exprogra;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.IOException;


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

		System.out.print("Introduzca el numero de plazas\n");
		c = sc.nextInt();
		if (!positiva(c))
			throw E2;
		deposito vehi = new deposito(null, c);
		System.out.print("Introduzca el numero de vehiculos por plaza \n");
		a = sc.nextInt();
		if (!positiva(a))
			throw E2;
		
		for (int i = 0; i < c; i++) {

			Vehiculos vehiculos = new Vehiculos(null, a);
			vehi.vehiculos[i] = vehiculos;

			for (int j = 0; j < a; j++) {

				System.out
						.println("Introduzca las matriculas, los DNI de los propietarios y el dia de la semana por ese mismo orden de los vehiculos de la plaza "
								+ (i+1) + " coche " + (j+1) + "\n");
				Scanner texto = new Scanner(System.in);
				String co = texto.nextLine();
				StringTokenizer palabras = new StringTokenizer(co);
				if (palabras.countTokens() < 3)
					throw E1;

				vehi.vehiculos[i].co[j] = Cocheparser(co);

			}

		}

		Scanner men = new Scanner(System.in);
		int menu;
		do {

			System.out.println(" -----------------MENU----------------\n");
			System.out
					.println("0.Salir de la aplicacion\n"
							+ "1.Sacar por pantalla cuantos coches hay en total en el deposito\n"
							+ "2.Sacar por pantalla cuantos coches se introducieron en el mismo dia de la semana\n"
							+ "3.Sacar por pantalla a que plaza pertenece un coche\n"
							+ "4.Sacar por pantalla todos los datos de los coches de una plaza\n");
							
			menu = men.nextInt();
			Scanner aux = new Scanner(System.in);
			int a1;
			String coch;

			switch (menu) {
			
			case 1:
				int t=1;
				for (int i=0; i<vehi.vehiculos.length; i++) {
					 vehi.vehiculosdeposito(i);
					 t++;
				}	
				System.out.println(" Los coches totales en el deposito son: "
						 + t);
				break; // te saca el total de coches en el deposito junto con sus datos

			case 2:
				System.out.println(" escriba el dia de la semana\n");
				coch = aux.nextLine();
			    vehi.diasemana(coch);
				break; // te saca cuantos coches se introdujeron en el deposito el mismo dia de la semana
				
			case 3:
				System.out.println(" indique el coche deseado\n");
				coch = aux.nextLine();
				int f = vehi.vehiculoscoche(coch);
				if (f == -1)
					System.out.println(" coche no encontrado\n");
				System.out.println(f);
				break; // te dice en que plaza esta un coche que tu pides
			
			case 4:
				System.out.println(" indique la plaza deseada\n");
				a1 = aux.nextInt();
				vehi.vehiculosdeposito(a1);
				break; // te saca matricula, Dni y dia de la semana de un vehiculo pedido

			}

		} while (menu != 0);

	}

	public static boolean positiva(int n) {
		if (n > 0)
			return true;
		return false;

	}

	public static Coche Cocheparser(String co) {
		String[] total = co.split(" ");
		return new Coche(total[0], total[1], total[2]); // en el 0 esta la matricula, en el 1 el DNI y en el 2 el dia de la semana

	}

}

