package Practica2array;

public class Alumno {

	  String nombre;
	  String apellido1;
	  String apellido2;
	  
	  
	  public Alumno(String nom,String ap1, String ap2) {
		  
		  this.nombre=nom;
		  this.apellido1=ap1;
		  this.apellido2=ap2;
		  
		  
	  }

	public String getNombre() {
		return nombre;
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	  
  
}