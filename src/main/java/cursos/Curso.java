package cursos;

import java.util.ArrayList;

import usuarios.Usuario;

public class Curso {
	public String nombre;
	public int limite;
	private ArrayList<Usuario> listaUsuarios;

	public Curso() {
		this.listaUsuarios = new ArrayList<>();
	}

	public void setUsuarios(Usuario usuario) {
		this.listaUsuarios.add(usuario);
	}

	public ArrayList<Usuario> getUsuariosIsncritos() {
		return listaUsuarios;
	}
}