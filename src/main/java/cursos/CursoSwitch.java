package cursos;

import java.util.Scanner;

public class CursoSwitch {

	public static void mostrar() {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		String opcion = "0";
		Curso[] arrayItems = new Curso[100];
		int contador = 0;
		do {
			CursoMenu.mostrarMenu();
			// Eligiendo una opcion
			opcion = leerEntradaTeclado.nextLine();
			switch (opcion) {
				case "1":
					arrayItems = CursoRegistrar.registrar(arrayItems, contador);
					contador = CursoRegistrar.contadorStatic;
					break;
				case "2":
					CursoMostrar.mostrar(arrayItems, contador);
					break;
				case "3":
					System.out.println("Entroo Eliminar");
					// Eliminar un elemento array
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
