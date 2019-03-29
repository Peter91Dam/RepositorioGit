package Practica2array;

import java.util.ArrayList;

public class colegio {

	Clase clase [];
	int numClases;


		public colegio( Clase c[],int n) {
			// TODO Auto-generated constructor stub
			this.clase=new Clase[n];
			this.numClases=n;
		}

   
		
		public void setClase(Clase[] clase) {
			this.clase = clase;
		}


		public int getNumClases() {
			return numClases;
		}


		public void setNumClases(int numClases) {
			this.numClases = numClases;
		}

		

	public String alumnosDeUnaClase(int numclase) { // en que clase está un determinado alumno que metemos
		String alumno="";
		if(numclase+1>this.numClases) {
			
			System.out.println("esa clase no existe\n");
		}else {
			
			int i=0;
		while(i<this.clase[numclase].contalumn) {
			alumno=this.clase[numclase].al[i].getNombre()+" "+this.clase[numclase].al[i].getApellido1()+
					" "+this.clase[numclase].al[i].getApellido2();
			System.out.println(alumno);
			i++;
			
		}	
		
	}
		return alumno;
}

	
	public int totalAlumnos() { //saca por pantalla todos los alumnos
		
		if(this.numClases==0)return 0;
		return this.numClases*this.clase[0].contalumn;
		
	}
	
	
	public int claseAlumno(String   alumno) { // en que clase se encuentra el alumno que metemos
		
		String aux=new String(alumno);
		
		for(int i=0;i<this.numClases;i++) {
			
			for(int j=0;j<this.clase[i].contalumn;j++) {
				
				if(aux.equalsIgnoreCase(this.clase[i].al[j].nombre+" "+this.clase[i].al[j].apellido1+" "+this.clase[i].al[j].apellido2))return (i+1);
			}
			
		}
		
		
		return -1;
	}


public void primerApellido(String apellido) { //cuenta cuantos alumnos hay con el mismo primer apellido
	String aux= new String(apellido);
	int cont=0;

	for(int i=0;i<this.numClases;i++) {
		
		for(int j=0;j<this.clase[i].contalumn;j++) {
			
			if(aux.equalsIgnoreCase(this.clase[i].al[j].apellido1)) cont++;			
		
		}	
		
	}
	System.out.println(cont); 
	
}



}