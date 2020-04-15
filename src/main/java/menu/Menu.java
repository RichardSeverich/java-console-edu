package menu;

import utiles.LimpiarPantalla;

public class Menu {

	public static void mostrarMenu() {
		LimpiarPantalla.limpiar();
		System.out.println("******* MENU PRINCIPAL *******");
		System.out.println("1. Adm. Usuarios");
		System.out.println("2. Adm. cursos");
		System.out.println("3. Adm. Inscripciones");
		System.out.println("4. Salir");
	}
}
