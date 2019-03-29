package constructorcopia;
  /**
   * 
   * @author Pedro Arana del Blanco
   * @version 22.2.2019
   */

public class Alumno {
	protected String nombre="Pedro";
	protected String apellido="Arana";
	private static int numalumnos=0;
	private static int notamedia=0;
	
	/**
	 * Constructor
	 * @param usuario: este usuario es el nombre que introducimos al alumno.
	 * @param ape: en este parámetro se recogerá el apellido del alumno.
	 */
	
	public Alumno(String usuario, String ape){{numalumnos++;}
		nombre="usuario";
		apellido="ape";
	}
	
	/**
	 * Constructor
	 * @param A1: este parametro nos devolverá el nombre o apellido que introduzcamos.
	 */
	
	public Alumno(Alumno A1){{numalumnos++;}
		this.nombre=A1.getnombre();
		this.apellido=A1.getapellido();
	}
	
	/**
	 * Getter.
	 * @return numalumnos: que sirve para contar los alumnos que tenemos en total.
	 */
	
	Alumno(){numalumnos++;}
	
	public int getnumalumnos(){
		return numalumnos;
		
	}
	
	/**
	 * Getter.
	 * @return nombre: nos devolverá el nombre del alumno que almacenemos.
	 */
	
	public String getnombre(){
	    return nombre;
	}
	
	/**
	 * Setter.
	 * @param Alfa: cuando llamemos al setnombre nos devolverá Alfa que es lo que le introducimos a nombre.
	 */
	
	public void setnombre(String Alfa){
	    nombre=Alfa;
	}
	
	/**
	 * Getter.
	 * @return apellido: nos devolverá el apellido del alumno que almacenemos.
	 */
	
	public String getapellido(){
	    return apellido;
	}
	
	/**
	 * Setter.
	 * @param Charly:  cuando llamemos al setapellido nos devolverá Charly que es lo que le introducimos a apellido.
	 */
	
	public void setapellido(String Charly){
	    apellido=Charly;
	}  
	
	/**
	 * notamedia++: esto lo que hace es incrementar la variable notamedia +1.
	 */
	
	public void incrementar(){	
		notamedia++;
	}
	
	/**
	 * En el metodo resultado nos devolverá la notamedia después de haberla incrementado con el metodo incrementar().
	 * @return notamedia: devuelve el total de notas medias que hay en total y que hemos sumado en el metodo incrementar(). 
	 */
	
	public int resultado(){	
		this.incrementar();
		incrementar();
		return notamedia;
	}
}
