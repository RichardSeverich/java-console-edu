package usuarios;

import java.util.Scanner;
import java.util.ArrayList;

import utiles.PedirNumero;

public class UsuarioRegistrar {

  public static ArrayList<Persona> registrar(ArrayList<Persona> arrayUsuarios, String tipo) {
    Scanner leerEntradaTeclado = new Scanner(System.in);
    System.out.println("******* REGISTRO *******");
    Persona usuario = Fabrica.obtenerInstancia(tipo);
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
    arrayUsuarios.add(usuario);
    System.out.println("registrado exitosamente");
    return arrayUsuarios;
  }
}
