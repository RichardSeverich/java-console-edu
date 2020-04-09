package cursos;

import java.util.Scanner;
import java.util.ArrayList;

public class CursoSwitch {

	public static ArrayList<Curso> arrayCursos = new ArrayList<>();

	public static void mostrar() {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		String opcion = "0";

		do {
			CursoMenu.mostrarMenu();
			// Eligiendo una opcion
			opcion = leerEntradaTeclado.nextLine();

			switch (opcion) {
				case "1":
					arrayCursos = CursoRegistrar.registrar(arrayCursos);
					break;
				case "2":
					CursoMostrar.mostrar(arrayCursos);
					break;
				case "3":
					arrayCursos = CursoEliminar.eliminar(arrayCursos);
					break;
				case "4":
					CursoEditar.editar(arrayCursos);
					break;
				case "5":
					System.out.println("salio");
					break;
				default:
					System.out.println("Opcion Incorrecta");
			}
		} while (!opcion.equals("5"));
	}

	public static ArrayList<Curso> getArrayCurso() {
		return arrayCursos;
	}
}
