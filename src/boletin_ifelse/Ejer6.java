package boletin_ifelse;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {

		// DECLARAR VARIALES TIPO ENTERO (INT) Y DECIMAL (DOUBLE)
		int a;
		int b;
		int c;
		double discriminante;
		double x1;
		double x2;

		// CREAR OBJETO SCANNER QUE PERMITE LEER ENTRADAS DATOS DESDE CONSOLA
		Scanner sc = new Scanner(System.in);

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce el valor de 'a': ");

		// LEER Nº (TIPO DOUBLE) INGRESADO EN CONSOLA
		a = sc.nextInt();

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce el valor de 'b': ");

		// LEER Nº (TIPO DOUBLE) INGRESADO EN CONSOLA
		b = sc.nextInt();

		// IMPRIMIR MENSAJE EN CONSOLA PARA INTRODUCIR VALOR
		System.out.println("Introduce el valor de 'c': ");

		// LEER Nº (TIPO DOUBLE) INGRESADO EN CONSOLA
		c = sc.nextInt();

		// DEFINIR CONDICIONAL IF -> EVALUAR ECUACIÓN 2º GRADO
		if (a == 0) {
			x1 = -c / b;
			System.out.println("La ecuación solo tiene 1 solución: " + x1);
		} else {
			discriminante = Math.pow(b, 2) - 4 * a * c;

			if (discriminante < 0) {
				System.out.println("La ecuación no tiene solución.");
			} else {
				x1 = (-b + Math.sqrt(discriminante)) / 2 * a;
				x2 = (-b - Math.sqrt(discriminante)) / 2 * a;
				System.out.println("Solución 1: " + x1);
				System.out.println("Solución 2: " + x2);
			}
		}

		// CERRAR OBJETO SCANNER
		sc.close();
	}
}
