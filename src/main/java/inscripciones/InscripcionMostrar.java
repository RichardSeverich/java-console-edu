package inscripciones;

import java.util.ArrayList;
import java.util.Scanner;

import usuarios.Persona;
import cursos.Curso;
import utiles.LimpiarPantalla;

public class InscripcionMostrar {

	public static void mostrar(ArrayList<Curso> arrayCursos) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		LimpiarPantalla.limpiar();
		System.out.println("******* MOSTRAR LISTA *******");
		System.out.println("ingrese indice del curso");
		int indCurso = Integer.parseInt(leerEntradaTeclado.nextLine());
		Curso curso = arrayCursos.get(indCurso);

		System.out.println("curso nombre: " + curso.nombre);
		System.out.println("curso limite: " + curso.limite);
		ArrayList<Persona> arrayUsuarios = curso.getUsuariosIsncritos();

		System.out.println("Numero      Nombres     Apellidos     Edad     Tipo");
		int ind = 0;
		for (Persona usuario : arrayUsuarios) {
			String nombres = usuario.nombres;
			String apellidos = usuario.apellidos;
			int edad = usuario.edad;
			String tipo = usuario.tipo;
			System.out
					.println(ind + "           " + nombres + "         " + apellidos + "         " + edad + "      " + tipo);
			ind++;
		}
		System.out.println("presione enter para continuar");
		leerEntradaTeclado.nextLine();
	}
}