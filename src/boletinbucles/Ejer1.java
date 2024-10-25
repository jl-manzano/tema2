package boletinbucles;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {

		// declarar variable para almacenar la hora
		int hora;

		// declarar variable para almacenar la hora
		int minutos;

		// declarar variable para almacenar la hora
		int segundos;

		// declarar variable para almacenar la cantidad de segundos a incrementar
		int incremento;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("RELOJ");

		// pedir hora a usuario
		System.out.println("\nIntroduzca la hora: ");

		// leer hora introducida por usuario
		hora = sc.nextInt();

		// pedir minutos a usuario
		System.out.println("Introduzca los minutos: ");

		// leer minutos introducidos por usuario
		minutos = sc.nextInt();

		// pedir segundos a usuario
		System.out.println("Introduzca los segundos: ");

		// leer segundos introducidos por usuario
		segundos = sc.nextInt();

		// pedir segundos a incrementar a usuario
		System.out.println("\nIntroduzca los segundos a incrementar: ");

		// leer segundos a incrementar introducidos por usuario
		incremento = sc.nextInt();

		// crear bucle for
		for (int i = 0; i < incremento; i++) {

			// incrementar variable segundos en 1
			segundos++;

			// definir condicional if -> verificar si valores son válidos
			if (hora < 0 || hora > 23 || minutos < 0 || minutos > 60 || segundos < 0 || segundos > 60) {

				// imprimir mensaje valores inválidos
				System.out.println("VALORES INTRODUCIDOS NO VÁLIDOS");

			} else {
				if (segundos == 60) { // entra si segundos = 60
					segundos = 00;
					minutos++;
				}

				if (minutos == 60) { // entra si minutos = 60
					minutos = 00;
					hora++;
				}

				if (hora == 24) { // entra si hora = 60
					hora = 00;
				}
			}

		}

		// mostrar resultado pantalla
		System.out.printf("\nLa hora después de incrementar un segundos es %02d:%02d:%02d\n", hora, minutos, segundos);

		// mostrar fin programa
		System.out.println("\nFin del programa");

		// cerrar scanner
		sc.close();
	}
}
