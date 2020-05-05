package inscripciones;

import utiles.LimpiarPantalla;

public class InscripcionMenu {

  public static void mostrarMenu() {
    LimpiarPantalla.limpiar();
    System.out.println("******* MENU INSCRIPCIONES *******");
    System.out.println("1. Registrar inscripcion");
    System.out.println("2. Mostrar inscripcion");
    System.out.println("3. Eliminar inscripcion");
    System.out.println("4. Salir");
  }
}
