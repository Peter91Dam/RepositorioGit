package practica2;

import java.util.Scanner;

public class figuras {
	static Scanner teclado=new Scanner(System.in);
	 
	 int n1=0, j=0, p=0, volver=0;
	 
	 public void calculafiguras(){
		 
		 System.out.println( " 1)Figuras geom�tricas ");
         System.out.println( "  Cuadrado: pulse 1 ");
         System.out.println( "  Tri�ngulo: pulse 2 ");
         System.out.println( "  C�rculo: pulse 3 ");
         System.out.println( "  Hex�gono: pulse 4 ");
         System.out.println( " ");

        j=teclado.nextInt();
        
         if (j==1) {
            System.out.println( " Calcula del cuadrado: ");
            System.out.println( "  �rea: pulse 1 ");
            System.out.println( "  Per�metro: pulse 2 ");
            System.out.println( "  ");
          
             p=teclado.nextInt();
             
               if (p==1) {
                   System.out.println( "  Introduce lado para calcular el �rea del cuadrado ");

                   int lado=0;
                   lado=teclado.nextInt();
                   int area=lado*lado;
                   System.out.println( "El �rea del cuadrado es " + area );
                   
                   System.out.println( "  ");
                   System.out.println( " �Quieres volver al men� principal? ");
                   System.out.println( " SI pulsa 3 ");
                   System.out.println( " NO pulsa otra tecla ");
     
                   volver=teclado.nextInt(); 
                }
          
               if (p==2) {
                   System.out.println( "  Introduce lado para calcular el per�metro del cuadrado ");

                   int lado=0;
                   lado=teclado.nextInt();
                   int perimetro=4*lado;
                   System.out.println( "El per�metro del cuadrado es " + perimetro );
                   System.out.println( " ");

                   System.out.println( "  ");
                   System.out.println( " �Quieres volver al men� principal? ");
                   System.out.println( " SI pulsa 3 ");
                   System.out.println( " NO pulsa otra tecla ");
     
                   volver=teclado.nextInt(); 
               }

               
                   

         } //llave j==1


         if (j==2) {
            System.out.println( " Calcula del tri�ngulo equil�tero: ");
            System.out.println( "  �rea: pulse 1 ");
            System.out.println( "  Per�metro: pulse 2 ");
            System.out.println( "  ");

              p=teclado.nextInt();
      
               

                if (p==1) {
                    System.out.println("  Introduce la base para calcular el �rea del tri�ngulo ");

                    int base=0;
                    base=teclado.nextInt();
   
                    System.out.println("  Introduce la altura para calcular el �rea del tri�ngulo ");

                    int altura=0;
                    altura=teclado.nextInt();

                    int area=(base*altura)/2;
                    System.out.println("  El �rea del tri�ngulo es " + area );

                    System.out.println( "  ");
                    System.out.println( " �Quieres volver al men� principal? ");
                    System.out.println( " SI pulsa 3 ");
                    System.out.println( " NO pulsa otra tecla ");
     
                    volver=teclado.nextInt(); 
                }

               if (p==2) {
                  System.out.println("  Introduce el lado para calcular el per�metro del tri�ngulo ");

                  int lado=0;
                  lado=teclado.nextInt();

                  int perimetro=3*lado;
                  System.out.println("  El per�metro del tri�ngulo es " + perimetro );
             
                  System.out.println( "  ");
                  System.out.println( " �Quieres volver al men� principal? ");
                  System.out.println( " SI pulsa 3 ");
                  System.out.println( " NO pulsa otra tecla ");
     
                  volver=teclado.nextInt(); 

                }

         
       } //llave del j==2


        if (j==3) {
           System.out.println( " Calcula del c�rculo: ");
           System.out.println( "  �rea: pulse 1 ");
           System.out.println( "  Per�metro: pulse 2 ");
           System.out.println( " ");

           p=teclado.nextInt();

              if (p==1) {
                 System.out.println("  Introduce el radio para calcular el �rea del c�rculo ");

                 int radio=0;
                 radio=teclado.nextInt();

                 double PI=3.1415;
                 double area=(PI*radio*radio);
                 System.out.println("  El �rea del c�rculo es " + area );
              
                 System.out.println( "  ");
                 System.out.println( " �Quieres volver al men� principal? ");
                 System.out.println( " SI pulsa 3 ");
                 System.out.println( " NO pulsa otra tecla ");
     
                 volver=teclado.nextInt(); 

               }


              if (p==2) {
                System.out.println("  Introduce el radio para calcular el per�metro del c�rculo ");

                int radio=0;
                radio=teclado.nextInt();

                double PI=3.1415;
                double perimetro=(2*PI*radio);
                System.out.println("  El per�metro del c�rculo es " + perimetro );
             
                System.out.println( "  ");
                System.out.println( " �Quieres volver al men� principal? ");
                System.out.println( " SI pulsa 3 ");
                System.out.println( " NO pulsa otra tecla ");
     
                volver=teclado.nextInt(); 

              }

       } //llave del j==3


       if (j==4) {
           System.out.println( " Calcula del hex�gono: ");
           System.out.println( "  Per�metro: pulse 1 ");
           System.out.println( "  �rea: pulse 2 ");
           System.out.println( "  ");

           p=teclado.nextInt();

              if (p==1) {
                 System.out.println("  Introduce el lado para calcular el per�metro del hex�gono ");

                 int lado=0;
                 lado=teclado.nextInt();

                 int perimetro=6*lado;
                 System.out.println("  El per�metro del hex�gono es " + perimetro );
              
                 System.out.println( "  ");
                 System.out.println( " �Quieres volver al men� principal? ");
                 System.out.println( " SI pulsa 3 ");
                 System.out.println( " NO pulsa otra tecla ");
     
                 volver=teclado.nextInt(); 

              }


              if (p==2) {
                 System.out.println("  Introduce el per�metro para calcular el �rea del hex�gono ");

                 int perimetro=0;
                 perimetro=teclado.nextInt();

                 System.out.println("  Introduce el apotema para calcular el �rea del hex�gono ");

                 int apotema=0;
                 apotema=teclado.nextInt();

                 int area=(perimetro*apotema)/2;
                 System.out.println("  El �rea del hex�gono es " + area );
             
                 System.out.println( "  ");
                 System.out.println( " �Quieres volver al men� principal? ");
                 System.out.println( " SI pulsa 3 ");
                 System.out.println( " NO pulsa otra tecla ");
    
                 volver=teclado.nextInt(); 

              }
              
        } // llave del j==4  

     } // llave n1==1

}