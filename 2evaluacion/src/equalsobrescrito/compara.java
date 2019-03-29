package equalsobrescrito;

public class compara {
	String apellido;
	
	public void apellido1(String ape) {
		this.apellido=ape;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String Pepe) {
		this.apellido = Pepe;
	}
	
	public boolean equals(compara apellido) {
		boolean resultado=false;
		if(apellido.getApellido().equals(this.getApellido())){
		resultado= false;
		}
		return resultado;
	}

}
