package boletindowhile;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		
		// declarar e inicializar variable para almacenar contador
		int contador = 0;

		// declarar e inicializar variable en '1' para almacenar num1
		int num1 = 1;
		
		// declarar variable para almacenar num1
		int num2;
		
		// declarar e inicializar variable para almacenar suma de los nºs
		int suma = 0;
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// pedir valor a usuario
		System.out.println("Introduzca un nº: ");

		// leer nº introducido por el usuario
		num2 = sc.nextInt();
		
		// crear bucle do-while
		do {
			// se ejecuta el bloque instrucciones
			
			// calcular suma
			suma = suma + num1;
			
			// incrementar en 1 el num1
			num1++;
			
			// incrementar en 1 el contador
			contador++;

			// evaluación de condición mientras que contador sea < num2
		} while (contador < num2);
		
		// imprimir resultado (suma de los nºs entre nm1 y num2)
		System.out.println("La suma de los nºs comprendidos entre 1 y " + num2 + " es: " + suma);
		
		// cerrar scanner
		sc.close();
	}
}
