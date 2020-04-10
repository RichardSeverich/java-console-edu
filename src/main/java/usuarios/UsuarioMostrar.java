package usuarios;

import java.util.ArrayList;

public class UsuarioMostrar {

	public static void mostrar(ArrayList<Usuario> arrayUsuarios) {
		System.out.println("Numero      Nick      Contraseña      Nombres     Apellidos     Edad     Tipo");
		int ind = 0;
		for (Usuario usuario : arrayUsuarios) {
			String nick = usuario.nick;
			String nombres = usuario.nombres;
			String apellidos = usuario.apellidos;
			int edad = usuario.edad;
			String tipo = usuario.tipo;
			System.out.println(ind + "          " + nick + "      " + "***" + "		" + nombres + "         "
					+ apellidos + "         " + edad + "      " + tipo);
			ind++;
		}
	}
}
