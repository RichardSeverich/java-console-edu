package inscripciones;

import java.util.ArrayList;

import cursos.Curso;
import usuarios.Persona;
import utiles.LimpiarPantalla;
import utiles.PedirNumero;

public class InscripcionRegistrar {

  public static void registrar(ArrayList<Curso> arrayCursos, ArrayList<Persona> arrayUsuarios) {
    int tamCurso = arrayCursos.size();
    int tamUsuario = arrayUsuarios.size();
    System.out.println("*******  REGISTRO *******");
    System.out.println("ingrese indice del curso");
    int indCurso = PedirNumero.pedir();
    if (indCurso < tamCurso && indCurso >= 0) {
      Curso curso = arrayCursos.get(indCurso);
      System.out.println("ingrese el indice del estudiante");
      int indEstudiante = PedirNumero.pedir();
      if (indEstudiante < tamUsuario && indEstudiante >= 0) {
      Persona usuario = arrayUsuarios.get(indEstudiante);
      curso.setUsuarios(usuario);
      System.out.println("Registrado exitosamente");
      } else {
      System.out.println("elemento seleccionado inexistente");
      }
    } else {
      System.out.println("elemento seleccionado inexistente");
    }
  }
}
