package inscripciones;

import java.util.ArrayList;

import cursos.Curso;
import usuarios.Persona;

public class InscripcionPredeterminado {

  public static void registrar(ArrayList<Curso> arrayCursos, ArrayList<Persona> arrayUsuarios) {

    Curso curso = arrayCursos.get(0);
    Persona usuario1 = arrayUsuarios.get(1);
    curso.setUsuarios(usuario1);
    Persona usuario2 = arrayUsuarios.get(2);
    curso.setUsuarios(usuario2);
    Persona usuario3 = arrayUsuarios.get(3);
    curso.setUsuarios(usuario3);
    Persona usuario4 = arrayUsuarios.get(4);
    curso.setUsuarios(usuario4);
    Persona usuario5 = arrayUsuarios.get(5);
    curso.setUsuarios(usuario5);
    Persona usuario16 = arrayUsuarios.get(16);
    curso.setUsuarios(usuario16);

    Curso curso0 = arrayCursos.get(1);
    Persona usuario6 = arrayUsuarios.get(6);
    curso0.setUsuarios(usuario6);
    Persona usuario7 = arrayUsuarios.get(7);
    curso0.setUsuarios(usuario7);
    Persona usuario8 = arrayUsuarios.get(8);
    curso0.setUsuarios(usuario8);
    Persona usuario9 = arrayUsuarios.get(9);
    curso0.setUsuarios(usuario9);
    Persona usuario10 = arrayUsuarios.get(10);
    curso0.setUsuarios(usuario10);
    Persona usuario17 = arrayUsuarios.get(17);
    curso0.setUsuarios(usuario17);

    Curso curso1 = arrayCursos.get(2);
    Persona usuario11 = arrayUsuarios.get(11);
    curso1.setUsuarios(usuario11);
    Persona usuario12 = arrayUsuarios.get(12);
    curso1.setUsuarios(usuario12);
    Persona usuario13 = arrayUsuarios.get(13);
    curso1.setUsuarios(usuario13);
    Persona usuario14 = arrayUsuarios.get(14);
    curso1.setUsuarios(usuario14);
    Persona usuario15 = arrayUsuarios.get(15);
    curso1.setUsuarios(usuario15);
    Persona usuario18 = arrayUsuarios.get(18);
    curso1.setUsuarios(usuario18);
  }
}
