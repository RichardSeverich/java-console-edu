package utiles;

import java.util.Scanner;

public class PedirNumero {

	public static int pedir() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		// Pidiendo una opcion "correcta"
		boolean repeticion = true;
		while (repeticion) {
			// Validaciones
			try {
				System.out.println("Ingrese una opcion numerica");
				opc = leer.nextInt();
				repeticion = false;
				// hagarra el error
			} catch (Exception e) {
				System.out.println("Opcion incorrecta ingrese un (numero)");
				System.out.println(e);
				leer.reset();
				leer.next();
			}
		}
		return opc;
	}

}
