package Examen7;


public class Main {
	public static void main (String[] args) {
		
		String Color="Rojo";
		String Tipo="Brillo";
		
		Pintau�as pinta=new Pintau�as();
		Pintau�as P1=new Pintau�as(Color,Tipo);
		Pintau�as copiaPintau�as=new Pintau�as(pinta);
		copiaPintau�as=P1;

		
		System.out.println("Muestrame el dameNumPintau�as: " + P1.getdameNumPintau�as());
		if (P1.getColor().equals(copiaPintau�as.getColor())){
			 System.out.println(" Los miembros de los objetos P1 y copiaPintau�as, son iguales.");
		}
		else { System.out.println("No son iguales");}
}
}
