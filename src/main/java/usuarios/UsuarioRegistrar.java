package usuarios;

import java.util.Scanner;
import java.util.ArrayList;

public class UsuarioRegistrar {

	public static ArrayList<Usuario> registrar(ArrayList<Usuario> arrayUsuarios) {
		Scanner leerEntradaTeclado = new Scanner(System.in);
		System.out.println("Entroo Registrar ");
		Usuario usuario = new Usuario();
		System.out.println("Ingrese el nickname de usuario");
		usuario.nick = leerEntradaTeclado.nextLine();
		System.out.println("Ingrese la contraseña");
		usuario.password = leerEntradaTeclado.nextLine();
		System.out.println("Ingrese el nombre Usuario");
		usuario.nombres = leerEntradaTeclado.nextLine();
		System.out.println("Ingrese el Apellidos Usuario");
		usuario.apellidos = leerEntradaTeclado.nextLine();
		System.out.println("Ingrese edad ");
		usuario.edad = Integer.parseInt(leerEntradaTeclado.nextLine());
		System.out.println("Igrese tipo");
		usuario.tipo = leerEntradaTeclado.nextLine();
		arrayUsuarios.add(usuario);
		return arrayUsuarios;
	}
}