package ExEntornos;

public class ExamenED {
	
	 public static int metodoExamen (int num){

		 int n = 0;

		 if (num<0) {

	                 System.out.print("Número "+ num + " no puede ser menor que 0");

	    	 } else {

	    		 for (int i = 1; i<=num; i++) {

	                      n *= i; // n=n*i

	    		 }

	    		 if (n > 100000)  {

	    			 System.out.print("Número " + n + " demasiado grande");

	    		 } else if ((n <= 100000) && (num > 1)) {

	    			 System.out.print("Número " + n + " correcto");

	    		 }

	    	 }

	         return n;

	     }

	}
