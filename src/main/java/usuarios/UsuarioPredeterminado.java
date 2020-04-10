package usuarios;

import java.util.ArrayList;

public class UsuarioPredeterminado {

	public static ArrayList<Usuario> registrar(ArrayList<Usuario> arrayUsuarios) {

		Usuario usuario = new Usuario();
		usuario.nick = "adm";
		usuario.password = "admin123";
		usuario.nombres = "joao";
		usuario.apellidos = "paredes";
		usuario.edad = 18;
		usuario.tipo = "administrador";
		arrayUsuarios.add(0, usuario);

		Usuario usuario1 = new Usuario();
		usuario1.nick = "char";
		usuario1.password = "123";
		usuario1.nombres = "charly";
		usuario1.apellidos = "meneces";
		usuario1.edad = 20;
		usuario1.tipo = "estudiante";
		arrayUsuarios.add(1, usuario1);

		Usuario usuario2 = new Usuario();
		usuario2.nick = "ric";
		usuario2.password = "hola123";
		usuario2.nombres = "richard";
		usuario2.apellidos = "severich";
		usuario2.edad = 30;
		usuario2.tipo = "estudiante";
		arrayUsuarios.add(2, usuario2);

		Usuario usuario3 = new Usuario();
		usuario3.nick = "jor";
		usuario3.password = "wert";
		usuario3.nombres = "jorge";
		usuario3.apellidos = "nitales";
		usuario3.edad = 18;
		usuario3.tipo = "estudiante";
		arrayUsuarios.add(3, usuario3);

		Usuario usuario4 = new Usuario();
		usuario4.nick = "car";
		usuario4.password = "car345";
		usuario4.nombres = "carson";
		usuario4.apellidos = "nadales";
		usuario4.edad = 22;
		usuario4.tipo = "estudiante";
		arrayUsuarios.add(4, usuario4);

		Usuario usuario5 = new Usuario();
		usuario5.nick = "rod";
		usuario5.password = "rod987";
		usuario5.nombres = "rodo";
		usuario5.apellidos = "padilla";
		usuario5.edad = 25;
		usuario5.tipo = "estudiante";
		arrayUsuarios.add(5, usuario5);

		Usuario usuario6 = new Usuario();
		usuario6.nick = "ros";
		usuario6.password = "ros345";
		usuario6.nombres = "rosa";
		usuario6.apellidos = "melano";
		usuario6.edad = 21;
		usuario6.tipo = "estudiante";
		arrayUsuarios.add(6, usuario6);

		Usuario usuario7 = new Usuario();
		usuario7.nick = "han";
		usuario7.password = "han856";
		usuario7.nombres = "hanzo";
		usuario7.apellidos = "lober";
		usuario7.edad = 18;
		usuario7.tipo = "estudiante";
		arrayUsuarios.add(7, usuario7);

		Usuario usuario8 = new Usuario();
		usuario8.nick = "rip";
		usuario8.password = "rip345";
		usuario8.nombres = "ripo";
		usuario8.apellidos = "rodriguez";
		usuario8.edad = 17;
		usuario8.tipo = "estudiante";
		arrayUsuarios.add(8, usuario8);

		Usuario usuario9 = new Usuario();
		usuario9.nick = "rod";
		usuario9.password = "rodo34";
		usuario9.nombres = "rodriogo";
		usuario9.apellidos = "gutierrez";
		usuario9.edad = 22;
		usuario9.tipo = "estudiante";
		arrayUsuarios.add(9, usuario9);

		Usuario usuario10 = new Usuario();
		usuario10.nick = "ron";
		usuario10.password = "ron123";
		usuario10.nombres = "ronal";
		usuario10.apellidos = "camacho";
		usuario10.edad = 27;
		usuario10.tipo = "estudiante";
		arrayUsuarios.add(10, usuario10);

		Usuario usuario11 = new Usuario();
		usuario11.nick = "man";
		usuario11.password = "man756";
		usuario11.nombres = "manuel";
		usuario11.apellidos = "rocha";
		usuario11.edad = 23;
		usuario11.tipo = "estudiante";
		arrayUsuarios.add(11, usuario11);

		Usuario usuario12 = new Usuario();
		usuario12.nick = "mar";
		usuario12.password = "mar876";
		usuario12.nombres = "marco";
		usuario12.apellidos = "diaz";
		usuario12.edad = 18;
		usuario12.tipo = "estudiante";
		arrayUsuarios.add(12, usuario12);

		Usuario usuario13 = new Usuario();
		usuario13.nick = "mel";
		usuario13.password = "mel65";
		usuario13.nombres = "melissa";
		usuario13.apellidos = "cordoba";
		usuario13.edad = 20;
		usuario13.tipo = "estudiante";
		arrayUsuarios.add(13, usuario13);

		Usuario usuario14 = new Usuario();
		usuario14.nick = "mic";
		usuario14.password = "123";
		usuario14.nombres = "michael";
		usuario14.apellidos = "herbas";
		usuario14.edad = 18;
		usuario14.tipo = "estudiante";
		arrayUsuarios.add(14, usuario14);

		Usuario usuario15 = new Usuario();
		usuario15.nick = "dav";
		usuario15.password = "dav976";
		usuario15.nombres = "david";
		usuario15.apellidos = "verguer";
		usuario15.edad = 24;
		usuario15.tipo = "profesor";
		arrayUsuarios.add(15, usuario15);
		return arrayUsuarios;
	}
}