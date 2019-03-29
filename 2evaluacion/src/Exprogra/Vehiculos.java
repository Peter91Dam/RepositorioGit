package Exprogra;

public class Vehiculos {
	
	    Coche co[];
	    int contaco;
	    
	    public Vehiculos(Coche a[],int n) {
	  	  
	  	  this.co=new Coche[n];
	  	  this.contaco=n;
	    }

		
		public int getContaco() {
			return contaco;
		}

		public void setContaco(int contaco) {
			this.contaco = contaco;
		}

	    public Coche devuelveCoche(int n) {
	  	  
	  	  return this.co[n];
	  	  
	    }
	    
	    public int encuentraCoche(Coche a) {
	  	 int i=0; 
	  	 
	  	while(i<this.co.length) {
	  		
	  		if(this.co[i].equals(a))return i;
	  		i++;
	  	}
	  	  return 0;
	    }
	    /*metodo entero booleano,si encuentra el Coche pasado por parametro devuelve la posicion 
	     * sino devuelve un 0
	     **/ 
	}
