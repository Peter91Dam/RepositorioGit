package Examen7;


public class Main {
	public static void main (String[] args) {
		
		String Color="Rojo";
		String Tipo="Brillo";
		
		Pintauņas pinta=new Pintauņas();
		Pintauņas P1=new Pintauņas(Color,Tipo);
		Pintauņas copiaPintauņas=new Pintauņas(pinta);
		copiaPintauņas=P1;

		
		System.out.println("Muestrame el dameNumPintauņas: " + P1.getdameNumPintauņas());
		if (P1.getColor().equals(copiaPintauņas.getColor())){
			 System.out.println(" Los miembros de los objetos P1 y copiaPintauņas, son iguales.");
		}
		else { System.out.println("No son iguales");}
}
}
