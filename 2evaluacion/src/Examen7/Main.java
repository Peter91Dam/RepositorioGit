package Examen7;


public class Main {
	public static void main (String[] args) {
		
		String Color="Rojo";
		String Tipo="Brillo";
		
		Pintauñas pinta=new Pintauñas();
		Pintauñas P1=new Pintauñas(Color,Tipo);
		Pintauñas copiaPintauñas=new Pintauñas(pinta);
		copiaPintauñas=P1;

		
		System.out.println("Muestrame el dameNumPintauñas: " + P1.getdameNumPintauñas());
		if (P1.getColor().equals(copiaPintauñas.getColor())){
			 System.out.println(" Los miembros de los objetos P1 y copiaPintauñas, son iguales.");
		}
		else { System.out.println("No son iguales");}
}
}
