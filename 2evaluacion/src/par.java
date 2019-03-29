import java.util.Scanner;
public class par {

	     public static void main (String[] args) {

	        int numero=0;
	        Scanner teclado=new Scanner (System.in);
	  
	        numero=teclado.nextInt();
	   
	       if (numero %2==0 && numero<1000 && numero>0) {
	        System.out.println ( "DERECHA ");
	       }	 
	       if (numero==0) {
	    	   System.out.println ("");
	       }
	       else {   System.out.println ( "IZQUIERDA ");
	       
	       }
	 }
	}

