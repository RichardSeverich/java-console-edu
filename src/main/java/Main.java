import menu.Switch;
import menu.Acceso;

import usuarios.UsuarioSwitch;
import cursos.CursoSwitch;

public class Main {

	public static void main(String[] args) {
		UsuarioSwitch.usuarioPredeterminado();
		CursoSwitch.cursoPredeterminado();
		Acceso.mAcceso();
		Switch.mostrar();
	}
}
