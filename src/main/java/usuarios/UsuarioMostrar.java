package usuarios;

import java.util.ArrayList;

public class UsuarioMostrar {

	public static void mostrar(ArrayList<Usuario> arrayUsuarios) {
		System.out.println("Numero      Nombres     Apellidos     Edad     Tipo");
		int ind=0;
		for(Usuario usuario: arrayUsuarios){
			String nombres = usuario.nombres;
			String apellidos = usuario.apellidos;
			int edad = usuario.edad;
			String tipo = usuario.tipo;
			System.out.println(ind + "           " + nombres + "         " + apellidos + "         " + edad + "      " + tipo);	
			ind++;
		}
	}
}