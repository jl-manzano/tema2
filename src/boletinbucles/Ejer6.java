package boletinbucles;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		
		// declarar variable para almacenar num
		int num;
		
		// crear scanner
		Scanner sc = new Scanner(System.in);

		// pedir num a usuario
		System.out.println("Introduzca un nº: ");

		// leer num introducido por usuario
		num = sc.nextInt();
		
		System.out.println();
		
		// crear bucle for
		for (int i = 1; i <= num; i++) {
			
			// crear bucle for
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			
			// crear bucle for
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			
			// salto de línea
			System.out.println();
		}
		
		// cerrar scanner
		sc.close();
		
	}
}
