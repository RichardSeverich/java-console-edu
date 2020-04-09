package inscripciones;

import java.util.Scanner;
import java.util.ArrayList;

import cursos.Curso;
import usuarios.Usuario;
import cursos.CursoSwitch;
import usuarios.UsuarioSwitch;

public class InscripcionSwitch {

	public static void mostrar() {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		String opcion = "0";
		ArrayList<Curso> arrayCursos = CursoSwitch.getArrayCurso();
		ArrayList<Usuario> arrayUsuarios = UsuarioSwitch.getArrayUsuario();
		do {
			InscripcionMenu.mostrarMenu();
			opcion = leerEntradaTeclado.nextLine();

			switch (opcion) {
				case "1":
					InscripcionRegistrar.registrar(arrayCursos, arrayUsuarios);
					break;
				case "2":
					InscripcionMostrar.mostrar(arrayCursos);
					break;
				case "3":
					System.out.println("no habilitado");
					break;
				case "4":
					System.out.println("salio correctamente");
				default:
					System.out.println("Opcion Incorrecta");
			}
		} while (!opcion.equals("4"));
	}
}