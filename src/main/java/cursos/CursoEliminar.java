package cursos;

import java.util.Scanner;
import java.util.ArrayList;

public class CursoEliminar {

	public static ArrayList<Curso> eliminar(ArrayList<Curso> arrayCursos) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		int tam = arrayCursos.size();
		System.out.println("******* ELIMINAR *******");
		System.out.println("ingrese el indice que desea eliminar");
		int ind = Integer.parseInt(leerEntradaTeclado.nextLine());
		if (ind < tam) {
			arrayCursos.remove(ind);
			System.out.println("se elimino exitosamente");
		} else {
			System.out.println("elemento seleccionado inexistente");
		}
		return arrayCursos;
	}
}