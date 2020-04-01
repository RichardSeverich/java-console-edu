package cursos;

public class CursoMostrar {

	public static void mostrar(Curso[] arrayCursos, int contador) {
		System.out.println("Numero      Nombre     limite ");
		for (int i = 0; i < contador; i = i + 1) {
			String nombre = arrayCursos[i].nombre;
			int limite = arrayCursos[i].limite;
			System.out.println(i + "           " + nombre + "         " + limite);
		}
	}
}