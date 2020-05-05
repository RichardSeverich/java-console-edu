package inscripciones;

import java.util.ArrayList;

import usuarios.Persona;
import cursos.Curso;
import utiles.PedirNumero;
import utiles.FixMostrar;

public class InscripcionMostrar {

  public static void mostrar(ArrayList<Curso> arrayCursos) {
    int tamCurso = arrayCursos.size();
    System.out.println("******* MOSTRAR LISTA *******");
    System.out.println("ingrese indice del curso");
    int indCurso = PedirNumero.pedir();
    if (indCurso < tamCurso && indCurso >= 0) {
      Curso curso = arrayCursos.get(indCurso);
      System.out.println("CURSO NOMBRE: " + curso.nombre);
      System.out.println("CURSO LIMITE: " + curso.limite);
      ArrayList<Persona> arrayUsuarios = curso.getUsuariosIsncritos();
      System.out.println("Numero   Nombres     Apellidos   Edad   Tipo");
      int ind = 0;
      for (Persona usuario : arrayUsuarios) {
        String num = FixMostrar.fix(String.valueOf(ind),9);
        String nombres = FixMostrar.fix(usuario.nombres,12);
        String apellidos = FixMostrar.fix(usuario.apellidos,12);
        String edad =  FixMostrar.fix(String.valueOf(usuario.edad),7);
        String tipo = usuario.tipo;
        System.out.println(num + nombres + apellidos + edad + tipo);
        ind++;
      }
    } else {
      System.out.println("elemento seleccionado inexistente");
    }
  }
}
