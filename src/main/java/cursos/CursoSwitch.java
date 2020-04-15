package cursos;

import java.util.Scanner;
import java.util.ArrayList;

import utiles.LimpiarPantalla;

public class CursoSwitch {

	public static ArrayList<Curso> arrayCursos = new ArrayList<>();

	public static void mostrar() {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		String opcion = "0";
		do {
			CursoMenu.mostrarMenu();
			// Eligiendo una opcion
			opcion = leerEntradaTeclado.nextLine();
			LimpiarPantalla.limpiar();
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
			System.out.println("presione enter para continuar");
			leerEntradaTeclado.nextLine();
		} while (!opcion.equals("5"));
	}

	public static ArrayList<Curso> getArrayCurso() {
		return arrayCursos;
	}

	public static void cursoPredeterminado() {
		arrayCursos = CursoPredeterminado.registrar(arrayCursos);
	}
}
