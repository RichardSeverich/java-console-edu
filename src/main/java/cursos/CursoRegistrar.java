package cursos;

import java.util.Scanner;

public class CursoRegistrar {

	public static int contadorStatic;

	public static Curso[] registrar(final Curso[] arrayCursos, int contador) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		System.out.println("Entroo Registrar ");
		Curso curso = new Curso();
		//
		System.out.println("Ingrese el nombre del curso");
		curso.nombre = leerEntradaTeclado.nextLine();
		//
		System.out.println("Ingrese el Limite ");
		curso.limite = Integer.parseInt(leerEntradaTeclado.nextLine());
		//
		arrayCursos[contador] = curso;
		contador++;
		contadorStatic = contador;
		return arrayCursos;
	}
}
