package cursos;

import utiles.LimpiarPantalla;

public class CursoMenu {

	public static void mostrarMenu() {
		LimpiarPantalla.limpiar();
		System.out.println("******* MENU CURSOS *******");
		System.out.println("1. Registrar Curso");
		System.out.println("2. Mostrar Cursos");
		System.out.println("3. Eliminar Curso");
		System.out.println("4. Editar Curso");
		System.out.println("5. Salir");
	}
}