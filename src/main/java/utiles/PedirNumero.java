package utiles;

import java.util.Scanner;

public class PedirNumero {

  public static int pedir() {
    Scanner leer = new Scanner(System.in);
    int opc = 0;
    // Pidiendo una opcion "correcta"
    boolean repeticion = true;
    while (repeticion) {
      // Validaciones
      try {
        // System.out.println("Ingrese un valor numerico");
        opc = leer.nextInt();
        repeticion = false;
        // hagarra el error
      } catch (Exception e) {
        System.out.println(e);
        System.out.println("Opcion incorrecta ingrese un valor numerico");
        leer.reset();
        leer.next();
      }
    }
    return opc;
  }
}
