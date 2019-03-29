package Exprogra;

public class Coche {

		  String matricula;
		  String DNI;
		  String diasemana;
		  
		  
		  public Coche(String matri,String dni, String diase) {
			  
			  this.matricula=matri;
			  this.DNI=dni;
			  this.diasemana=diase;
			  
			  
		  }

		public String getmatricula() {
			return matricula;
		}
		

		public void setmatricula(String matricula) {
			this.matricula = matricula;
		}

		public String getDNI() {
			return DNI;
		}

		public void setDNI(String DNI) {
			this.DNI = DNI;
		}

		public String getdiasemana() {
			return diasemana;
		}

		public void setdiasemana(String diasemana) {
			this.diasemana = diasemana;
		}
		  
	  
	}
