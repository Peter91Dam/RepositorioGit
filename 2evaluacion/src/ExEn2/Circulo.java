package ExEn2;
/**
 * 
 * @author Pedro Arana del Blanco
 * @version 22.2.2019
 */

public class Circulo {
	private double centroX;
	private double centroY;
	private double radio;
	
	/**
	 * Constructor
	 * @param cx: introduciremos el dato de centro X.
	 * @param cy: introduciremos el dato de centro Y.
	 * @param r: Introduciremos el radio.
	 */

	public Circulo(double cx, double cy, double r) {
		centroX = cx;
		centroY = cy;
		radio = r;
	}
	
	/**
	 * Getter.
	 * @return centroX: nos devolverá el valor de centroX que almacenemos.
	 */

	public double getCentroX() {
		return centroX;
	}
	
	/**
	 * Getter.
	 * @return 2 * Math.PI * radio: nos devolverá el valor tras realizar la fórmula para calcular la circunferencia.
	 */

	public double getCircunferencia() {
		return 2 * Math.PI * radio;
	}
	
	/**
	 * En el metodo mueve nos devolverá la suma de los centros X e Y, introduciendo los datos deltaX y deltaY.
	 * @return suma: devuelve el total de sumar el centroX y el centroY. 
	 */

	public int mueve(double deltaX, double deltaY) {
		centroX = centroX + deltaX;
		centroY = centroY + deltaY;
		double suma = centroX + centroY;
		return (int) suma;
	}
	
	/**
	 * radio: esto nos devolverá el valor del radio tras multiplicarlo por el valor s que introduzcamos.
	 */

	public void escala(double s) {
		radio = radio * s;
	}
}
