package utiles;

public class FixMostrar {

  public static String fix(String texto, int valor) {
    StringBuilder result = new StringBuilder(texto);
    for (int i = 0; i < valor - texto.length(); i++) {
      result.append(" ");
    }
    return (result.toString());
  }
}
