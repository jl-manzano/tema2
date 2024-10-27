package boletinbucles;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		
		// declarar variable para almacenar un nº
		int num;
		
		// declarar variable booleana
		boolean esPrimo;
		
		// declarar variable e inicializar en 0 para almacenar contador
		int contador = 0;
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// pedir num a usuario
		System.out.println("Introduzca un nº: ");
		
		// leer num introducido por usuario
		num = sc.nextInt();
		
		// crear bucle for
		for (int i = 2; i <= num; i++) {
			esPrimo = true;
			// crear bucle for
			for (int j = 2; j <= Math.sqrt(i); j++) {
				
				// declarar condicional if -> comprobar si el nº tiene divisores
				if (i % j == 0) { // entra si el resto de la división es 0
					esPrimo = false;
				}
			}
			
			// declarar condicional if -> contar nºs primos
			if (esPrimo) { //entra si esPrimo = true
				contador++;
			}
			
		}
		
		// imprimir resultado pantalla
		System.out.println("Hay " + contador + " números primos entre 1 y " + num);
		
		// cerrar scanner
		sc.close();
		
	}
}
