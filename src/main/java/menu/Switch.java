package menu;

import java.util.Scanner;

import usuarios.UsuarioSwitch;
import cursos.CursoSwitch;
import inscripciones.InscripcionSwitch;

public class Switch {

	public static void mostrar() {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		String opcion = "0";
		do {
			Menu.mostrarMenu();
			opcion = leerEntradaTeclado.nextLine();
			switch (opcion) {
				case "1":
					UsuarioSwitch.mostrar();
					break;
				case "2":
					CursoSwitch.mostrar();
					break;
				case "3":
					InscripcionSwitch.mostrar();
					break;
				case "4":
					System.out.println("Programa finalizado");
					leerEntradaTeclado.close();
					break;
				default:
					System.out.println("Opcion Incorrecta");
					System.out.println("presione enter para continuar");
					leerEntradaTeclado.nextLine();
			}
		} while (!opcion.equals("4"));
	}
}
