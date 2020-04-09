package inscripciones;

import java.util.Scanner;
import java.util.ArrayList;

import cursos.Curso;
import usuarios.Usuario;

public class InscripcionRegistrar {

	public static void registrar(ArrayList<Curso> arrayCursos, ArrayList<Usuario> arrayUsuarios) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		System.out.println("********* Inscripciones-registrar *********");
		System.out.println("ingrese indice del curso");
		int indCurso = Integer.parseInt(leerEntradaTeclado.nextLine());
		Curso curso = arrayCursos.get(indCurso);
		System.out.println("ingrese el indice del estudiante");
		int indEstudiante = Integer.parseInt(leerEntradaTeclado.nextLine());
		Usuario usuario = arrayUsuarios.get(indEstudiante);
		curso.setUsuarios(usuario);
	}
}