package boletinfor;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {

		// declarar variable para almacenar un num
		int num;

		// declarar variable para almacenar factorial
		long factorial = 1;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// pedir num a usuario
		System.out.println("Introduzca un nº para calcular su factorial: ");

		// leer nº introducido por usuario
		num = sc.nextInt();

		// crear bucle for
		for (int i = num; i >= 2; i--) {

			// imprimir consola operacion
			System.out.print(i + " x ");
			// calcular factorial
			factorial *= i;
		}

		// imprimir el 1 que falta en la expresión
		System.out.println("1 = " + factorial);

		// cerrar scanner
		sc.close();

	}
}
