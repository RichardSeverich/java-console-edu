package usuarios;

import utiles.LimpiarPantalla;

public class UsuarioMenu {

  public static void mostrarMenu() {
    LimpiarPantalla.limpiar();
    System.out.println("******* MENU USUARIOS *******");
    System.out.println("1. Registrar Usuarios");
    System.out.println("2. Registrar Estudiantes");
    System.out.println("3. Registrar Profesores");
    System.out.println("4. Mostrar Usuarios");
    System.out.println("5. Eliminar Usuarios");
    System.out.println("6. Editar Usuarios");
    System.out.println("7. Salir");
  }
}
