package usuarios;

import java.util.Scanner;
import java.util.ArrayList;

public class UsuarioSwitch {

	public static ArrayList<Usuario> arrayUsuarios = new ArrayList<>();

	public static void mostrar() {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		String opcion = "0";

		do {
			UsuarioMenu.mostrarMenu();
			// Eligiendo una opcion
			opcion = leerEntradaTeclado.nextLine();

			switch (opcion) {
				case "1":
					arrayUsuarios = UsuarioRegistrar.registrar(arrayUsuarios);
					break;
				case "2":
					UsuarioMostrar.mostrar(arrayUsuarios);
					break;
				case "3":
					arrayUsuarios = UsuarioEliminar.eliminar(arrayUsuarios);
					break;
				case "4":
					UsuarioEditar.editar(arrayUsuarios);
					break;
				case "5":
					System.out.println("salio");
					break;
				default:
					System.out.println("Opcion Incorrecta");
			}
		} while (!opcion.equals("5"));

	}

	public static ArrayList<Usuario> getArrayUsuario() {
		return arrayUsuarios;
	}

	public static void usuarioPredeterminado() {
		arrayUsuarios = UsuarioPredeterminado.registrar(arrayUsuarios);
	}
}
