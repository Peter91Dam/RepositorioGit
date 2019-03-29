package Clasesavan1;

public abstract class Personaje {
	int vida;
	
	public Personaje () {
		vida=100;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public abstract int movimientoLucha();

}
