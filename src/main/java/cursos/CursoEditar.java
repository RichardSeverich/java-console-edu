package cursos;

import java.util.Scanner;
import java.util.ArrayList;

import utiles.PedirNumero;

public class CursoEditar {

  public static ArrayList<Curso> editar(ArrayList<Curso> arrayCursos) {
    Scanner leerEntradaTeclado = new Scanner(System.in);
    int tam = arrayCursos.size();
    System.out.println("******* EDITAR *******");
    System.out.println("ingrese el elemento que desea editar");
    int ind = PedirNumero.pedir();
    if (ind < tam && ind >= 0) {
      Curso curso = new Curso();
      System.out.println("Ingrese el nombre del curso");
      curso.nombre = leerEntradaTeclado.nextLine();
      System.out.println("Ingrese el Limite ");
      curso.limite = PedirNumero.pedir();
      arrayCursos.set(ind, curso);
    } else {
      System.out.println("elemento seleccionado inexistente");
    }
  return arrayCursos;
  }
}
