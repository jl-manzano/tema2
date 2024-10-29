package boletinbucles;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {

		// declarar variable para almacenar un num inicial
		int numInicial;

		// declarar variable para almacenar num1
		int num;

		// declarar variable para almacenar total nºs introducidos
		int contadorNum = 0;

		// declarar variable para almacenar total nºs fallados
		int contadorFallos = 0;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// pedir num inicial a usuario
		System.out.println("Introduzca un nº inicial: ");

		// leer num introducido por usuario
		numInicial = sc.nextInt();

		// crear bucle do-while
		do {

			System.out.println();

			// pedir num a usuario
			System.out.println("Introduzca un nº: ");

			// leer num introducido por usuario
			num = sc.nextInt();

			// incrementar en 1 contador num nºs introducidos
			contadorNum++;

			// definir condicional if-> comprobar si num es == 0 / <= numInicial

			if (num > 0 && num <= numInicial) { // entra si num <= numInicial)
				System.out.println("\nFallo, es menor");
				// incrementar en 1 contador num fallados
				contadorFallos++;

			}

			// asignar último nº dado a variable numInicial
			numInicial = num;

		} while (num != 0);

		// imprimir contador nºs introducidos en pantalla
		System.out.println("\nTotal de números introducidos: " + contadorNum);

		// imprimir contador nºs fallados en pantalla
		System.out.println("Números fallados: " + contadorFallos);

		// cerrar scanner
		sc.close();

	}
}
