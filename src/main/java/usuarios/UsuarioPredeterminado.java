package usuarios;

import java.util.ArrayList;

public class UsuarioPredeterminado {

  public static ArrayList<Persona> registrar(ArrayList<Persona> arrayUsuarios) {

    Usuario usuario = new Usuario();
    usuario.nick = "adm";
    usuario.password = "admin123";
    usuario.nombres = "joao";
    usuario.apellidos = "paredes";
    usuario.edad = 18;
    arrayUsuarios.add(0, usuario);

    Persona usuario1 = new Estudiante();
    usuario1.nick = "char";
    usuario1.password = "123";
    usuario1.nombres = "charly";
    usuario1.apellidos = "meneces";
    usuario1.edad = 20;
    arrayUsuarios.add(1, usuario1);

    Persona usuario2 = new Estudiante();
    usuario2.nick = "ric";
    usuario2.password = "hola123";
    usuario2.nombres = "richard";
    usuario2.apellidos = "severich";
    usuario2.edad = 30;
    arrayUsuarios.add(2, usuario2);

    Persona usuario3 = new Estudiante();
    usuario3.nick = "jor";
    usuario3.password = "wert";
    usuario3.nombres = "jorge";
    usuario3.apellidos = "nitales";
    usuario3.edad = 18;
    arrayUsuarios.add(3, usuario3);

    Persona usuario4 = new Estudiante();
    usuario4.nick = "car";
    usuario4.password = "car345";
    usuario4.nombres = "carson";
    usuario4.apellidos = "nadales";
    usuario4.edad = 22;
    arrayUsuarios.add(4, usuario4);

    Persona usuario5 = new Estudiante();
    usuario5.nick = "rod";
    usuario5.password = "rod987";
    usuario5.nombres = "rodo";
    usuario5.apellidos = "padilla";
    usuario5.edad = 25;
    arrayUsuarios.add(5, usuario5);

    Persona usuario6 = new Estudiante();
    usuario6.nick = "ros";
    usuario6.password = "ros345";
    usuario6.nombres = "rosa";
    usuario6.apellidos = "melano";
    usuario6.edad = 21;
    arrayUsuarios.add(6, usuario6);

    Persona usuario7 = new Estudiante();
    usuario7.nick = "han";
    usuario7.password = "han856";
    usuario7.nombres = "hanzo";
    usuario7.apellidos = "lober";
    usuario7.edad = 18;
    arrayUsuarios.add(7, usuario7);

    Persona usuario8 = new Estudiante();
    usuario8.nick = "rip";
    usuario8.password = "rip345";
    usuario8.nombres = "ripo";
    usuario8.apellidos = "rodriguez";
    usuario8.edad = 17;
    arrayUsuarios.add(8, usuario8);

    Persona usuario9 = new Estudiante();
    usuario9.nick = "rod";
    usuario9.password = "rodo34";
    usuario9.nombres = "rodriogo";
    usuario9.apellidos = "gutierrez";
    usuario9.edad = 22;
    arrayUsuarios.add(9, usuario9);

    Persona usuario10 = new Estudiante();
    usuario10.nick = "ron";
    usuario10.password = "ron123";
    usuario10.nombres = "ronal";
    usuario10.apellidos = "camacho";
    usuario10.edad = 27;
    arrayUsuarios.add(10, usuario10);

    Persona usuario11 = new Estudiante();
    usuario11.nick = "man";
    usuario11.password = "man756";
    usuario11.nombres = "manuel";
    usuario11.apellidos = "rocha";
    usuario11.edad = 23;
    arrayUsuarios.add(11, usuario11);

    Persona usuario12 = new Estudiante();
    usuario12.nick = "mar";
    usuario12.password = "mar876";
    usuario12.nombres = "marco";
    usuario12.apellidos = "diaz";
    usuario12.edad = 18;
    arrayUsuarios.add(12, usuario12);

    Persona usuario13 = new Estudiante();
    usuario13.nick = "mel";
    usuario13.password = "mel65";
    usuario13.nombres = "melissa";
    usuario13.apellidos = "cordoba";
    usuario13.edad = 20;
    arrayUsuarios.add(13, usuario13);

    Persona usuario14 = new Estudiante();
    usuario14.nick = "mic";
    usuario14.password = "123";
    usuario14.nombres = "michael";
    usuario14.apellidos = "herbas";
    usuario14.edad = 18;
    arrayUsuarios.add(14, usuario14);

    Persona usuario15 = new Estudiante();
    usuario15.nick = "dav";
    usuario15.password = "dav976";
    usuario15.nombres = "david";
    usuario15.apellidos = "verguer";
    usuario15.edad = 24;
    arrayUsuarios.add(15, usuario15);

    Persona usuario16 = new Profesor();
    usuario16.nick = "ber";
    usuario16.password = "ber453";
    usuario16.nombres = "berno";
    usuario16.apellidos = "grabel";
    usuario16.edad = 29;
    arrayUsuarios.add(16, usuario16);

    Persona usuario17 = new Profesor();
    usuario17.nick = "alf";
    usuario17.password = "alf976";
    usuario17.nombres = "alfredo";
    usuario17.apellidos = "muñoz";
    usuario17.edad = 24;
    arrayUsuarios.add(17, usuario17);

    Persona usuario18 = new Profesor();
    usuario18.nick = "isa";
    usuario18.password = "isa456";
    usuario18.nombres = "isaias";
    usuario18.apellidos = "peñafiel";
    usuario18.edad = 24;
    arrayUsuarios.add(18, usuario18);

    return arrayUsuarios;
  }
}
