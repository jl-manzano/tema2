package boletinfor;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {

		// declarar variable para almacenar una nota
		double nota;

		// declarar variable e inicializar en 0 para almacenar suspensos
		int contSusp = 0;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear bucle for
		for (int i = 1; i <= 5; i++) {

			// pedir nota a usuario
			System.out.println("Introduzca una nota: ");

			// leer nota introducida por usuario
			nota = sc.nextDouble();

			// definir condicional if -> comprobar si nota < 5 (suspenso)
			if (nota < 5) { // entra si nota < 5

				// incrementar en 1 variable contSusp (suspensos)
				contSusp++;
			}

		}
		
		// mostrar nº suspensos en pantalla
		System.out.println("\nHay " + contSusp + " suspensos.");

		// cerrar scanner
		sc.close();
	}
}
