package boletinbucles;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		
		// declarar variable para almacenar numero A
		int numeroA;
		
		// declarar variable para almacenar numero B
		int numeroB;
		
		// declarar variable para almacenar el nº mayor de a y b
		int mayor;
		
		// declarar variable para almacenar el mcm e inicializar en 1 por si no se encuentra otro divisor común
		int mcm = 1;
		
		// declarar variable tipo 'boolean' para almacenar si se ha encontrado un mcd
		boolean enc = false;
		
		// crear scanner
		Scanner sc = new Scanner(System.in);
		
		// pedir numero A a usuario
		System.out.println("Introduzca un nº: ");
		
		// leer nº A introducido por usuario
		numeroA = sc.nextInt();
		
		// pedir numero B a usuario
		System.out.println("Introduzca otro nº: ");
		
		// leer nº B introducido por usuario
		numeroB = sc.nextInt();	
		
		// determinar nº mayor (a / b)
		mayor = Math.max(numeroA, numeroB);
		
		// crear bucle for
		while (!enc) {
			
			// definir condicional if -> comprobar si el nº es divisible entre los dos nºs
			if (mayor % numeroA == 0 && mayor % numeroB == 0) { // entra si el resto de las 2 divisiones es 0
				System.out.println("\nEl mínimo común múltiplo de " + numeroA + " y " + numeroB + " es " + mcm + ".");
				enc = true;
				
			} else {
			
			// incrementar en 1 variable mayor
			mayor++;
			
			}
		}
				
		// cerrar scanner
		sc.close();
	}
}
