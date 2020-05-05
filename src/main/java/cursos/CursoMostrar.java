package cursos;

import java.util.ArrayList;

import utiles.FixMostrar;

public class CursoMostrar {

  public static void mostrar(ArrayList<Curso> arrayCursos) {
    System.out.println("Numero   Nombre              limite ");
    int ind = 0;
    for (Curso curso : arrayCursos) {
      String num = FixMostrar.fix(String.valueOf(ind),9);
      String nombre = FixMostrar.fix(curso.nombre,20);
      String limite = FixMostrar.fix(String.valueOf(curso.limite),7);
      System.out.println(num + nombre + limite);
      ind++;
    }
  }
}