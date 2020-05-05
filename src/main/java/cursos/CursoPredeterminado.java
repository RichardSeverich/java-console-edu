package cursos;

import java.util.ArrayList;

public class CursoPredeterminado {

  public static ArrayList<Curso> registrar(ArrayList<Curso> arrayCursos) {

    Curso curso = new Curso();
    curso.nombre = "Matematicas";
    curso.limite = 18;
    arrayCursos.add(0, curso);

    Curso curso1 = new Curso();
    curso1.nombre = "Literatura";
    curso1.limite = 21;
    arrayCursos.add(1, curso1);

    Curso curso2 = new Curso();
    curso2.nombre = "Ciencias sociales";
    curso2.limite = 15;
    arrayCursos.add(2, curso2);
    return arrayCursos;
  }
}
