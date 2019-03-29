package practica2;
import java.util.Scanner;

 public class practica3 {
	 static Scanner teclado=new Scanner(System.in);
	 
	public static void main (String[] args) {
      
      int n1=0;
      figuras uno;
      uno=new figuras();
      operaciones dos;
      dos=new operaciones();
      volver tres;
      tres=new volver();
   do{
      System.out.println( " Elige un programa: ");
      System.out.println( "  1)Figuras geométricas: pulse 1 ");
      System.out.println( "  2)Operaciones matemáticas: pulse 2 ");
      System.out.println( " ");

       n1=teclado.nextInt();

      if (n1==1) {
    	  uno.calculafiguras();  	  
      } 
     
      if (n1==2) {
    	  dos.calculaoperaciones(); 
          
    	   tres.getvolver();

       } //llave n1==
     
       if (n1!=1 & n1!=2) {
          System.out.println( " ¿Quieres volver al menú principal? ");
          System.out.println( " SI pulsa 3 ");
          System.out.println( " NO pulsa 4 ");
      
         tres.getvolver();
       }
       
   }while (tres.getvolver()==3);
   
	}
 }