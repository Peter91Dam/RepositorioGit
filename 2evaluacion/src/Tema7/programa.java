package Tema7;

import java.util.Random;

public class programa {
	public static void main (String[] args) {
		
		Random rnd = new Random();
		rnd.nextDouble();
	for (int i=0;i<10;i++){
		System.out.println(rnd.nextDouble()); 	  		  
	}
	
}
}