package Examen7;

public class Pintau�as {
	private static int dameNumPintau�as=0; // este miembro es de clase porque lo he declarado static
	protected String Color="Rojo"; // este miembro es de instancia
	protected String Tipo="Brillo"; // este miembro es de instancia
	
	public Pintau�as(String rojo, String brillo){{dameNumPintau�as++;}
	Color="rojo";
	Tipo="brillo";
	}

public Pintau�as(Pintau�as P1){{dameNumPintau�as++;}
	this.Color=P1.getColor(); // m�todo de instancia, dando que en los de clase no puede haber this y tienen que declararse static
	this.Tipo=P1.getTipo(); // m�todo de instancia, dando que en los de clase no puede haber this y tienen que declararse static
}

Pintau�as(){dameNumPintau�as++;}

public int getdameNumPintau�as(){
	return dameNumPintau�as;	
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
