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


		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
				
				if (j < num - i - 1) {
					System.out.print(" ");
			}

			}
			
			System.out.println();
			
		}

	}
}
