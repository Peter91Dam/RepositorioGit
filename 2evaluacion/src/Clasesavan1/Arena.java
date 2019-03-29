package Clasesavan1;

public class Arena {

	int danoValor = 0;
	Integer danoReferencia = 0;

	public static void Lucha(Mago Saruman, guerrefuerte Leonidas, Personaje Legolas) {

		int vidamago = (Saruman.getVida() - Leonidas.movimientoLucha());
		int vidaguerrefuerte = (Leonidas.getVida() - Saruman.movimientoLucha());
		int vidaLegolas = (Legolas.getVida() - Saruman.movimientoLucha());
		System.out.println(vidaLegolas);
		System.out.println(vidamago);
		System.out.println(vidaguerrefuerte);
		Saruman.setVida(vidamago);
		Leonidas.setVida(vidaguerrefuerte);
		Legolas.setVida(vidaLegolas);
	}

	public static void Lucha(Guerrero Aquiles, Mago Saruman, int danoValor,
			Integer danoReferencia) {

		int danoMago = Saruman.movimientoLucha();
		int danoGuerrero = Aquiles.movimientoLucha();

		int vidamago = (Saruman.getVida() - danoGuerrero);
		int vidaguerrero = (Aquiles.getVida() - danoMago);

		System.out.println(vidamago);
		System.out.println(vidaguerrero);

		danoValor = danoGuerrero + danoMago;
		danoReferencia = danoGuerrero + danoMago;

		Saruman.setVida(vidamago);
		Aquiles.setVida(vidaguerrero);
	}

	public static void main(String[] args) {

		Guerrero Aquiles = new Guerrero();
		final Mago Saruman = new Mago();
		final guerrefuerte Leonidas = new guerrefuerte();
		Personaje Legolas = (guerrefuerte)Leonidas; 
		int danoValor = 0;
		Integer danoReferencia = 0;

		System.out.println("La vida de mi Guerrero es de: " + Aquiles.getVida()
				+ "\n");
		System.out.println("La vida de mi Mago es de: " + Saruman.getVida()
				+ "\n");
		System.out.println("Mi personaje Aquiles inflinge : "
				+ Aquiles.movimientoLucha() + "\n");
		System.out.println("Mi personaje Saruman inflinge : "
				+ Saruman.movimientoLucha() + "\n");
		/* Lucha(Aquiles, Saruman, danoValor, danoReferencia); */
		Lucha(Saruman, Leonidas, Legolas);
		System.out.println("Vida del guerrero : " + Aquiles.getVida() + "\n");
		System.out.println("Vida del mago : " + Saruman.getVida() + "\n");
		System.out.println("Vida del guerrerofuerte : " + Leonidas.getVida()
				+ "\n");
		System.out.println("Vida del Legolas es : " + Legolas.getVida() + "\n");
		System.out.println("Mi personaje fuerte Leonidas inflinge : "
				+ Leonidas.movimientoLucha() + " de daño\n");
		System.out.println(danoValor);
		System.out.println(danoReferencia);
		
	}

}
