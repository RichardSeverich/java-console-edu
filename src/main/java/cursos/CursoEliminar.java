package cursos;

import java.util.ArrayList;

import utiles.PedirNumero;


public class CursoEliminar {

  public static ArrayList<Curso> eliminar(ArrayList<Curso> arrayCursos) {
    int tam = arrayCursos.size();
    System.out.println("******* ELIMINAR *******");
    System.out.println("ingrese el indice que desea eliminar");
    int ind = PedirNumero.pedir();
    if (ind < tam && ind >= 0){
      arrayCursos.remove(ind);
      System.out.println("se elimino exitosamente");
    } else {
      System.out.println("elemento seleccionado inexistente");
    }
    return arrayCursos;
  }
}
