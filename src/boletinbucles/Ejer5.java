package boletinbucles;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {

		// declarar variable para almacenar un num
		int num;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// pedir num a usuario
		System.out.println("Introduzca un nº del 1 al 20: ");

		// leer num introducido por usuario
		num = sc.nextInt();

		// declarar condicional if-else -> comprobar si num está fuera del rango (1-20)
		if (num <= 0 || num > 20) { // entra si num <= 0 o num > 20
			System.out.println("Número introducido fuera del rango.");
		} else {
			// crear bucle for
			for (int i = 1; i <= num; i++) {
				System.out.println();
				// crear bucle for
				for (int j = 0; j < i; j++) {
					System.out.print(i);
				}
			}
		}

		// cerrar scanner
		sc.close();
		
	}
}
