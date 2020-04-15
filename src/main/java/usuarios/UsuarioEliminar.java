package usuarios;

import java.util.Scanner;
import java.util.ArrayList;

public class UsuarioEliminar {

	public static ArrayList<Persona> eliminar(ArrayList<Persona> arrayUsuarios) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		int tam = arrayUsuarios.size();
		System.out.println("******* ELIMINAR *******");
		System.out.println("ingrese el indice que desea eliminar");
		int ind = Integer.parseInt(leerEntradaTeclado.nextLine());
		if (ind < tam) {
			arrayUsuarios.remove(ind);
			System.out.println("se elimino exitosamente");
		} else {
			System.out.println("elemento seleccionado inexistente");
		}
		return arrayUsuarios;
	}
}