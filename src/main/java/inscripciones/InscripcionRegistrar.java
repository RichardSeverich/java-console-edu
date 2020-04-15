package inscripciones;

import java.util.Scanner;
import java.util.ArrayList;

import cursos.Curso;
import usuarios.Persona;
import utiles.LimpiarPantalla;

public class InscripcionRegistrar {

	public static void registrar(ArrayList<Curso> arrayCursos, ArrayList<Persona> arrayUsuarios) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		LimpiarPantalla.limpiar();
		System.out.println("******* ELIMINAR REGISTRO *******");
		System.out.println("ingrese indice del curso");
		int indCurso = Integer.parseInt(leerEntradaTeclado.nextLine());
		Curso curso = arrayCursos.get(indCurso);
		System.out.println("ingrese el indice del estudiante");
		int indEstudiante = Integer.parseInt(leerEntradaTeclado.nextLine());
		Persona usuario = arrayUsuarios.get(indEstudiante);
		curso.setUsuarios(usuario);
		System.out.println("eliminado exitosamente");
		System.out.println("presione enter para continuar");
		leerEntradaTeclado.nextLine();
	}
}