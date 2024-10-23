package boletinfor;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {

		// declarar variable para almacenar un num
		int num;

		// declarar e inicializar variable en 0 para almacenar la suma
		int suma = 0;

		// declarar e inicializar variable en 0 para almacenar la media
		double media = 0;

		// crear scanner
		Scanner sc = new Scanner(System.in);

		// crear bucle for
		for (int i = 1; i <= 10; i++) {

			// pedir num a usuario
			System.out.println("Introduzca un / otro nº: ");

			// leer num introducido por usuario
			num = sc.nextInt();

			// sumar num a variable suma
			suma += num;

		}

		// calcular media
		media = (double) (suma) / 10;

		// mostrar suma en pantalla
		System.out.println("\nLa media de los 10 nºs es: " + media);

		// cerrar scanner
		sc.close();
	}
}
