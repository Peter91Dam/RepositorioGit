package metodos;


public class recursivo {
	
	
	public int factorial(double numero) {
		if (numero==0)
		    return 1;
		else
			return (int) (numero*factorial(numero-1));
	}

}
