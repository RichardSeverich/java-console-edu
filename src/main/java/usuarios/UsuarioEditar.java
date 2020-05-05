package usuarios;

import java.util.Scanner;
import java.util.ArrayList;

import utiles.PedirNumero;

public class UsuarioEditar {

  public static ArrayList<Persona> editar(ArrayList<Persona> arrayUsuarios) {
    Scanner leerEntradaTeclado = new Scanner(System.in);
    int tam = arrayUsuarios.size();
    System.out.println("******* EDITAR *******");
    System.out.println("ingrese el elemento que desea editar");
    int ind = PedirNumero.pedir();
    if (ind < tam && ind >= 0){
      Persona usuario = arrayUsuarios.get(ind);
      System.out.println("Ingrese el nickname de usuario");
      usuario.nick = leerEntradaTeclado.nextLine();
      System.out.println("Ingrese la contrasena");
      usuario.password = leerEntradaTeclado.nextLine();
      System.out.println("Ingrese el nombre Usuario");
      usuario.nombres = leerEntradaTeclado.nextLine();
      System.out.println("Ingrese el Apellidos Usuario");
      usuario.apellidos = leerEntradaTeclado.nextLine();
      System.out.println("Ingrese edad ");
      usuario.edad = PedirNumero.pedir();
      arrayUsuarios.set(ind, usuario);
      System.out.println("editado exitosamente");
    } else {
      System.out.println("elemento seleccionado inexistente");
    }
    return arrayUsuarios;
  }
}
