package menu;

import java.util.Scanner;

public class Acceso {

	public static void mAcceso() {

		Scanner leerEntradaTeclado = new Scanner(System.in);
		String c = "charly";
		String i = "123";
		String a = "a";
		String b = "b";
		do {
			System.out.println("introduzca el usuario");
			a = leerEntradaTeclado.nextLine();
			System.out.println("introduzca la contraseña");
			b = leerEntradaTeclado.nextLine();
			if ((c.equals(a) == false) || (i.equals(b) == false)) {
				System.out.println("contraseña o usuario incorrecto");
			}
		} while ((c.equals(a) == false) || (i.equals(b) == false));
		System.out.println("acceso permitido");
	}
}