package Clasesavan1;

import java.util.*;
import java.util.GregorianCalendar;

public class Guerrero extends Personaje {
	int ataque=0;
	
	public Guerrero () {
		ataque=10;
		Date fecha = new Date();
		GregorianCalendar calendario = new GregorianCalendar ();
		fecha=calendario.getTime();
		System.out.println("Guerrero creado en fecha: " + fecha);
	}
	
	
	
	public int movimientoLucha() {
		System.out.println("****Espadazo****");
		int espadazo = (int) (Math.random() * ataque);
		return espadazo;
	}
	
	
	
}
