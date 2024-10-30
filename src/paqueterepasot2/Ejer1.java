package paqueterepasot2;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {

		// declarar variable para almacenar un num
		int num;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear bucle do-while -> asegurar de que usuario introduzca num
		do {
			// pedir num a usuario
			System.out.println("Introduzca el tamaño de los lados de su cuadrado: ");

			// leer num introducido por usuario
			num = sc.nextInt();

		} while (num <= 0);

		// crear bucle for -> filas
		for (int i = 1; i <= num; i++) {
			
			// crear bucle for -> columnas
			for (int j = 1; j <= num; j++) {
				
				// definir condicinal if - else -> comprobar si las filas o las columnas == 1 / == num
				if (i == 1 || i == num || j == 1 || j == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			// imprimir salto de línea
			System.out.println();
		}

	}
}
