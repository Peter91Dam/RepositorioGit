package constructorcopia;

public class Main {
	public static void main (String[] args) {
		
		String nombre="Pedro";
		String apellido="Arana";
		String Alfa="Victor";
		String Charly="Moreno";
		
		Alumno alumno=new Alumno();
		Alumno alumnopedido=new Alumno();
		Alumno A1=new Alumno(nombre,apellido);
		Alumno copiaalumno=new Alumno(alumno);
		copiaalumno=A1;
		
		 System.out.println(A1.toString());
		 System.out.println(copiaalumno.toString());
			
		
		if (A1.getnombre().equals(copiaalumno.getnombre())){
		System.out.println("Muestrame el nombre: " + A1.getnombre());
		System.out.println("Muestrame el apellido: " + A1.getapellido());
		A1.setnombre(Alfa);
		System.out.println("Muestrame el nombre: " + copiaalumno.getnombre());
		A1.setapellido(Charly);
		System.out.println("Muestrame el apellido: " + copiaalumno.getapellido());
		}
		
		if (A1.getnombre().equals(copiaalumno.getnombre())){
			 System.out.println("Son iguales");
		}
		else { System.out.println("No son iguales");}
		
		System.out.println("Muestrame el numalumnos: " + A1.getnumalumnos());
		System.out.println("Incrementame la nota media: " + A1.resultado());
}
}
