package usuarios;

import java.util.Scanner;
import java.util.ArrayList;

public class UsuarioSwitch {

	public static void mostrar() {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		String opcion = "0";

		// Aca estamos importando al usuario.
		// Usuario[] arrayUsuarios = new Usuario[100];
		ArrayList<Usuario> arrayUsuarios = new ArrayList();
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
					System.out.println("Entroo Editar");
					break;
				case "5":
					System.out.println("Entroo Salir");
					break;
				default:
					System.out.println("Opcion Incorrecta");
			}
		} while (!opcion.equals("5"));

	}
}
