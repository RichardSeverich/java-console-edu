package usuarios;

import java.util.ArrayList;
import utiles.FixMostrar;

public class UsuarioMostrar {

  public static void mostrar(ArrayList<Persona> arrayUsuarios) {
    System.out.println("******* REGISTRO DE PERSONAS *******");
    System.out.println("Numero   Nick     Contrasena  Nombres     Apellidos   Edad   Tipo");
    int ind = 0;
    for (Persona usuario : arrayUsuarios) {
      String num = FixMostrar.fix(String.valueOf(ind),9);
      String nick = FixMostrar.fix(usuario.nick,9);
      String nombres = FixMostrar.fix(usuario.nombres,12);
      String apellidos = FixMostrar.fix(usuario.apellidos,12);
      String edad =  FixMostrar.fix(String.valueOf(usuario.edad),7);
      String tipo = usuario.tipo;
      System.out.println(num + nick + "*******     " + nombres + apellidos + edad + tipo);
      ind++;
    }
  }
}
