package practica2;

import java.util.Scanner;

public class figuras {
	static Scanner teclado=new Scanner(System.in);
	 
	 int n1=0, j=0, p=0, volver=0;
	 
	 public void calculafiguras(){
		 
		 System.out.println( " 1)Figuras geométricas ");
         System.out.println( "  Cuadrado: pulse 1 ");
         System.out.println( "  Triángulo: pulse 2 ");
         System.out.println( "  Círculo: pulse 3 ");
         System.out.println( "  Hexágono: pulse 4 ");
         System.out.println( " ");

        j=teclado.nextInt();
        
         if (j==1) {
            System.out.println( " Calcula del cuadrado: ");
            System.out.println( "  Área: pulse 1 ");
            System.out.println( "  Perímetro: pulse 2 ");
            System.out.println( "  ");
          
             p=teclado.nextInt();
             
               if (p==1) {
                   System.out.println( "  Introduce lado para calcular el área del cuadrado ");

                   int lado=0;
                   lado=teclado.nextInt();
                   int area=lado*lado;
                   System.out.println( "El área del cuadrado es " + area );
                   
                   System.out.println( "  ");
                   System.out.println( " ¿Quieres volver al menú principal? ");
                   System.out.println( " SI pulsa 3 ");
                   System.out.println( " NO pulsa otra tecla ");
     
                   volver=teclado.nextInt(); 
                }
          
               if (p==2) {
                   System.out.println( "  Introduce lado para calcular el perímetro del cuadrado ");

                   int lado=0;
                   lado=teclado.nextInt();
                   int perimetro=4*lado;
                   System.out.println( "El perímetro del cuadrado es " + perimetro );
                   System.out.println( " ");

                   System.out.println( "  ");
                   System.out.println( " ¿Quieres volver al menú principal? ");
                   System.out.println( " SI pulsa 3 ");
                   System.out.println( " NO pulsa otra tecla ");
     
                   volver=teclado.nextInt(); 
               }

               
                   

         } //llave j==1


         if (j==2) {
            System.out.println( " Calcula del triángulo equilátero: ");
            System.out.println( "  Área: pulse 1 ");
            System.out.println( "  Perímetro: pulse 2 ");
            System.out.println( "  ");

              p=teclado.nextInt();
      
               

                if (p==1) {
                    System.out.println("  Introduce la base para calcular el área del triángulo ");

                    int base=0;
                    base=teclado.nextInt();
   
                    System.out.println("  Introduce la altura para calcular el área del triángulo ");

                    int altura=0;
                    altura=teclado.nextInt();

                    int area=(base*altura)/2;
                    System.out.println("  El área del triángulo es " + area );

                    System.out.println( "  ");
                    System.out.println( " ¿Quieres volver al menú principal? ");
                    System.out.println( " SI pulsa 3 ");
                    System.out.println( " NO pulsa otra tecla ");
     
                    volver=teclado.nextInt(); 
                }

               if (p==2) {
                  System.out.println("  Introduce el lado para calcular el perímetro del triángulo ");

                  int lado=0;
                  lado=teclado.nextInt();

                  int perimetro=3*lado;
                  System.out.println("  El perímetro del triángulo es " + perimetro );
             
                  System.out.println( "  ");
                  System.out.println( " ¿Quieres volver al menú principal? ");
                  System.out.println( " SI pulsa 3 ");
                  System.out.println( " NO pulsa otra tecla ");
     
                  volver=teclado.nextInt(); 

                }

         
       } //llave del j==2


        if (j==3) {
           System.out.println( " Calcula del círculo: ");
           System.out.println( "  Área: pulse 1 ");
           System.out.println( "  Perímetro: pulse 2 ");
           System.out.println( " ");

           p=teclado.nextInt();

              if (p==1) {
                 System.out.println("  Introduce el radio para calcular el área del círculo ");

                 int radio=0;
                 radio=teclado.nextInt();

                 double PI=3.1415;
                 double area=(PI*radio*radio);
                 System.out.println("  El área del círculo es " + area );
              
                 System.out.println( "  ");
                 System.out.println( " ¿Quieres volver al menú principal? ");
                 System.out.println( " SI pulsa 3 ");
                 System.out.println( " NO pulsa otra tecla ");
     
                 volver=teclado.nextInt(); 

               }


              if (p==2) {
                System.out.println("  Introduce el radio para calcular el perímetro del círculo ");

                int radio=0;
                radio=teclado.nextInt();

                double PI=3.1415;
                double perimetro=(2*PI*radio);
                System.out.println("  El perímetro del círculo es " + perimetro );
             
                System.out.println( "  ");
                System.out.println( " ¿Quieres volver al menú principal? ");
                System.out.println( " SI pulsa 3 ");
                System.out.println( " NO pulsa otra tecla ");
     
                volver=teclado.nextInt(); 

              }

       } //llave del j==3


       if (j==4) {
           System.out.println( " Calcula del hexágono: ");
           System.out.println( "  Perímetro: pulse 1 ");
           System.out.println( "  Área: pulse 2 ");
           System.out.println( "  ");

           p=teclado.nextInt();

              if (p==1) {
                 System.out.println("  Introduce el lado para calcular el perímetro del hexágono ");

                 int lado=0;
                 lado=teclado.nextInt();

                 int perimetro=6*lado;
                 System.out.println("  El perímetro del hexágono es " + perimetro );
              
                 System.out.println( "  ");
                 System.out.println( " ¿Quieres volver al menú principal? ");
                 System.out.println( " SI pulsa 3 ");
                 System.out.println( " NO pulsa otra tecla ");
     
                 volver=teclado.nextInt(); 

              }


              if (p==2) {
                 System.out.println("  Introduce el perímetro para calcular el área del hexágono ");

                 int perimetro=0;
                 perimetro=teclado.nextInt();

                 System.out.println("  Introduce el apotema para calcular el área del hexágono ");

                 int apotema=0;
                 apotema=teclado.nextInt();

                 int area=(perimetro*apotema)/2;
                 System.out.println("  El área del hexágono es " + area );
             
                 System.out.println( "  ");
                 System.out.println( " ¿Quieres volver al menú principal? ");
                 System.out.println( " SI pulsa 3 ");
                 System.out.println( " NO pulsa otra tecla ");
    
                 volver=teclado.nextInt(); 

              }
              
        } // llave del j==4  

     } // llave n1==1

}