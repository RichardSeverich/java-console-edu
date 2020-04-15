package utiles;

public class FixMostrar {

  public static String fix(String texto) {
    StringBuilder result = new StringBuilder(texto);
    for (int i = 0; i < 12 - texto.length(); i++) {
      result.append(" ");
    }
    return (result.toString());
  }
}
