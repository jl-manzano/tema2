package boletindowhile;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {

		// declarar e inicializar variable en '1' para almacenar contador
		int contador = 1;

		// declarar variable para almacenar num
		int num;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// pedir valor a usuario
		System.out.println("Introduzca un nº para calcular su tabla de multiplicar: ");

		// leer nº introducido por el usuario
		num = sc.nextInt();

		// crear bucle do-while
		do {
			// se ejecuta el bloque instrucciones

			// imprimir producto línea a línea de tabla (*) de num introducido por usuario
			System.out.println(num + " * " + contador + " = " + (num * contador));

			// incrementar en 1 el contador
			contador++;

			// evaluación de condición mientras que contador sea <= 10
		} while (contador <= 10);

		// cerrar scanner
		sc.close();
	}
}
