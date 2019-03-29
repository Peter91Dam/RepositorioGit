package Exprogra;


public class deposito {
	Vehiculos vehiculos [];
	int numvehiculos;


		public deposito ( Vehiculos c[],int n) {
			// TODO Auto-generated constructor stub
			this.vehiculos=new Vehiculos[n];
			this.numvehiculos=n;
		}

   
		
		public void setvehiculos(Vehiculos[] vehiculos) {
			this.vehiculos = vehiculos;
		}


		public int getNumvehiculos() {
			return numvehiculos;
		}


		public void setNumvehiculos(int numvehiculos) {
			this.numvehiculos = numvehiculos;
		}

		

	public String vehiculosdeposito(int numvehiculos) { // en que plaza está un determinado coche que metemos
		String coche="";
		if(numvehiculos+1>this.numvehiculos) {
			
			System.out.println("esa vehiculos no existe\n");
		}else {
			
			int i=0;
		while(i<this.vehiculos[numvehiculos].contaco) {
			coche=this.vehiculos[numvehiculos].co[i].getmatricula()+" "+this.vehiculos[numvehiculos].co[i].getDNI()+
					" "+this.vehiculos[numvehiculos].co[i].getdiasemana();
			System.out.println(coche);
			i++;
			
		}	
		
	}
		return coche;
}

	
	public int totalcoches() { //saca por pantalla todos los coches que hay en el deposito
		
		if(this.numvehiculos==0)return 0;
		return this.numvehiculos*this.vehiculos[0].contaco;
		
	}
	
	
	public int vehiculoscoche(String  coche) { // en que vehiculos se encuentra la matricula, DNI y dia semana que metemos
		
		String aux=new String(coche);
		
		for(int i=0;i<this.numvehiculos;i++) {
			
			for(int j=0;j<this.vehiculos[i].contaco;j++) {
				
				if(aux.equalsIgnoreCase(this.vehiculos[i].co[j].matricula+" "+this.vehiculos[i].co[j].DNI+" "+this.vehiculos[i].co[j].diasemana))return (i+1);
			}
			
		}
		
		
		return -1;
	}


public void diasemana (String diasemana) { //cuenta cuantos coches hay con el mismo dni
	String aux= new String(diasemana);
	int cont=0;

	for(int i=0;i<this.numvehiculos;i++) {
		
		for(int j=0;j<this.vehiculos[i].contaco;j++) {
			
			if(aux.equalsIgnoreCase(this.vehiculos[i].co[j].diasemana)) cont++;			
		
		}	
		
	}
	System.out.println(cont); 
	
}


}

