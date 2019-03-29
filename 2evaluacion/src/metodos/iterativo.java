package metodos;


public class iterativo {
	
	
	public int factorialI(int x){
		int resultado=1;
		for (int i=1; i<=x; i++){
			resultado= resultado*i;
		}
		return resultado;
	}

}
