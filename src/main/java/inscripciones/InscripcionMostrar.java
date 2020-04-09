package inscripciones;

import java.util.ArrayList;
import java.util.Scanner;

import usuarios.Usuario;
import cursos.Curso;

public class InscripcionMostrar {

	public static void mostrar(ArrayList<Curso> arrayCursos) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		System.out.println("********* Inscripciones-mostrar *********");
		System.out.println("ingrese indice del curso");
		int indCurso = Integer.parseInt(leerEntradaTeclado.nextLine());
		Curso curso = arrayCursos.get(indCurso);

		System.out.println("curso nombre: " + curso.nombre);
		System.out.println("curso limite: " + curso.limite);
		ArrayList<Usuario> arrayUsuarios = curso.getUsuariosIsncritos();

		System.out.println("Numero      Nombres     Apellidos     Edad     Tipo");
		int ind = 0;
		for (Usuario usuario : arrayUsuarios) {
			String nombres = usuario.nombres;
			String apellidos = usuario.apellidos;
			int edad = usuario.edad;
			String tipo = usuario.tipo;
			System.out.println(
					ind + "           " + nombres + "         " + apellidos + "         " + edad + "      " + tipo);
			ind++;
		}
	}
}