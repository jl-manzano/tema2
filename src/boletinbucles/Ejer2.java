package boletinbucles;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		
		// declarar variable para almacenar un nº
		int num;
		
		// declarar variable booleana
		boolean esPrimo;
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// pedir num a usuario
		System.out.println("Introduzca un nº: ");
		
		// leer num introducido por usuario
		num = sc.nextInt();
		
		if (num <= 1) {
			esPrimo = false;
			System.out.println(esPrimo);
		}
		
		// crear bucle for
		for (int i = 1; i < num; i++) {
			
		for (int j = 2; j < Math.sqrt(num); j++) {
			if (num % j == 0) {
				esPrimo = false;
				System.out.println(esPrimo);
			} else {
				esPrimo = true;
				System.out.println(esPrimo);

			}
						
		}
		
		if (esPrimo) {
			
		}
				
		}
	}
}
