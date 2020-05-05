package usuarios;

import java.util.Scanner;
import java.util.ArrayList;

import utiles.LimpiarPantalla;

public class UsuarioSwitch {

  public static ArrayList<Persona> arrayUsuarios = new ArrayList<>();

  public static void mostrar() {
    Scanner leerEntradaTeclado = new Scanner(System.in);
    String opcion = "0";

    do {
      UsuarioMenu.mostrarMenu();
      // Eligiendo una opcion
      opcion = leerEntradaTeclado.nextLine();
      LimpiarPantalla.limpiar();
      switch (opcion) {
        case "1":
          arrayUsuarios = UsuarioRegistrar.registrar(arrayUsuarios, "Administrador");
          break;
        case "2":
          arrayUsuarios = UsuarioRegistrar.registrar(arrayUsuarios, "Estudiante");
          break;
        case "3":
          arrayUsuarios = UsuarioRegistrar.registrar(arrayUsuarios, "Profesor");
          break;
        case "4":
          UsuarioMostrar.mostrar(arrayUsuarios);
          break;
        case "5":
          arrayUsuarios = UsuarioEliminar.eliminar(arrayUsuarios);
          break;
        case "6":
          UsuarioEditar.editar(arrayUsuarios);
          break;
        case "7":
          System.out.println("salio");
          break;
        default:
          System.out.println("Opcion Incorrecta");
      }
      System.out.println("presione enter para continuar");
      leerEntradaTeclado.nextLine();
    } while (!opcion.equals("7"));
  }

  public static ArrayList<Persona> getArrayUsuario() {
    return arrayUsuarios;
  }

  public static void usuarioPredeterminado() {
    arrayUsuarios = UsuarioPredeterminado.registrar(arrayUsuarios);
  }
}
