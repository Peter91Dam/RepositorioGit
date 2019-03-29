package Clasesavan1;

import java.util.Date;
import java.util.GregorianCalendar;

public class guerrefuerte extends Guerrero {
int ataque=0;
	
	public guerrefuerte () {
		ataque=10;
		Date fecha = new Date();
		GregorianCalendar calendario = new GregorianCalendar ();
		fecha=calendario.getTime();
		System.out.println("Guerrero fuerte creado en fecha: " + fecha);
	}
	
	public int movimientoLucha() {
		System.out.println("****Espadazofuerte****");
		int espadazofuerte = (int) (Math.random() * ataque)+5;
		if (espadazofuerte>=10) {
			System.out.println("***CRITICO***");
		}
		return espadazofuerte;
			
	}

}
