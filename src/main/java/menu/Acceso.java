package menu;

import java.util.Scanner;

public class Acceso {

  public static void mAcceso() {

    Scanner leerEntradaTeclado = new Scanner(System.in);
    String usuario = "charly";
    String contrasena = "123";
    String user = "a";
    String password = "b";
    do {
      System.out.println("******* LOGIN DE USUARIO *******");
      System.out.println("introduzca el usuario");
      user = leerEntradaTeclado.nextLine();
      System.out.println("introduzca la contrasena");
      password = leerEntradaTeclado.nextLine();
      if ((usuario.equals(user) == false) || (contrasena.equals(password) == false)) {
        System.out.println("contrasena o usuario incorrecto");
      }
    } while ((usuario.equals(user) == false) || (contrasena.equals(password) == false));
    System.out.println("acceso permitido");
  }
}
