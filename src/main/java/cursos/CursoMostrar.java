package cursos;

import java.util.ArrayList;

public class CursoMostrar {

	public static void mostrar(ArrayList<Curso> arrayCursos) {
		System.out.println("Numero      Nombre         limite ");
		int ind = 0;
		for (Curso curso : arrayCursos) {
			String nombre = curso.nombre;
			int limite = curso.limite;
			System.out.println(ind + "           " + nombre + "         " + limite);
			ind++;
		}
	}
}