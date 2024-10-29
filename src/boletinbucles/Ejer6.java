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
		
		// crear bucle for
		for (int i = 1; i <= num; i++) {
			
			// crear bucle for -> espacios
			for (int j = num - i; j >= 1; j--) {
				System.out.print(" ");
			}
			
			// crear bucle for -> asteriscos '*'
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			
			// imprimir salto de línea
			System.out.println();
			
		}
		
		// cerrar scanner
		sc.close();
		
	}
}
