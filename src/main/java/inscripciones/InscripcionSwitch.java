package inscripciones;

import java.util.Scanner;
import java.util.ArrayList;

import cursos.Curso;
import usuarios.Persona;
import cursos.CursoSwitch;
import usuarios.UsuarioSwitch;
import utiles.LimpiarPantalla;

public class InscripcionSwitch {

  public static void mostrar() {
    Scanner leerEntradaTeclado = new Scanner(System.in);
    String opcion = "0";
    ArrayList<Curso> arrayCursos = CursoSwitch.getArrayCurso();
    ArrayList<Persona> arrayUsuarios = UsuarioSwitch.getArrayUsuario();
    do {
      InscripcionMenu.mostrarMenu();
      opcion = leerEntradaTeclado.nextLine();
      LimpiarPantalla.limpiar();
      switch (opcion) {
        case "1":
          InscripcionRegistrar.registrar(arrayCursos, arrayUsuarios);
          break;
        case "2":
          InscripcionMostrar.mostrar(arrayCursos);
          break;
        case "3":
          System.out.println("no habilitado");
          break;
        case "4":
          System.out.println("salio correctamente");
          break;
        default:
          System.out.println("Opcion Incorrecta");
      }
      System.out.println("presione enter para continuar");
      leerEntradaTeclado.nextLine();
    } while (!opcion.equals("4"));
  }

  public static void inscripcionPredeterminado() {
    ArrayList<Curso> arrayCursos = CursoSwitch.getArrayCurso();
    ArrayList<Persona> arrayUsuarios = UsuarioSwitch.getArrayUsuario();
    InscripcionPredeterminado.registrar(arrayCursos, arrayUsuarios);
  }
}
