package usuarios;

public class Fabrica {

  public static Persona obtenerInstancia(String tipo) {
    Persona persona;
    switch (tipo) {
      case "Administrador":
        persona = new Usuario();
        break;
      case "Estudiante":
        persona = new Estudiante();
        break;
      case "Profesor":
        persona = new Profesor();
        break;
      default:
        persona = new Usuario();
    }
    return persona;
  }

}