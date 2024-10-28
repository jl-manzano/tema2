package boletinfor;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		
		// declarar variable para almacenar un num
		int num;
		
		// declarar variable 'booleana' e inicializar como true
		boolean esPrimo = true;
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// pedir num a usuario
		System.out.println("Introduzca un nº: ");
		
		// leer num introducido por usuario
		num = sc.nextInt();
		
		// declarar condicional if -> comprobar si num es <= 1
		if (num <= 1) {
			esPrimo = false;
		} else {
		
		// crear bucle for
		for (int i = 2; i <= Math.sqrt(num); i++) {
			
			// declarar condicional if -> comprobar si el nº tiene divisores
			if (num % i == 0) { // entra si el resto de la división es 0
				esPrimo = false;
			}
		}
		
		}
		
		// declarar condicional if-else -> comparar valor variable 'esPrimo' e imprimir resultado pantalla 
		if (esPrimo) { // entra si variable 'esPrimo' es 'true'
			System.out.println("\nEl número " + num + " es primo");
		} else { // entra si variable 'esPrimo' es distinto de true -> false
			System.out.println("\nEl número " + num + " no es primo");
		}
		
		// cerrar scanner
		sc.close();
		
	}
}
