package usuarios;

import java.util.ArrayList;

public class UsuarioMostrar {

	public static void mostrar(ArrayList<Persona> arrayUsuarios) {
		System.out.println("******* REGISTRO DE PERSONAS *******");
		System.out.println("Numero      Nick      Contraseña      Nombres     Apellidos     Edad     Tipo");
		int ind = 0;
		for (Persona usuario : arrayUsuarios) {
			String nick = usuario.nick;
			String nombres = usuario.nombres;
			String apellidos = usuario.apellidos;
			int edad = usuario.edad;
			String tipo = usuario.tipo;
			System.out.println(ind + "          " + nick + "      " + "***" + "		" + nombres + "         " + apellidos
					+ "         " + edad + "      " + tipo);
			ind++;

		}
	}
}
