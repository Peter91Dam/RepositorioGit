package Clasesavan1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Mago extends Personaje {
	int magia=0;
	
	public Mago () {
		magia=10;
		super.setVida(getVida() + (getVida() * 10 /100));
		Date fecha = new Date();
		GregorianCalendar calendario = new GregorianCalendar ();
		fecha=calendario.getTime();
		System.out.println("Mago creado en fecha: " + fecha);
	}
	
	public int movimientoLucha() {
		System.out.println("****Hechizo****");
		int hechizo = (int) (Math.random() * magia);
		return hechizo;
		
	}
	

}
