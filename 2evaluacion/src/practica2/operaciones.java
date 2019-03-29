package practica2;

import java.util.Scanner;

public class operaciones {
	
 static Scanner teclado=new Scanner(System.in);
		 
	int n1=0, j=0, volver=0;
	
	public operaciones(){
	}
	public void calculaoperaciones() {
		
	System.out.println( "  1)Mayor o menor: pulse 1 ");
    System.out.println( "  2)Elevar un número: pulse 2 ");
    System.out.println( "  ");

     j=teclado.nextInt();
     
     if (j==1) { 
         System.out.println( " Introduce 3 números por pantalla "); 
         
         int numero1=0, numero2=0, numero3=0;
         numero1=teclado.nextInt();
         numero2=teclado.nextInt();
         numero3=teclado.nextInt();
           
          if (numero1<numero2 && numero2<numero3)               
          System.out.println( " Los números ordenados de mayor a menor son:" + numero3 +">"+ numero2 +">"+ numero1 );              
         
          if (numero2>numero3 && numero3>numero1)
          System.out.println( " Los números ordenados de mayor a menor son:" + numero2 +">"+ numero3 +">"+ numero1 );  

          if (numero3<numero2 && numero1>numero2)
          System.out.println( " Los números ordenados de mayor a menor son:" + numero1 +">"+ numero2 +">"+ numero3 );

          if (numero3<numero1 && numero1<numero2)
          System.out.println( " Los números ordenados de mayor a menor son:" + numero2 +">"+ numero1 +">"+ numero3 );

          if (numero3<numero1 && numero2<numero3)
          System.out.println( " Los números ordenados de mayor a menor son:" + numero1 +">"+ numero3 +">"+ numero2 );

          if (numero3>numero1 && numero1>numero2)
          System.out.println( " Los números ordenados de mayor a menor son:" + numero3 +">"+ numero1 +">"+ numero2 );

          System.out.println( "  ");
          System.out.println( " ¿Quieres volver al menú principal? ");
          System.out.println( " SI pulsa 3 ");
          System.out.println( " NO pulsa otra tecla ");

          volver=teclado.nextInt(); 

     } // llave j==1

     if (j==2) {
         System.out.println( " Introduce la base que quieres elevar "); 
         
         int base=0, exponente=0, resultado=1, numero=0;
         base=teclado.nextInt();

        
         System.out.println( " Introduce el exponente al que quieres elevar la base "); 
         exponente=teclado.nextInt();
         
         for ( base=1; base<=exponente; base++) {
              resultado*=numero;}
         System.out.println( " El cálculo del número elevado es:"  + resultado );              
         
         System.out.println( "  ");
         System.out.println( " ¿Quieres volver al menú principal? ");
         System.out.println( " SI pulsa 3 ");
         System.out.println( " NO pulsa otra tecla ");

}
	}
}
