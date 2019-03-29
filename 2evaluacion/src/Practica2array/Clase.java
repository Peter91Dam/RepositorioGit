package Practica2array;

public class Clase {
    Alumno al[];
    int contalumn;
    
    public Clase(Alumno a[],int n) {
  	  
  	  this.al=new Alumno[n];
  	  this.contalumn=n;
    }

	
	public int getContalumn() {
		return contalumn;
	}

	public void setContalumn(int contalumn) {
		this.contalumn = contalumn;
	}

    public Alumno devuelveAlumno(int n) {
  	  
  	  return this.al[n];
  	  
    }
    
    public int encuentraAlumno(Alumno a) {
  	 int i=0; 
  	 
  	while(i<this.al.length) {
  		
  		if(this.al[i].equals(a))return i;
  		i++;
  	}
  	  return 0;
    }
    /*metodo entero booleano,si encuentra el alumno pasado por parametro devuelve la posicion 
     * sino devuelve un 0
     **/
    
}