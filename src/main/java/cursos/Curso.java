package cursos;

import java.util.ArrayList;

import usuarios.Persona;

public class Curso {
  public String nombre;
  public int limite;
  private ArrayList<Persona> listaUsuarios;

  public Curso() {
    this.listaUsuarios = new ArrayList<>();
  }

  public void setUsuarios(Persona usuario) {
    this.listaUsuarios.add(usuario);
  }

  public ArrayList<Persona> getUsuariosIsncritos() {
    return listaUsuarios;
  }
}
