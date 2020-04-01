package usuarios;

import java.util.Scanner;
import java.util.ArrayList;

public class UsuarioEliminar {

	public static ArrayList<Usuario> eliminar(ArrayList<Usuario> arrayUsuarios) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		System.out.println("ingrese el indice que desea eliminar");
		int ind = Integer.parseInt(leerEntradaTeclado.nextLine());
		arrayUsuarios.remove(ind);
		System.out.println("se elimino exitosamente");
		return arrayUsuarios;
	}
}