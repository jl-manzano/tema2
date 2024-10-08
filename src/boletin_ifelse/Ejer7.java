package boletin_ifelse;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		
		// DECLARAR VARIABLE TIPO ENTERO (INT) 
		int num;
		
		// CREAR OBJETO SCANNER
		Scanner sc = new Scanner(System.in);
		
		// IMPRIMIR MENSAJE EN PANTALLA PARA INTRODUCIR VALOR
		System.out.println("Introduzca un nº comprendido entre 0 y 99999: ");
		
		// LEER Nº ENTERO INGRESADO EN CONSOLA
		num = sc.nextInt();
		
		// COMPARAR SI Nº INTRODUCIDO ES < O  o > 99999
		if (num < 0 || num > 99999) {
			
			// IMPRIMIR RESULTADO PANTALLA SI Nº INTRODUCIDO ES <0 o >99999
			System.out.println("El nº " + num + " está fuera del rango.");
			
		// IMPRIMIR RESULTADO PANTALLA -> Nº DE CIFRAS QUE TIENE EL Nº INGRESADO EN CONSOLA
		} else {
			if (num < 10) {
				System.out.println("El nº " + num + " tiene 1 cifra.");
			} else if (num < 100) {
				System.out.println("El nº " + num + " tiene 2 cifras.");
			} else if (num < 1000) {
				System.out.println("El nº " + num + " tiene 3 cifras.");
			} else if (num < 10000) {
				System.out.println("El nº " + num + " tiene 4 cifras.");
			} else {
				System.out.println("El nº " + num + " tiene 5 cifras.");
			}
		}
		
		// CERRAR OBJETO SCANNER
		sc.close();
		
	}
}
