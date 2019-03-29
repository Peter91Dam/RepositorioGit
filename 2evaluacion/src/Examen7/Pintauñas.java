package Examen7;

public class Pintauñas {
	private static int dameNumPintauñas=0; // este miembro es de clase porque lo he declarado static
	protected String Color="Rojo"; // este miembro es de instancia
	protected String Tipo="Brillo"; // este miembro es de instancia
	
	public Pintauñas(String rojo, String brillo){{dameNumPintauñas++;}
	Color="rojo";
	Tipo="brillo";
	}

public Pintauñas(Pintauñas P1){{dameNumPintauñas++;}
	this.Color=P1.getColor(); // método de instancia, dando que en los de clase no puede haber this y tienen que declararse static
	this.Tipo=P1.getTipo(); // método de instancia, dando que en los de clase no puede haber this y tienen que declararse static
}

Pintauñas(){dameNumPintauñas++;}

public int getdameNumPintauñas(){
	return dameNumPintauñas;	
}
public String getColor(){
    return Color;
}
public void setColor(String Alfa){
    Color=Alfa;
}
public String getTipo(){
    return Tipo;
}
public void setTipo(String Charly){
    Tipo=Charly;
}  


}
