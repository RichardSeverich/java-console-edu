package cursos;

import java.util.Scanner;
import java.util.ArrayList;

public class CursoEditar {

	public static ArrayList<Curso> editar(ArrayList<Curso> arrayCursos) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		int tam = arrayCursos.size();
		System.out.println("ingrese el elemento que desea editar");
		int ind = Integer.parseInt(leerEntradaTeclado.nextLine());
		if (ind < tam) {
			Curso curso = new Curso();
			System.out.println("Ingrese el nombre del curso");
			curso.nombre = leerEntradaTeclado.nextLine();
			System.out.println("Ingrese el Limite ");
			curso.limite = Integer.parseInt(leerEntradaTeclado.nextLine());
			arrayCursos.set(ind, curso);
		} else if (ind >= tam) {
			System.out.println("elemento seleccionado inexistente");
		}
		return arrayCursos;
	}
}