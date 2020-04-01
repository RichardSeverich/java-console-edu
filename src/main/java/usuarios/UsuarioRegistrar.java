package usuarios;

import java.util.Scanner;
import java.util.ArrayList;

public class UsuarioRegistrar {

	public static ArrayList<Usuario> registrar(ArrayList<Usuario> arrayUsuarios) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		System.out.println("Entroo Registrar ");
		// Añadir usuario
		Usuario usuario = new Usuario();
		// Nombres
		System.out.println("Ingrese el nombre Usuario");
		usuario.nombres = leerEntradaTeclado.nextLine();
		// Apellidos
		System.out.println("Ingrese el Apellidos Usuario");
		usuario.apellidos = leerEntradaTeclado.nextLine();
		// Edad
		System.out.println("Ingrese edad ");
		usuario.edad = Integer.parseInt(leerEntradaTeclado.nextLine());
		// Tipo
		System.out.println("Igrese tipo");
		usuario.tipo = leerEntradaTeclado.nextLine();
		// Añadir al array de usuarios:
		arrayUsuarios.add(usuario);
		return arrayUsuarios;
	}
}
