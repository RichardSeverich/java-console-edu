import menu.Switch;
import menu.Acceso;

import cursos.CursoSwitch;
import usuarios.UsuarioSwitch;
import inscripciones.InscripcionSwitch;

public class Main {

  public static void main(String[] args) {
    UsuarioSwitch.usuarioPredeterminado();
    CursoSwitch.cursoPredeterminado();
    InscripcionSwitch.inscripcionPredeterminado();
    Acceso.mAcceso();
    Switch.mostrar();
  }
}
