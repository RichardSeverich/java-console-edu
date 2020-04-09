package cursos;

import java.util.Scanner;
import java.util.ArrayList;

public class CursoRegistrar {

	public static ArrayList<Curso> registrar(ArrayList<Curso> arrayCursos) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		System.out.println("Entroo Registrar ");
		Curso curso = new Curso();
		System.out.println("Ingrese el nombre del curso");
		curso.nombre = leerEntradaTeclado.nextLine();
		System.out.println("Ingrese el Limite ");
		curso.limite = Integer.parseInt(leerEntradaTeclado.nextLine());
		arrayCursos.add(curso);
		return arrayCursos;
	}
}
