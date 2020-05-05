package usuarios;

import java.util.ArrayList;

import utiles.PedirNumero;

public class UsuarioEliminar {

  public static ArrayList<Persona> eliminar(ArrayList<Persona> arrayUsuarios) {
    int tam = arrayUsuarios.size();
    System.out.println("******* ELIMINAR *******");
    System.out.println("ingrese el indice que desea eliminar");
    int ind = PedirNumero.pedir();
    if (ind < tam && ind >= 0){
      arrayUsuarios.remove(ind);
      System.out.println("se elimino exitosamente");
    } else {
      System.out.println("elemento seleccionado inexistente");
    }
    return arrayUsuarios;
  }
}
